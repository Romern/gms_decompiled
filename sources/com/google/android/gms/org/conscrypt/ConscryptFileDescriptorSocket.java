package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ExternalSession;
import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ConscryptFileDescriptorSocket extends OpenSSLSocketImpl implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final boolean DBG_STATE = false;
    private final ActiveSession activeSession;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
        /* class com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.C16351 */

        public ConscryptSession provideSession() {
            return ConscryptFileDescriptorSocket.this.provideSession();
        }
    }));
    private final Object guard = Platform.closeGuardGet();
    private int handshakeTimeoutMilliseconds = -1;

    /* renamed from: is */
    private SSLInputStream f81425is;

    /* renamed from: os */
    private SSLOutputStream f81426os;
    /* access modifiers changed from: private */
    public final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    /* access modifiers changed from: private */
    public int state = 0;
    /* access modifiers changed from: private */
    public int writeTimeoutMilliseconds = 0;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class SSLInputStream extends InputStream {
        private final Object readLock = new Object();

        public SSLInputStream() {
        }

        public int available() {
            return ConscryptFileDescriptorSocket.this.ssl.getPendingReadableBytes();
        }

        public void awaitPendingOps() {
            synchronized (this.readLock) {
            }
        }

        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read;
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 == 0) {
                return 0;
            }
            synchronized (this.readLock) {
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
                read = ConscryptFileDescriptorSocket.this.ssl.read(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i, i2, ConscryptFileDescriptorSocket.this.getSoTimeout());
                if (read == -1) {
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                }
            }
            return read;
        }
    }

    public ConscryptFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    private void assertReadableOrWriteableState() {
        int i = this.state;
        if (i != 5 && i != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid state: ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeUnderlyingSocket() {
        super.close();
    }

    private void free() {
        if (!this.ssl.isClosed()) {
            this.ssl.close();
            Platform.closeGuardClose(this.guard);
        }
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        return NativeSsl.newInstance(sSLParametersImpl, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket);
    }

    /* access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession conscryptSession;
        synchronized (this.ssl) {
            int i = this.state;
            if (i >= 2) {
                if (i < 5) {
                    conscryptSession = this.activeSession;
                }
            }
            conscryptSession = SSLNullSession.getNullSession();
        }
        return conscryptSession;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0020, code lost:
        if (r3 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        return r4.activeSession;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        return com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        return r1;
     */
    public ConscryptSession provideSession() {
        boolean z;
        synchronized (this.ssl) {
            int i = this.state;
            if (i != 8) {
                boolean z2 = true;
                if (i >= 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    try {
                        if (isConnected()) {
                            waitForHandshake();
                        }
                    } catch (IOException e) {
                    }
                }
                z2 = z;
            } else {
                ConscryptSession conscryptSession = this.closedSession;
                if (conscryptSession == null) {
                    conscryptSession = SSLNullSession.getNullSession();
                }
            }
        }
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    private void shutdownAndFreeSslNative() {
        try {
            Platform.blockGuardOnNetwork();
            this.ssl.shutdown(Platform.getFileDescriptor(this.socket));
        } catch (IOException e) {
        } catch (Throwable th) {
            free();
            closeUnderlyingSocket();
            throw th;
        }
        free();
        closeUnderlyingSocket();
    }

    private void transitionTo(int i) {
        int i2;
        if (i == 8 && !this.ssl.isClosed() && (i2 = this.state) >= 2 && i2 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i;
    }

    private void waitForHandshake() {
        startHandshake();
        synchronized (this.ssl) {
            while (true) {
                int i = this.state;
                if (i != 5 && i != 4) {
                    if (i != 8) {
                        try {
                            this.ssl.wait();
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

    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, this);
    }

    public final String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, this);
    }

    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, null, this);
    }

    public final String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint(this);
    }

    public final void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    public final int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r3.ssl.interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r1 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r1.awaitPendingOps();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r2 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2.awaitPendingOps();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        shutdownAndFreeSslNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        return;
     */
    public final void close() {
        NativeSsl nativeSsl = this.ssl;
        if (nativeSsl != null) {
            synchronized (nativeSsl) {
                int i = this.state;
                if (i != 8) {
                    transitionTo(8);
                    if (i == 0) {
                        free();
                        closeUnderlyingSocket();
                        this.ssl.notifyAll();
                        return;
                    }
                    if (i != 5) {
                        if (i != 4) {
                            this.ssl.interrupt();
                            this.ssl.notifyAll();
                            return;
                        }
                    }
                    this.ssl.notifyAll();
                    SSLInputStream sSLInputStream = this.f81425is;
                    SSLOutputStream sSLOutputStream = this.f81426os;
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
    public final void finalize() {
        try {
            Object obj = this.guard;
            if (obj != null) {
                Platform.closeGuardWarnIfOpen(obj);
            }
            NativeSsl nativeSsl = this.ssl;
            if (nativeSsl != null) {
                synchronized (nativeSsl) {
                    transitionTo(8);
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final SSLSession getActiveSession() {
        return this.activeSession;
    }

    public final String getApplicationProtocol() {
        return SSLUtils.toProtocolString(this.ssl.getApplicationProtocol());
    }

    public final String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    public final byte[] getChannelId() {
        if (!getUseClientMode()) {
            synchronized (this.ssl) {
                if (this.state != 5) {
                    throw new IllegalStateException("Channel ID is only available after handshake completes");
                }
            }
            return this.ssl.getTlsChannelId();
        }
        throw new IllegalStateException("Client mode");
    }

    public final boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    public final String getHandshakeApplicationProtocol() {
        String str;
        synchronized (this.ssl) {
            int i = this.state;
            str = null;
            if (i >= 2 && i < 5) {
                str = getApplicationProtocol();
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return null;
     */
    public final SSLSession getHandshakeSession() {
        synchronized (this.ssl) {
            int i = this.state;
            if (i >= 2 && i < 5) {
                SSLSession wrapSSLSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
                    /* class com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.C16362 */

                    public ConscryptSession provideSession() {
                        return ConscryptFileDescriptorSocket.this.provideHandshakeSession();
                    }
                }));
                return wrapSSLSession;
            }
        }
    }

    public final InputStream getInputStream() {
        SSLInputStream sSLInputStream;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state != 8) {
                if (this.f81425is == null) {
                    this.f81425is = new SSLInputStream();
                }
                sSLInputStream = this.f81425is;
            } else {
                throw new SocketException("Socket is closed.");
            }
        }
        waitForHandshake();
        return sSLInputStream;
    }

    public final boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    public final OutputStream getOutputStream() {
        SSLOutputStream sSLOutputStream;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state != 8) {
                if (this.f81426os == null) {
                    this.f81426os = new SSLOutputStream();
                }
                sSLOutputStream = this.f81426os;
            } else {
                throw new SocketException("Socket is closed.");
            }
        }
        waitForHandshake();
        return sSLOutputStream;
    }

    public final SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, this);
    }

    public final SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    public final SSLSession getSession() {
        return this.externalSession;
    }

    public final int getSoWriteTimeout() {
        return this.writeTimeoutMilliseconds;
    }

    public final String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    public final boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public final void onNewSessionEstablished(long j) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j), this.activeSession));
        } catch (Exception e) {
        }
    }

    public final void onSSLStateChange(int i, int i2) {
        if (i == 32) {
            synchronized (this.ssl) {
                if (this.state != 8) {
                    transitionTo(5);
                    notifyHandshakeCompletedListeners();
                    synchronized (this.ssl) {
                        this.ssl.notifyAll();
                    }
                }
            }
        }
    }

    public final int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    public final long serverSessionRequested(byte[] bArr) {
        return 0;
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
        this.sslParameters.setApplicationProtocols(strArr);
    }

    public final void setChannelIdEnabled(boolean z) {
        if (!getUseClientMode()) {
            synchronized (this.ssl) {
                if (this.state != 0) {
                    throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
                }
            }
            this.sslParameters.channelIdEnabled = z;
            return;
        }
        throw new IllegalStateException("Client mode");
    }

    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (getUseClientMode()) {
            synchronized (this.ssl) {
                if (this.state != 0) {
                    throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
                }
            }
            ECParameterSpec eCParameterSpec = null;
            if (privateKey != null) {
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
            } else {
                this.sslParameters.channelIdEnabled = false;
                this.channelIdPrivateKey = null;
            }
        } else {
            throw new IllegalStateException("Server mode");
        }
    }

    public final void setEnableSessionCreation(boolean z) {
        this.sslParameters.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    public final void setHandshakeTimeout(int i) {
        this.handshakeTimeoutMilliseconds = i;
    }

    public final void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        super.setHostname(str);
    }

    public final void setNeedClientAuth(boolean z) {
        this.sslParameters.setNeedClientAuth(z);
    }

    public final void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    public final void setSoWriteTimeout(int i) {
        this.writeTimeoutMilliseconds = i;
        Platform.setSocketWriteTimeout(this, (long) i);
    }

    public final void setUseClientMode(boolean z) {
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalArgumentException("Could not change the mode after the initial handshake has begun.");
            }
        }
        this.sslParameters.setUseClientMode(z);
    }

    public final void setUseSessionTickets(boolean z) {
        this.sslParameters.setUseSessionTickets(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.sslParameters.setWantClientAuth(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00ed, code lost:
        monitor-enter(r9.ssl);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x00f0, code lost:
        if (r9.state != 8) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x00fd, code lost:
        if (r1.getMessage().contains("unexpected CCS") != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x00ff, code lost:
        com.google.android.gms.org.conscrypt.Platform.logEvent(java.lang.String.format("ssl_unexpected_ccs: host=%s", getHostnameOrIP()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (getUseClientMode() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0110, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0114, code lost:
        monitor-enter(r9.ssl);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        transitionTo(8);
        r9.ssl.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        shutdownAndFreeSslNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r3 = clientSessionContext().getCachedSession(getHostnameOrIP(), getPort(), r9.sslParameters);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0121, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x012a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x012b, code lost:
        r3 = new javax.net.ssl.SSLHandshakeException(r1.getMessage());
        r3.initCause(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0137, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0139, code lost:
        r1 = r9.ssl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x013b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        transitionTo(8);
        r9.ssl.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0144, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        shutdownAndFreeSslNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0148, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r3.offerToResume(r9.ssl);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0151, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0153, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r3 = getSoTimeout();
        r4 = getSoWriteTimeout();
        r5 = r9.handshakeTimeoutMilliseconds;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r5 < 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        setSoTimeout(r5);
        setSoWriteTimeout(r9.handshakeTimeoutMilliseconds);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r5 = r9.ssl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r9.state == 8) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r9.ssl.doHandshake(com.google.android.gms.org.conscrypt.Platform.getFileDescriptor(r9.socket), getSoTimeout());
        r9.activeSession.onPeerCertificateAvailable(getHostnameOrIP(), getPort());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6 = r9.ssl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r9.state == 8) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r9.handshakeTimeoutMilliseconds >= 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        setSoTimeout(r3);
        setSoWriteTimeout(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r3 = r9.ssl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r4 = r9.state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        if (r4 != 8) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        if (r4 == 2) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        transitionTo(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        transitionTo(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a4, code lost:
        if (r0 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        r9.ssl.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ab, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ac, code lost:
        if (r0 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ae, code lost:
        r0 = r9.ssl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        transitionTo(8);
        r9.ssl.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b9, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        shutdownAndFreeSslNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cc, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00cf, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d2, code lost:
        r1 = r9.ssl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d4, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        transitionTo(8);
        r9.ssl.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00dd, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        shutdownAndFreeSslNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x00ea, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.google.android.gms.org.conscrypt.Platform.closeGuardOpen(r9.guard, "close");
        r9.ssl.initialize(getHostname(), r9.channelIdPrivateKey);
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0165  */
    public final void startHandshake() {
        boolean z;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state == 0) {
                transitionTo(2);
            } else {
                return;
            }
        }
        try {
            throw ((SSLHandshakeException) new SSLHandshakeException("Handshake failed").initCause(e));
        } catch (Throwable th) {
            th = th;
            if (z) {
                synchronized (this.ssl) {
                    transitionTo(8);
                    this.ssl.notifyAll();
                }
                try {
                    shutdownAndFreeSslNative();
                } catch (IOException e) {
                }
            }
            throw th;
        }
    }

    public final void verifyCertificateChain(byte[][] bArr, String str) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] decodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager != null) {
                        this.activeSession.onPeerCertificatesReceived(getHostnameOrIP(), getPort(), decodeX509CertificateChain);
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

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class SSLOutputStream extends OutputStream {
        private final Object writeLock = new Object();

        public SSLOutputStream() {
        }

        public void awaitPendingOps() {
            synchronized (this.writeLock) {
            }
        }

        public void write(int i) {
            write(new byte[]{(byte) (i & 255)});
        }

        public void write(byte[] bArr, int i, int i2) {
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 != 0) {
                synchronized (this.writeLock) {
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                    ConscryptFileDescriptorSocket.this.ssl.write(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i, i2, ConscryptFileDescriptorSocket.this.writeTimeoutMilliseconds);
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        super(str, i);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        super(str, i, inetAddress, i2);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i, inetAddress2, i2);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i, z);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }
}
