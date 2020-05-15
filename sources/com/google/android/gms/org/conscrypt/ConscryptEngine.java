package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ExternalSession;
import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.NativeSsl;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ConscryptEngine extends AbstractConscryptEngine implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
    private static final SSLEngineResult NEED_UNWRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_UNWRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static BufferAllocator defaultBufferAllocator = null;
    private ActiveSession activeSession;
    private BufferAllocator bufferAllocator = defaultBufferAllocator;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
        /* class com.google.android.gms.org.conscrypt.ConscryptEngine.C16301 */

        public ConscryptSession provideSession() {
            return ConscryptEngine.this.provideSession();
        }
    }));
    private boolean handshakeFinished;
    private HandshakeListener handshakeListener;
    private ByteBuffer lazyDirectBuffer;
    private int maxSealOverhead;
    private final NativeSsl.BioWrapper networkBio;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final ByteBuffer[] singleDstBuffer = new ByteBuffer[1];
    private final ByteBuffer[] singleSrcBuffer = new ByteBuffer[1];
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state = 0;

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.nullProvider();
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    private void beginHandshakeInternal() {
        int i = this.state;
        if (i == 0) {
            throw new IllegalStateException("Client/server mode must be set before handshake");
        } else if (i == 1) {
            transitionTo(2);
            try {
                this.ssl.initialize(getHostname(), this.channelIdPrivateKey);
                if (getUseClientMode()) {
                    NativeSslSession cachedSession = clientSessionContext().getCachedSession(getHostname(), getPeerPort(), this.sslParameters);
                    if (cachedSession != null) {
                        cachedSession.offerToResume(this.ssl);
                    }
                }
                this.maxSealOverhead = this.ssl.getMaxSealOverhead();
                handshake();
            } catch (IOException e) {
                if (e.getMessage().contains("unexpected CCS")) {
                    Platform.logEvent(String.format("ssl_unexpected_ccs: host=%s", getPeerHost()));
                }
                throw SSLUtils.toSSLHandshakeException(e);
            } catch (Throwable th) {
                closeAndFreeResources();
                throw th;
            }
        } else if (i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException("Engine has already been closed");
        }
    }

    private static int calcDstsLength(ByteBuffer[] byteBufferArr, int i, int i2) {
        boolean z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < byteBufferArr.length) {
            ByteBuffer byteBuffer = byteBufferArr[i3];
            if (byteBuffer != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "dsts[%d] is null", Integer.valueOf(i3));
            if (!byteBuffer.isReadOnly()) {
                if (i3 >= i && i3 < i + i2) {
                    i4 += byteBuffer.remaining();
                }
                i3++;
            } else {
                throw new ReadOnlyBufferException();
            }
        }
        return i4;
    }

    private static long calcSrcsLength(ByteBuffer[] byteBufferArr, int i, int i2) {
        long j = 0;
        while (i < i2) {
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (byteBuffer != null) {
                j += (long) byteBuffer.remaining();
                i++;
            } else {
                StringBuilder sb = new StringBuilder(25);
                sb.append("srcs[");
                sb.append(i);
                sb.append("] is null");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return j;
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeAll() {
        closeOutbound();
        closeInbound();
    }

    private void closeAndFreeResources() {
        transitionTo(8);
        if (!this.ssl.isClosed()) {
            this.ssl.close();
            this.networkBio.close();
        }
    }

    private SSLException convertException(Throwable th) {
        if ((th instanceof SSLHandshakeException) || !this.handshakeFinished) {
            return SSLUtils.toSSLHandshakeException(th);
        }
        return SSLUtils.toSSLException(th);
    }

    private long directByteBufferAddress(ByteBuffer byteBuffer, int i) {
        return NativeCrypto.getDirectBufferAddress(byteBuffer) + ((long) i);
    }

    private void finishHandshake() {
        this.handshakeFinished = true;
        HandshakeListener handshakeListener2 = this.handshakeListener;
        if (handshakeListener2 != null) {
            handshakeListener2.onHandshakeFinished();
        }
    }

    private void freeIfDone() {
        if (isInboundDone() && isOutboundDone()) {
            closeAndFreeResources();
        }
    }

    static BufferAllocator getDefaultBufferAllocator() {
        return defaultBufferAllocator;
    }

    private SSLEngineResult.Status getEngineStatus() {
        int i = this.state;
        if (i == 6 || i == 7 || i == 8) {
            return SSLEngineResult.Status.CLOSED;
        }
        return SSLEngineResult.Status.OK;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i) {
        return this.handshakeFinished ? SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING : pendingStatus(i);
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatusInternal() {
        if (this.handshakeFinished) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        int i = this.state;
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            case 2:
                return pendingStatus(pendingOutboundEncryptedBytes());
            case 3:
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            default:
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unexpected engine state: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    private ByteBuffer getOrCreateLazyDirectBuffer() {
        if (this.lazyDirectBuffer == null) {
            this.lazyDirectBuffer = ByteBuffer.allocateDirect(Math.max((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES, 16709));
        }
        this.lazyDirectBuffer.clear();
        return this.lazyDirectBuffer;
    }

    private SSLEngineResult.HandshakeStatus handshake() {
        try {
            int doHandshake = this.ssl.doHandshake();
            if (doHandshake == 2) {
                return pendingStatus(pendingOutboundEncryptedBytes());
            }
            if (doHandshake == 3) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            this.activeSession.onPeerCertificateAvailable(getPeerHost(), getPeerPort());
            finishHandshake();
            return SSLEngineResult.HandshakeStatus.FINISHED;
        } catch (SSLException e) {
            sendSSLShutdown();
            throw e;
        } catch (IOException e2) {
            sendSSLShutdown();
            throw e2;
        } catch (Exception e3) {
            throw SSLUtils.toSSLHandshakeException(e3);
        }
    }

    private boolean isHandshakeStarted() {
        int i = this.state;
        return (i == 0 || i == 1) ? false : true;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) {
        return (this.handshakeFinished || handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) ? handshakeStatus : handshake();
    }

    private SSLEngineResult newResult(int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) {
        SSLEngineResult.Status engineStatus = getEngineStatus();
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
            handshakeStatus = getHandshakeStatusInternal();
        }
        return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i, i2);
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            return NativeSsl.newInstance(sSLParametersImpl, conscryptEngine, conscryptEngine, conscryptEngine);
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    private SSLException newSslExceptionWithMessage(String str) {
        if (!this.handshakeFinished) {
            return new SSLException(str);
        }
        return new SSLHandshakeException(str);
    }

    private int pendingInboundCleartextBytes() {
        return this.ssl.getPendingReadableBytes();
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i) {
        return i <= 0 ? SSLEngineResult.HandshakeStatus.NEED_UNWRAP : SSLEngineResult.HandshakeStatus.NEED_WRAP;
    }

    /* access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession conscryptSession;
        synchronized (this.ssl) {
            if (this.state == 2) {
                conscryptSession = this.activeSession;
            } else {
                conscryptSession = SSLNullSession.getNullSession();
            }
        }
        return conscryptSession;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r1;
     */
    public ConscryptSession provideSession() {
        synchronized (this.ssl) {
            int i = this.state;
            if (i == 8) {
                ConscryptSession conscryptSession = this.closedSession;
                if (conscryptSession == null) {
                    conscryptSession = SSLNullSession.getNullSession();
                }
            } else if (i >= 3) {
                ActiveSession activeSession2 = this.activeSession;
                return activeSession2;
            } else {
                ConscryptSession nullSession = SSLNullSession.getNullSession();
                return nullSession;
            }
        }
    }

    private int readEncryptedData(ByteBuffer byteBuffer, int i) {
        try {
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < i) {
                return 0;
            }
            int min = Math.min(i, byteBuffer.limit() - position);
            if (!byteBuffer.isDirect()) {
                return readEncryptedDataHeap(byteBuffer, min);
            }
            int readEncryptedDataDirect = readEncryptedDataDirect(byteBuffer, position, min);
            if (readEncryptedDataDirect > 0) {
                byteBuffer.position(position + readEncryptedDataDirect);
            }
            return readEncryptedDataDirect;
        } catch (Exception e) {
            throw convertException(e);
        }
    }

    private int readEncryptedDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.networkBio.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    private int readEncryptedDataHeap(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBuffer2;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator2 = this.bufferAllocator;
            if (bufferAllocator2 != null) {
                allocatedBuffer = bufferAllocator2.allocateDirectBuffer(i);
                try {
                    byteBuffer2 = allocatedBuffer.nioBuffer();
                } catch (Throwable th) {
                    th = th;
                    if (allocatedBuffer != null) {
                        allocatedBuffer.release();
                    }
                    throw th;
                }
            } else {
                byteBuffer2 = getOrCreateLazyDirectBuffer();
            }
            int readEncryptedDataDirect = readEncryptedDataDirect(byteBuffer2, 0, Math.min(i, byteBuffer2.remaining()));
            if (readEncryptedDataDirect > 0) {
                byteBuffer2.position(readEncryptedDataDirect);
                byteBuffer2.flip();
                byteBuffer.put(byteBuffer2);
            }
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return readEncryptedDataDirect;
        } catch (Throwable th2) {
            th = th2;
            if (allocatedBuffer != null) {
            }
            throw th;
        }
    }

    private SSLEngineResult readPendingBytesFromBIO(ByteBuffer byteBuffer, int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) {
        try {
            int pendingOutboundEncryptedBytes = pendingOutboundEncryptedBytes();
            if (pendingOutboundEncryptedBytes <= 0) {
                return null;
            }
            if (byteBuffer.remaining() >= pendingOutboundEncryptedBytes) {
                int readEncryptedData = readEncryptedData(byteBuffer, pendingOutboundEncryptedBytes);
                if (readEncryptedData > 0) {
                    i2 += readEncryptedData;
                    pendingOutboundEncryptedBytes -= readEncryptedData;
                } else {
                    NativeCrypto.SSL_clear_error();
                }
                SSLEngineResult.Status engineStatus = getEngineStatus();
                if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                    handshakeStatus = getHandshakeStatus(pendingOutboundEncryptedBytes);
                }
                return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i, i2);
            }
            SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
            if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                handshakeStatus = getHandshakeStatus(pendingOutboundEncryptedBytes);
            }
            return new SSLEngineResult(status, mayFinishHandshake(handshakeStatus), i, i2);
        } catch (Exception e) {
            throw convertException(e);
        }
    }

    private int readPlaintextData(ByteBuffer byteBuffer) {
        try {
            int position = byteBuffer.position();
            int min = Math.min(16709, byteBuffer.limit() - position);
            if (!byteBuffer.isDirect()) {
                return readPlaintextDataHeap(byteBuffer, min);
            }
            int readPlaintextDataDirect = readPlaintextDataDirect(byteBuffer, position, min);
            if (readPlaintextDataDirect > 0) {
                byteBuffer.position(position + readPlaintextDataDirect);
            }
            return readPlaintextDataDirect;
        } catch (CertificateException e) {
            throw convertException(e);
        }
    }

    private int readPlaintextDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.ssl.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    private int readPlaintextDataHeap(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBuffer2;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator2 = this.bufferAllocator;
            if (bufferAllocator2 != null) {
                allocatedBuffer = bufferAllocator2.allocateDirectBuffer(i);
                try {
                    byteBuffer2 = allocatedBuffer.nioBuffer();
                } catch (Throwable th) {
                    th = th;
                    if (allocatedBuffer != null) {
                        allocatedBuffer.release();
                    }
                    throw th;
                }
            } else {
                byteBuffer2 = getOrCreateLazyDirectBuffer();
            }
            int readPlaintextDataDirect = readPlaintextDataDirect(byteBuffer2, 0, Math.min(i, byteBuffer2.remaining()));
            if (readPlaintextDataDirect > 0) {
                byteBuffer2.position(readPlaintextDataDirect);
                byteBuffer2.flip();
                byteBuffer.put(byteBuffer2);
            }
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return readPlaintextDataDirect;
        } catch (Throwable th2) {
            th = th2;
            if (allocatedBuffer != null) {
            }
            throw th;
        }
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    private void sendSSLShutdown() {
        try {
            this.ssl.shutdown();
        } catch (IOException e) {
        }
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    static void setDefaultBufferAllocator(BufferAllocator bufferAllocator2) {
        defaultBufferAllocator = bufferAllocator2;
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private void transitionTo(int i) {
        int i2;
        if (i == 2) {
            this.handshakeFinished = false;
            this.activeSession = new ActiveSession(this.ssl, this.sslParameters.getSessionContext());
        } else if (i == 8 && !this.ssl.isClosed() && (i2 = this.state) >= 2 && i2 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i;
    }

    private int writeEncryptedData(ByteBuffer byteBuffer, int i) {
        int i2;
        try {
            int position = byteBuffer.position();
            if (!byteBuffer.isDirect()) {
                i2 = writeEncryptedDataHeap(byteBuffer, position, i);
            } else {
                i2 = writeEncryptedDataDirect(byteBuffer, position, i);
            }
            if (i2 > 0) {
                byteBuffer.position(position + i2);
            }
            return i2;
        } catch (IOException e) {
            throw new SSLException(e);
        }
    }

    private int writeEncryptedDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.networkBio.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    private int writeEncryptedDataHeap(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator2 = this.bufferAllocator;
            if (bufferAllocator2 != null) {
                allocatedBuffer = bufferAllocator2.allocateDirectBuffer(i2);
                try {
                    byteBuffer2 = allocatedBuffer.nioBuffer();
                } catch (Throwable th) {
                    th = th;
                    if (allocatedBuffer != null) {
                        allocatedBuffer.release();
                    }
                    throw th;
                }
            } else {
                byteBuffer2 = getOrCreateLazyDirectBuffer();
            }
            int limit = byteBuffer.limit();
            int min = Math.min(Math.min(limit - i, i2), byteBuffer2.remaining());
            byteBuffer.limit(i + min);
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(limit);
            byteBuffer.position(i);
            int writeEncryptedDataDirect = writeEncryptedDataDirect(byteBuffer2, 0, min);
            byteBuffer.position(i);
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return writeEncryptedDataDirect;
        } catch (Throwable th2) {
            th = th2;
            if (allocatedBuffer != null) {
            }
            throw th;
        }
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i) {
        int i2;
        try {
            int position = byteBuffer.position();
            if (!byteBuffer.isDirect()) {
                i2 = writePlaintextDataHeap(byteBuffer, position, i);
            } else {
                i2 = writePlaintextDataDirect(byteBuffer, position, i);
            }
            if (i2 > 0) {
                byteBuffer.position(position + i2);
            }
            return i2;
        } catch (Exception e) {
            throw convertException(e);
        }
    }

    private int writePlaintextDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.ssl.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    private int writePlaintextDataHeap(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator2 = this.bufferAllocator;
            if (bufferAllocator2 != null) {
                allocatedBuffer = bufferAllocator2.allocateDirectBuffer(i2);
                try {
                    byteBuffer2 = allocatedBuffer.nioBuffer();
                } catch (Throwable th) {
                    th = th;
                    if (allocatedBuffer != null) {
                        allocatedBuffer.release();
                    }
                    throw th;
                }
            } else {
                byteBuffer2 = getOrCreateLazyDirectBuffer();
            }
            int limit = byteBuffer.limit();
            int min = Math.min(i2, byteBuffer2.remaining());
            byteBuffer.limit(i + min);
            byteBuffer2.put(byteBuffer);
            byteBuffer2.flip();
            byteBuffer.limit(limit);
            byteBuffer.position(i);
            int writePlaintextDataDirect = writePlaintextDataDirect(byteBuffer2, 0, min);
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return writePlaintextDataDirect;
        } catch (Throwable th2) {
            th = th2;
            if (allocatedBuffer != null) {
            }
            throw th;
        }
    }

    public void beginHandshake() {
        synchronized (this.ssl) {
            beginHandshakeInternal();
        }
    }

    public String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        if (x509KeyManager instanceof X509ExtendedKeyManager) {
            return ((X509ExtendedKeyManager) x509KeyManager).chooseEngineClientAlias(strArr, x500PrincipalArr, this);
        }
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, null);
    }

    public String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, this);
    }

    public String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        if (x509KeyManager instanceof X509ExtendedKeyManager) {
            return ((X509ExtendedKeyManager) x509KeyManager).chooseEngineServerAlias(str, null, this);
        }
        return x509KeyManager.chooseServerAlias(str, null, null);
    }

    public String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint(this);
    }

    public void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    public void closeInbound() {
        synchronized (this.ssl) {
            int i = this.state;
            if (i != 8 && i != 6) {
                if (isHandshakeStarted()) {
                    if (this.state != 7) {
                        transitionTo(6);
                    } else {
                        transitionTo(8);
                    }
                    freeIfDone();
                } else {
                    closeAndFreeResources();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return;
     */
    public void closeOutbound() {
        synchronized (this.ssl) {
            int i = this.state;
            if (i != 8 && i != 7) {
                if (isHandshakeStarted()) {
                    if (this.state != 6) {
                        transitionTo(7);
                    } else {
                        transitionTo(8);
                    }
                    sendSSLShutdown();
                    freeIfDone();
                } else {
                    closeAndFreeResources();
                }
            }
        }
    }

    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        synchronized (this.ssl) {
            int i2 = this.state;
            if (i2 < 3 || i2 == 8) {
                return null;
            }
            return this.ssl.exportKeyingMaterial(str, bArr, i);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            transitionTo(8);
        } finally {
            super.finalize();
        }
    }

    public String getApplicationProtocol() {
        return SSLUtils.toProtocolString(this.ssl.getApplicationProtocol());
    }

    public String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    public byte[] getChannelId() {
        byte[] tlsChannelId;
        synchronized (this.ssl) {
            if (getUseClientMode()) {
                throw new IllegalStateException("Not allowed in client mode");
            } else if (!isHandshakeStarted()) {
                tlsChannelId = this.ssl.getTlsChannelId();
            } else {
                throw new IllegalStateException("Channel ID is only available after handshake completes");
            }
        }
        return tlsChannelId;
    }

    public Runnable getDelegatedTask() {
        return null;
    }

    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    public String getHandshakeApplicationProtocol() {
        String applicationProtocol;
        synchronized (this.ssl) {
            applicationProtocol = this.state == 2 ? getApplicationProtocol() : null;
        }
        return applicationProtocol;
    }

    public String getHostname() {
        String str = this.peerHostname;
        return str == null ? this.peerInfoProvider.getHostname() : str;
    }

    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    public SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, this);
    }

    public String getPeerHost() {
        String str = this.peerHostname;
        return str == null ? this.peerInfoProvider.getHostnameOrIP() : str;
    }

    public int getPeerPort() {
        return this.peerInfoProvider.getPort();
    }

    public SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    public SSLSession getSession() {
        return this.externalSession;
    }

    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public SSLSession handshakeSession() {
        synchronized (this.ssl) {
            if (this.state != 2) {
                return null;
            }
            SSLSession wrapSSLSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
                /* class com.google.android.gms.org.conscrypt.ConscryptEngine.C16312 */

                public ConscryptSession provideSession() {
                    return ConscryptEngine.this.provideHandshakeSession();
                }
            }));
            return wrapSSLSession;
        }
    }

    public boolean isInboundDone() {
        boolean z;
        synchronized (this.ssl) {
            int i = this.state;
            z = false;
            if (i != 8) {
                if (i != 6 && !this.ssl.wasShutdownReceived()) {
                }
            }
            if (pendingInboundCleartextBytes() == 0) {
                z = true;
            }
        }
        return z;
    }

    public boolean isOutboundDone() {
        boolean z;
        synchronized (this.ssl) {
            int i = this.state;
            z = false;
            if (i != 8) {
                if (i != 7 && !this.ssl.wasShutdownSent()) {
                }
            }
            if (pendingOutboundEncryptedBytes() == 0) {
                z = true;
            }
        }
        return z;
    }

    public int maxSealOverhead() {
        return this.maxSealOverhead;
    }

    public void onNewSessionEstablished(long j) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j), this.activeSession));
        } catch (Exception e) {
        }
    }

    public void onSSLStateChange(int i, int i2) {
        synchronized (this.ssl) {
            if (i == 16) {
                transitionTo(2);
            } else if (i == 32) {
                int i3 = this.state;
                if (i3 != 2) {
                    if (i3 != 4) {
                        StringBuilder sb = new StringBuilder(45);
                        sb.append("Completed handshake while in mode ");
                        sb.append(i3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                transitionTo(3);
            }
        }
    }

    public int pendingOutboundEncryptedBytes() {
        return this.networkBio.getPendingWrittenBytes();
    }

    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    public long serverSessionRequested(byte[] bArr) {
        return 0;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter;
        if (applicationProtocolSelector != null) {
            applicationProtocolSelectorAdapter = new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector);
        } else {
            applicationProtocolSelectorAdapter = null;
        }
        setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    public void setBufferAllocator(BufferAllocator bufferAllocator2) {
        synchronized (this.ssl) {
            if (!isHandshakeStarted()) {
                this.bufferAllocator = bufferAllocator2;
            } else {
                throw new IllegalStateException("Could not set buffer allocator after the initial handshake has begun.");
            }
        }
    }

    public void setChannelIdEnabled(boolean z) {
        synchronized (this.ssl) {
            if (getUseClientMode()) {
                throw new IllegalStateException("Not allowed in client mode");
            } else if (!isHandshakeStarted()) {
                this.sslParameters.channelIdEnabled = z;
            } else {
                throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
            }
        }
    }

    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (getUseClientMode()) {
            synchronized (this.ssl) {
                if (!isHandshakeStarted()) {
                    ECParameterSpec eCParameterSpec = null;
                    if (privateKey == null) {
                        this.sslParameters.channelIdEnabled = false;
                        this.channelIdPrivateKey = null;
                        return;
                    }
                    this.sslParameters.channelIdEnabled = true;
                    try {
                        if (privateKey instanceof ECKey) {
                            eCParameterSpec = ((ECKey) privateKey).getParams();
                        }
                        if (eCParameterSpec == null) {
                            eCParameterSpec = OpenSSLECGroupContext.getCurveByName("prime256v1").getECParameterSpec();
                        }
                        this.channelIdPrivateKey = OpenSSLKey.fromECPrivateKeyForTLSStackOnly(privateKey, eCParameterSpec);
                    } catch (InvalidKeyException e) {
                    }
                    return;
                }
                throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
            }
        }
        throw new IllegalStateException("Not allowed in server mode");
    }

    public void setEnableSessionCreation(boolean z) {
        this.sslParameters.setEnableSessionCreation(z);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    public void setHandshakeListener(HandshakeListener handshakeListener2) {
        synchronized (this.ssl) {
            if (!isHandshakeStarted()) {
                this.handshakeListener = handshakeListener2;
            } else {
                throw new IllegalStateException("Handshake listener must be set before starting the handshake.");
            }
        }
    }

    public void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        this.peerHostname = str;
    }

    public void setNeedClientAuth(boolean z) {
        this.sslParameters.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    public void setUseClientMode(boolean z) {
        synchronized (this.ssl) {
            if (!isHandshakeStarted()) {
                transitionTo(1);
                this.sslParameters.setUseClientMode(z);
            } else {
                int i = this.state;
                StringBuilder sb = new StringBuilder(57);
                sb.append("Can not change mode after handshake: state == ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public void setUseSessionTickets(boolean z) {
        this.sslParameters.setUseSessionTickets(z);
    }

    public void setWantClientAuth(boolean z) {
        this.sslParameters.setWantClientAuth(z);
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                unwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
                resetSingleSrcBuffer();
                resetSingleDstBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                resetSingleDstBuffer();
                throw th;
            }
        }
        return unwrap;
    }

    public void verifyCertificateChain(byte[][] bArr, String str) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] decodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager != null) {
                        this.activeSession.onPeerCertificatesReceived(getPeerHost(), getPeerPort(), decodeX509CertificateChain);
                        if (!getUseClientMode()) {
                            Platform.checkClientTrusted(x509TrustManager, decodeX509CertificateChain, decodeX509CertificateChain[0].getPublicKey().getAlgorithm(), this);
                            return;
                        } else {
                            Platform.checkServerTrusted(x509TrustManager, decodeX509CertificateChain, str, this);
                            return;
                        }
                    } else {
                        throw new CertificateException("No X.509 TrustManager");
                    }
                }
            } catch (CertificateException e) {
                throw e;
            } catch (Exception e2) {
                throw new CertificateException(e2);
            }
        }
        throw new CertificateException("Peer sent no certificate");
    }

    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult wrap;
        synchronized (this.ssl) {
            try {
                wrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
                resetSingleSrcBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                throw th;
            }
        }
        return wrap;
    }

    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        SSLEngineResult.HandshakeStatus handshakeStatusInternal;
        synchronized (this.ssl) {
            handshakeStatusInternal = getHandshakeStatusInternal();
        }
        return handshakeStatusInternal;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl, PeerInfoProvider peerInfoProvider2) {
        this.sslParameters = sSLParametersImpl;
        Preconditions.checkNotNull(peerInfoProvider2, "peerInfoProvider");
        this.peerInfoProvider = peerInfoProvider2;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                unwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
                resetSingleSrcBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                throw th;
            }
        }
        return unwrap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c3, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ea, code lost:
        return r12;
     */
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        boolean z;
        boolean z2;
        if (byteBufferArr != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "srcs is null");
        if (byteBuffer != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "dst is null");
        int i3 = i2 + i;
        Preconditions.checkPositionIndexes(i, i3, byteBufferArr.length);
        if (!byteBuffer.isReadOnly()) {
            synchronized (this.ssl) {
                int i4 = this.state;
                if (i4 != 0) {
                    if (i4 == 1) {
                        beginHandshakeInternal();
                    } else if (i4 == 7 || i4 == 8) {
                        SSLEngineResult readPendingBytesFromBIO = readPendingBytesFromBIO(byteBuffer, 0, 0, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING);
                        if (readPendingBytesFromBIO != null) {
                            freeIfDone();
                            return readPendingBytesFromBIO;
                        }
                        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.CLOSED, getHandshakeStatusInternal(), 0, 0);
                        return sSLEngineResult;
                    }
                    SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                    if (!this.handshakeFinished) {
                        handshakeStatus = handshake();
                        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                            SSLEngineResult sSLEngineResult2 = NEED_UNWRAP_OK;
                            return sSLEngineResult2;
                        } else if (this.state == 8) {
                            SSLEngineResult sSLEngineResult3 = NEED_UNWRAP_CLOSED;
                            return sSLEngineResult3;
                        }
                    }
                    int i5 = i;
                    int i6 = 0;
                    while (i5 < i3) {
                        ByteBuffer byteBuffer2 = byteBufferArr[i5];
                        if (byteBuffer2 != null) {
                            if (i6 != 16384) {
                                i6 += byteBuffer2.remaining();
                                if (i6 <= 16384) {
                                    if (i6 < 0) {
                                    }
                                }
                                i6 = AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            }
                            i5++;
                        } else {
                            StringBuilder sb = new StringBuilder(25);
                            sb.append("srcs[");
                            sb.append(i5);
                            sb.append("] is null");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (byteBuffer.remaining() >= SSLUtils.calculateOutNetBufSize(i6)) {
                        int i7 = 0;
                        int i8 = 0;
                        loop1:
                        while (true) {
                            if (i >= i3) {
                                break;
                            }
                            ByteBuffer byteBuffer3 = byteBufferArr[i];
                            Preconditions.checkArgument(byteBuffer3 != null, "srcs[%d] is null", Integer.valueOf(i));
                            while (byteBuffer3.hasRemaining()) {
                                int writePlaintextData = writePlaintextData(byteBuffer3, Math.min(byteBuffer3.remaining(), 16384 - i8));
                                if (writePlaintextData > 0) {
                                    i8 += writePlaintextData;
                                    SSLEngineResult readPendingBytesFromBIO2 = readPendingBytesFromBIO(byteBuffer, i8, i7, handshakeStatus);
                                    if (readPendingBytesFromBIO2 != null) {
                                        if (readPendingBytesFromBIO2.getStatus() != SSLEngineResult.Status.OK) {
                                            return readPendingBytesFromBIO2;
                                        }
                                        i7 = readPendingBytesFromBIO2.bytesProduced();
                                        continue;
                                    }
                                    if (i8 == 16384) {
                                        break loop1;
                                    }
                                } else {
                                    int error = this.ssl.getError(writePlaintextData);
                                    if (error == 2) {
                                        SSLEngineResult readPendingBytesFromBIO3 = readPendingBytesFromBIO(byteBuffer, i8, i7, handshakeStatus);
                                        if (readPendingBytesFromBIO3 == null) {
                                            readPendingBytesFromBIO3 = new SSLEngineResult(getEngineStatus(), SSLEngineResult.HandshakeStatus.NEED_UNWRAP, i8, i7);
                                        }
                                    } else if (error == 3) {
                                        SSLEngineResult readPendingBytesFromBIO4 = readPendingBytesFromBIO(byteBuffer, i8, i7, handshakeStatus);
                                        if (readPendingBytesFromBIO4 == null) {
                                            readPendingBytesFromBIO4 = NEED_WRAP_CLOSED;
                                        }
                                    } else if (error == 6) {
                                        closeAll();
                                        SSLEngineResult readPendingBytesFromBIO5 = readPendingBytesFromBIO(byteBuffer, i8, i7, handshakeStatus);
                                        if (readPendingBytesFromBIO5 == null) {
                                            readPendingBytesFromBIO5 = CLOSED_NOT_HANDSHAKING;
                                        }
                                    } else {
                                        sendSSLShutdown();
                                        throw newSslExceptionWithMessage("SSL_write");
                                    }
                                }
                            }
                            i++;
                        }
                        if (i8 == 0) {
                            SSLEngineResult readPendingBytesFromBIO6 = readPendingBytesFromBIO(byteBuffer, 0, i7, handshakeStatus);
                            if (readPendingBytesFromBIO6 != null) {
                                return readPendingBytesFromBIO6;
                            }
                        }
                        SSLEngineResult newResult = newResult(i8, i7, handshakeStatus);
                        return newResult;
                    }
                    SSLEngineResult sSLEngineResult4 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatusInternal(), 0, 0);
                    return sSLEngineResult4;
                }
                throw new IllegalStateException("Client/server mode must be set before calling wrap");
            }
        }
        throw new ReadOnlyBufferException();
    }

    public ConscryptEngine(String str, int i, SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.forHostAndPort(str, i);
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                unwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i, i2);
                resetSingleSrcBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                throw th;
            }
        }
        return unwrap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0156, code lost:
        sendSSLShutdown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x015d, code lost:
        throw convertException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x015e, code lost:
        closeAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0165, code lost:
        throw convertException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x016d, code lost:
        sendSSLShutdown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0174, code lost:
        throw convertException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:77:0x00f3, B:84:0x0106] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:77:0x00f3, B:91:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fa A[ExcHandler: IOException (r0v23 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:77:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fc A[ExcHandler: EOFException (r0v21 'e' java.io.EOFException A[CUSTOM_DECLARE]), Splitter:B:77:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0100 A[ExcHandler: SSLException (r0v19 'e' javax.net.ssl.SSLException A[CUSTOM_DECLARE]), Splitter:B:77:0x00f3] */
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        ByteBuffer[] byteBufferArr3 = byteBufferArr;
        int i7 = i;
        ByteBuffer[] byteBufferArr4 = byteBufferArr2;
        int i8 = i3;
        int i9 = 0;
        if (byteBufferArr3 != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "srcs is null");
        if (byteBufferArr4 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "dsts is null");
        int i10 = i7 + i2;
        Preconditions.checkPositionIndexes(i7, i10, byteBufferArr3.length);
        int i11 = i8 + i4;
        Preconditions.checkPositionIndexes(i8, i11, byteBufferArr4.length);
        int calcDstsLength = calcDstsLength(byteBufferArr2, i3, i4);
        long calcSrcsLength = calcSrcsLength(byteBufferArr3, i7, i10);
        synchronized (this.ssl) {
            int i12 = this.state;
            if (i12 != 0) {
                if (i12 == 1) {
                    beginHandshakeInternal();
                } else if (i12 == 6 || i12 == 8) {
                    freeIfDone();
                    SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.CLOSED, getHandshakeStatusInternal(), 0, 0);
                    return sSLEngineResult;
                }
                SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                if (!this.handshakeFinished) {
                    handshakeStatus = handshake();
                    if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                        SSLEngineResult sSLEngineResult2 = NEED_WRAP_OK;
                        return sSLEngineResult2;
                    } else if (this.state == 8) {
                        SSLEngineResult sSLEngineResult3 = NEED_WRAP_CLOSED;
                        return sSLEngineResult3;
                    }
                }
                int pendingInboundCleartextBytes = pendingInboundCleartextBytes();
                if (calcSrcsLength <= 0) {
                    if (pendingInboundCleartextBytes <= 0) {
                        SSLEngineResult sSLEngineResult4 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                        return sSLEngineResult4;
                    }
                    i5 = 0;
                } else if (pendingInboundCleartextBytes > 0) {
                    i5 = 0;
                } else if (calcSrcsLength >= 5) {
                    i5 = SSLUtils.getEncryptedPacketLength(byteBufferArr, i);
                    if (i5 < 0) {
                        throw new SSLException("Unable to parse TLS packet header");
                    } else if (calcSrcsLength < ((long) i5)) {
                        SSLEngineResult sSLEngineResult5 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                        return sSLEngineResult5;
                    }
                } else {
                    SSLEngineResult sSLEngineResult6 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                    return sSLEngineResult6;
                }
                if (i5 <= 0) {
                    i6 = 0;
                } else if (i7 < i10) {
                    i6 = 0;
                    while (true) {
                        ByteBuffer byteBuffer = byteBufferArr3[i7];
                        int remaining = byteBuffer.remaining();
                        if (remaining != 0) {
                            int writeEncryptedData = writeEncryptedData(byteBuffer, Math.min(i5, remaining));
                            if (writeEncryptedData <= 0) {
                                NativeCrypto.SSL_clear_error();
                                break;
                            }
                            i6 += writeEncryptedData;
                            i5 -= writeEncryptedData;
                            if (i5 != 0 && writeEncryptedData == remaining) {
                                i7++;
                            }
                        } else {
                            i7++;
                        }
                        if (i7 >= i10) {
                            break;
                        }
                    }
                } else {
                    i6 = 0;
                }
                if (calcDstsLength <= 0) {
                    try {
                        this.ssl.forceRead();
                    } catch (SSLException e) {
                    } catch (InterruptedIOException e2) {
                        SSLEngineResult newResult = newResult(i6, i9, handshakeStatus);
                        return newResult;
                    } catch (EOFException e3) {
                    } catch (IOException e4) {
                    }
                } else {
                    while (i8 < i11) {
                        ByteBuffer byteBuffer2 = byteBufferArr4[i8];
                        if (byteBuffer2.hasRemaining()) {
                            int readPlaintextData = readPlaintextData(byteBuffer2);
                            if (readPlaintextData > 0) {
                                i9 += readPlaintextData;
                                if (byteBuffer2.hasRemaining()) {
                                    break;
                                }
                            } else if (readPlaintextData == -6) {
                                closeInbound();
                                sendSSLShutdown();
                                SSLEngineResult sSLEngineResult7 = new SSLEngineResult(SSLEngineResult.Status.CLOSED, pendingOutboundEncryptedBytes() <= 0 ? SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING : SSLEngineResult.HandshakeStatus.NEED_WRAP, i6, i9);
                                return sSLEngineResult7;
                            } else if (readPlaintextData == -3 || readPlaintextData == -2) {
                                SSLEngineResult newResult2 = newResult(i6, i9, handshakeStatus);
                                return newResult2;
                            } else {
                                sendSSLShutdown();
                                throw newSslExceptionWithMessage("SSL_read");
                            }
                        }
                        i8++;
                    }
                }
                if (this.handshakeFinished) {
                    if (pendingInboundCleartextBytes() > 0) {
                        SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
                        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                            handshakeStatus = getHandshakeStatusInternal();
                        }
                        SSLEngineResult sSLEngineResult8 = new SSLEngineResult(status, mayFinishHandshake(handshakeStatus), i6, i9);
                        return sSLEngineResult8;
                    }
                }
                SSLEngineResult newResult3 = newResult(i6, i9, handshakeStatus);
                return newResult3;
            }
            throw new IllegalStateException("Client/server mode must be set before calling unwrap");
        }
    }

    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        boolean z = true;
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        if (byteBufferArr2 == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "dsts is null");
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }
}
