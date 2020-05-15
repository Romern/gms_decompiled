package com.google.android.gms.org.conscrypt;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ConscryptEngineSocket extends OpenSSLSocketImpl {
    private static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocate(0);
    /* access modifiers changed from: private */
    public BufferAllocator bufferAllocator = ConscryptEngine.getDefaultBufferAllocator();
    /* access modifiers changed from: private */
    public final ConscryptEngine engine;
    /* access modifiers changed from: private */
    public final Object handshakeLock = new Object();

    /* renamed from: in */
    private SSLInputStream f81424in;
    private SSLOutputStream out;
    /* access modifiers changed from: private */
    public int state = 0;
    /* access modifiers changed from: private */
    public final Object stateLock = new Object();

    /* renamed from: com.google.android.gms.org.conscrypt.ConscryptEngineSocket$3 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16343 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$Status;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$Status = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.OK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$Status[SSLEngineResult.Status.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class SSLOutputStream extends OutputStream {
        private OutputStream socketOutputStream;
        private final ByteBuffer target;
        private final int targetArrayOffset;
        private final Object writeLock = new Object();

        public SSLOutputStream() {
            ByteBuffer allocate = ByteBuffer.allocate(ConscryptEngineSocket.this.engine.getSession().getPacketBufferSize());
            this.target = allocate;
            this.targetArrayOffset = allocate.arrayOffset();
        }

        /* access modifiers changed from: private */
        public void flushInternal() {
            ConscryptEngineSocket.this.checkOpen();
            init();
            this.socketOutputStream.flush();
        }

        private void init() {
            if (this.socketOutputStream == null) {
                this.socketOutputStream = ConscryptEngineSocket.this.getUnderlyingOutputStream();
            }
        }

        /* access modifiers changed from: private */
        public void writeInternal(ByteBuffer byteBuffer) {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            int remaining = byteBuffer.remaining();
            do {
                this.target.clear();
                SSLEngineResult wrap = ConscryptEngineSocket.this.engine.wrap(byteBuffer, this.target);
                if (wrap.getStatus() != SSLEngineResult.Status.OK) {
                    String valueOf = String.valueOf(wrap.getStatus());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Unexpected engine result ");
                    sb.append(valueOf);
                    throw new SSLException(sb.toString());
                } else if (this.target.position() == wrap.bytesProduced()) {
                    remaining -= wrap.bytesConsumed();
                    if (remaining == byteBuffer.remaining()) {
                        this.target.flip();
                        writeToSocket();
                    } else {
                        throw new SSLException("Engine did not read the correct number of bytes");
                    }
                } else {
                    int bytesProduced = wrap.bytesProduced();
                    int position = this.target.position();
                    StringBuilder sb2 = new StringBuilder(73);
                    sb2.append("Engine bytesProduced ");
                    sb2.append(bytesProduced);
                    sb2.append(" does not match bytes written ");
                    sb2.append(position);
                    throw new SSLException(sb2.toString());
                }
            } while (remaining > 0);
        }

        private void writeToSocket() {
            this.socketOutputStream.write(this.target.array(), this.targetArrayOffset, this.target.limit());
        }

        public void close() {
            ConscryptEngineSocket.this.close();
        }

        public void flush() {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                flushInternal();
            }
        }

        public void write(int i) {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                write(new byte[]{(byte) i});
            }
        }

        public void write(byte[] bArr) {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr));
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.writeLock) {
                writeInternal(ByteBuffer.wrap(bArr, i, i2));
            }
        }
    }

    public ConscryptEngineSocket(SSLParametersImpl sSLParametersImpl) {
        this.engine = newEngine(sSLParametersImpl, this);
    }

    /* access modifiers changed from: private */
    public void doHandshake() {
        boolean z = false;
        while (!z) {
            try {
                int i = C16343.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[this.engine.getHandshakeStatus().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.out.writeInternal(EMPTY_BUFFER);
                        this.out.flushInternal();
                    } else if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                String valueOf = String.valueOf(this.engine.getHandshakeStatus());
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                                sb.append("Unknown handshake status: ");
                                sb.append(valueOf);
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                        z = true;
                    } else {
                        throw new IllegalStateException("Engine tasks are unsupported");
                    }
                } else if (this.f81424in.processDataFromSocket(EmptyArray.BYTE, 0, 0) < 0) {
                    throw SSLUtils.toSSLHandshakeException(new EOFException());
                }
            } catch (SSLException e) {
                drainOutgoingQueue();
                close();
                throw e;
            } catch (IOException e2) {
                close();
                throw e2;
            } catch (Exception e3) {
                close();
                throw SSLUtils.toSSLHandshakeException(e3);
            }
        }
    }

    private void drainOutgoingQueue() {
        while (this.engine.pendingOutboundEncryptedBytes() > 0) {
            try {
                this.out.writeInternal(EMPTY_BUFFER);
                this.out.flushInternal();
            } catch (IOException e) {
                return;
            }
        }
    }

    private static X509TrustManager getDelegatingTrustManager(X509TrustManager x509TrustManager, final ConscryptEngineSocket conscryptEngineSocket) {
        if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
            return x509TrustManager;
        }
        final X509ExtendedTrustManager x509ExtendedTrustManager = (X509ExtendedTrustManager) x509TrustManager;
        return new X509ExtendedTrustManager() {
            /* class com.google.android.gms.org.conscrypt.ConscryptEngineSocket.C16332 */

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str);
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str);
            }

            public X509Certificate[] getAcceptedIssuers() {
                return x509ExtendedTrustManager.getAcceptedIssuers();
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                throw new AssertionError("Should not be called");
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
                throw new AssertionError("Should not be called");
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, conscryptEngineSocket);
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
                x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, conscryptEngineSocket);
            }
        };
    }

    /* access modifiers changed from: private */
    public InputStream getUnderlyingInputStream() {
        return super.getInputStream();
    }

    /* access modifiers changed from: private */
    public OutputStream getUnderlyingOutputStream() {
        return super.getOutputStream();
    }

    private static ConscryptEngine newEngine(SSLParametersImpl sSLParametersImpl, ConscryptEngineSocket conscryptEngineSocket) {
        Platform.supportsX509ExtendedTrustManager();
        ConscryptEngine conscryptEngine = new ConscryptEngine(sSLParametersImpl.cloneWithTrustManager(getDelegatingTrustManager(sSLParametersImpl.getX509TrustManager(), conscryptEngineSocket)), conscryptEngineSocket.peerInfoProvider());
        conscryptEngine.setHandshakeListener(new HandshakeListener() {
            /* class com.google.android.gms.org.conscrypt.ConscryptEngineSocket.C16321 */

            public void onHandshakeFinished() {
                ConscryptEngineSocket.this.onHandshakeFinished();
            }
        });
        conscryptEngine.setUseClientMode(sSLParametersImpl.getUseClientMode());
        return conscryptEngine;
    }

    /* access modifiers changed from: private */
    public void onHandshakeFinished() {
        boolean z;
        synchronized (this.stateLock) {
            int i = this.state;
            if (i != 8) {
                if (i == 2) {
                    this.state = 4;
                } else if (i == 3) {
                    this.state = 5;
                }
                this.stateLock.notifyAll();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            notifyHandshakeCompletedListeners();
        }
    }

    private void waitForHandshake() {
        startHandshake();
        synchronized (this.stateLock) {
            while (true) {
                int i = this.state;
                if (i != 5 && i != 4) {
                    if (i != 8) {
                        try {
                            this.stateLock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted waiting for handshake", e);
                        }
                    } else {
                        throw new SocketException("Socket is closed");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r3.engine.closeInbound();
        r3.engine.closeOutbound();
        r0 = r3.f81424in;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r3.engine.closeInbound();
        r3.engine.closeOutbound();
        r1 = r3.f81424in;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        super.close();
     */
    public final void close() {
        Object obj = this.stateLock;
        if (obj != null) {
            synchronized (obj) {
                if (this.state != 8) {
                    this.state = 8;
                    this.stateLock.notifyAll();
                }
            }
        }
    }

    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        return this.engine.exportKeyingMaterial(str, bArr, i);
    }

    public final SSLSession getActiveSession() {
        return this.engine.getSession();
    }

    public final String getApplicationProtocol() {
        return this.engine.getApplicationProtocol();
    }

    public final String[] getApplicationProtocols() {
        return this.engine.getApplicationProtocols();
    }

    public final byte[] getChannelId() {
        return this.engine.getChannelId();
    }

    public final boolean getEnableSessionCreation() {
        return this.engine.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.engine.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.engine.getEnabledProtocols();
    }

    public final String getHandshakeApplicationProtocol() {
        return this.engine.getHandshakeApplicationProtocol();
    }

    public final SSLSession getHandshakeSession() {
        return this.engine.handshakeSession();
    }

    public final InputStream getInputStream() {
        checkOpen();
        waitForHandshake();
        return this.f81424in;
    }

    public final boolean getNeedClientAuth() {
        return this.engine.getNeedClientAuth();
    }

    public final OutputStream getOutputStream() {
        checkOpen();
        waitForHandshake();
        return this.out;
    }

    public final SSLParameters getSSLParameters() {
        return this.engine.getSSLParameters();
    }

    public final SSLSession getSession() {
        if (isConnected()) {
            try {
                waitForHandshake();
            } catch (IOException e) {
            }
        }
        return this.engine.getSession();
    }

    public final String[] getSupportedCipherSuites() {
        return this.engine.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.engine.getSupportedProtocols();
    }

    public byte[] getTlsUnique() {
        return this.engine.getTlsUnique();
    }

    public final boolean getUseClientMode() {
        return this.engine.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.engine.getWantClientAuth();
    }

    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter;
        if (applicationProtocolSelector != null) {
            applicationProtocolSelectorAdapter = new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector);
        } else {
            applicationProtocolSelectorAdapter = null;
        }
        setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public final void setApplicationProtocols(String[] strArr) {
        this.engine.setApplicationProtocols(strArr);
    }

    public void setBufferAllocator(BufferAllocator bufferAllocator2) {
        this.engine.setBufferAllocator(bufferAllocator2);
        this.bufferAllocator = bufferAllocator2;
    }

    public final void setChannelIdEnabled(boolean z) {
        this.engine.setChannelIdEnabled(z);
    }

    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.engine.setChannelIdPrivateKey(privateKey);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.engine.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.engine.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        this.engine.setEnabledProtocols(strArr);
    }

    public final void setHostname(String str) {
        this.engine.setHostname(str);
        super.setHostname(str);
    }

    public final void setNeedClientAuth(boolean z) {
        this.engine.setNeedClientAuth(z);
    }

    public final void setSSLParameters(SSLParameters sSLParameters) {
        this.engine.setSSLParameters(sSLParameters);
    }

    public final void setUseClientMode(boolean z) {
        this.engine.setUseClientMode(z);
    }

    public final void setUseSessionTickets(boolean z) {
        this.engine.setUseSessionTickets(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.engine.setWantClientAuth(z);
    }

    public final void startHandshake() {
        checkOpen();
        try {
            synchronized (this.handshakeLock) {
                synchronized (this.stateLock) {
                    if (this.state == 0) {
                        this.state = 2;
                        this.engine.beginHandshake();
                        this.f81424in = new SSLInputStream();
                        this.out = new SSLOutputStream();
                        doHandshake();
                    }
                }
            }
        } catch (SSLException e) {
            close();
            throw e;
        } catch (IOException e2) {
            close();
            throw e2;
        } catch (Exception e3) {
            close();
            throw SSLUtils.toSSLHandshakeException(e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.engine.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class SSLInputStream extends InputStream {
        private final AllocatedBuffer allocatedBuffer;
        private final ByteBuffer fromEngine;
        private final ByteBuffer fromSocket;
        private final int fromSocketArrayOffset;
        private final Object readLock = new Object();
        private final byte[] singleByte = new byte[1];
        private InputStream socketInputStream;

        public SSLInputStream() {
            if (ConscryptEngineSocket.this.bufferAllocator != null) {
                AllocatedBuffer allocateDirectBuffer = ConscryptEngineSocket.this.bufferAllocator.allocateDirectBuffer(ConscryptEngineSocket.this.engine.getSession().getApplicationBufferSize());
                this.allocatedBuffer = allocateDirectBuffer;
                this.fromEngine = allocateDirectBuffer.nioBuffer();
            } else {
                this.allocatedBuffer = null;
                this.fromEngine = ByteBuffer.allocateDirect(ConscryptEngineSocket.this.engine.getSession().getApplicationBufferSize());
            }
            this.fromEngine.flip();
            ByteBuffer allocate = ByteBuffer.allocate(ConscryptEngineSocket.this.engine.getSession().getPacketBufferSize());
            this.fromSocket = allocate;
            this.fromSocketArrayOffset = allocate.arrayOffset();
        }

        private void init() {
            if (this.socketInputStream == null) {
                this.socketInputStream = ConscryptEngineSocket.this.getUnderlyingInputStream();
            }
        }

        private boolean isHandshakeFinished() {
            boolean z;
            synchronized (ConscryptEngineSocket.this.stateLock) {
                z = ConscryptEngineSocket.this.state >= 4;
            }
            return z;
        }

        private boolean isHandshaking(SSLEngineResult.HandshakeStatus handshakeStatus) {
            int i = C16343.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[handshakeStatus.ordinal()];
            return i == 1 || i == 2 || i == 3;
        }

        /* access modifiers changed from: private */
        public int processDataFromSocket(byte[] bArr, int i, int i2) {
            Platform.blockGuardOnNetwork();
            ConscryptEngineSocket.this.checkOpen();
            init();
            while (this.fromEngine.remaining() <= 0) {
                this.fromSocket.flip();
                this.fromEngine.clear();
                boolean isHandshaking = isHandshaking(ConscryptEngineSocket.this.engine.getHandshakeStatus());
                SSLEngineResult unwrap = ConscryptEngineSocket.this.engine.unwrap(this.fromSocket, this.fromEngine);
                this.fromSocket.compact();
                this.fromEngine.flip();
                int i3 = C16343.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[unwrap.getStatus().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return -1;
                        }
                        String valueOf = String.valueOf(unwrap.getStatus());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb.append("Unexpected engine result ");
                        sb.append(valueOf);
                        throw new SSLException(sb.toString());
                    } else if (!isHandshaking && isHandshaking(unwrap.getHandshakeStatus()) && isHandshakeFinished()) {
                        renegotiate();
                        return 0;
                    }
                } else if (unwrap.bytesProduced() == 0) {
                    if (readFromSocket() == -1) {
                        return -1;
                    }
                }
                if (unwrap.bytesProduced() == 0) {
                    return 0;
                }
            }
            int min = Math.min(this.fromEngine.remaining(), i2);
            this.fromEngine.get(bArr, i, min);
            return min;
        }

        private int readFromSocket() {
            try {
                int position = this.fromSocket.position();
                int read = this.socketInputStream.read(this.fromSocket.array(), this.fromSocketArrayOffset + position, this.fromSocket.limit() - position);
                if (read > 0) {
                    this.fromSocket.position(position + read);
                }
                return read;
            } catch (EOFException e) {
                return -1;
            }
        }

        private int readUntilDataAvailable(byte[] bArr, int i, int i2) {
            int processDataFromSocket;
            do {
                processDataFromSocket = processDataFromSocket(bArr, i, i2);
            } while (processDataFromSocket == 0);
            return processDataFromSocket;
        }

        private void renegotiate() {
            synchronized (ConscryptEngineSocket.this.handshakeLock) {
                ConscryptEngineSocket.this.doHandshake();
            }
        }

        public int available() {
            int remaining;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                init();
                remaining = this.fromEngine.remaining();
            }
            return remaining;
        }

        public void close() {
            ConscryptEngineSocket.this.close();
        }

        public int read() {
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                int read = read(this.singleByte, 0, 1);
                if (read == -1) {
                    return -1;
                }
                if (read == 1) {
                    byte b = this.singleByte[0];
                    return b;
                }
                StringBuilder sb = new StringBuilder(42);
                sb.append("read incorrect number of bytes ");
                sb.append(read);
                throw new SSLException(sb.toString());
            }
        }

        public void release() {
            synchronized (this.readLock) {
                AllocatedBuffer allocatedBuffer2 = this.allocatedBuffer;
                if (allocatedBuffer2 != null) {
                    allocatedBuffer2.release();
                }
            }
        }

        public int read(byte[] bArr) {
            int read;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                read = read(bArr, 0, bArr.length);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int readUntilDataAvailable;
            ConscryptEngineSocket.this.startHandshake();
            synchronized (this.readLock) {
                readUntilDataAvailable = readUntilDataAvailable(bArr, i, i2);
            }
            return readUntilDataAvailable;
        }
    }

    public ConscryptEngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        super(str, i);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        super(str, i, inetAddress, i2);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i, inetAddress2, i2);
        this.engine = newEngine(sSLParametersImpl, this);
    }

    public ConscryptEngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i, z);
        this.engine = newEngine(sSLParametersImpl, this);
    }
}
