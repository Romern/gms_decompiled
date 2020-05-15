package com.google.android.gms.org.conscrypt;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLContextImpl extends SSLContextSpi {
    private static DefaultSSLContextImpl defaultSslContextImpl;
    private final ClientSessionContext clientSessionContext;
    private final String[] protocols;
    private final ServerSessionContext serverSessionContext;
    SSLParametersImpl sslParameters;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class TLSv1 extends OpenSSLContextImpl {
        public TLSv1() {
            super(NativeCrypto.TLSV1_PROTOCOLS);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class TLSv11 extends OpenSSLContextImpl {
        public TLSv11() {
            super(NativeCrypto.TLSV11_PROTOCOLS);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class TLSv12 extends OpenSSLContextImpl {
        public TLSv12() {
            super(NativeCrypto.TLSV12_PROTOCOLS);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class TLSv13 extends OpenSSLContextImpl {
        public TLSv13() {
            super(NativeCrypto.TLSV13_PROTOCOLS);
        }
    }

    public OpenSSLContextImpl(String[] strArr) {
        this.protocols = strArr;
        this.clientSessionContext = new ClientSessionContext();
        this.serverSessionContext = new ServerSessionContext();
    }

    public static OpenSSLContextImpl getPreferred() {
        return new TLSv13();
    }

    public SSLEngine engineCreateSSLEngine() {
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (sSLParametersImpl != null) {
            SSLParametersImpl sSLParametersImpl2 = (SSLParametersImpl) sSLParametersImpl.clone();
            sSLParametersImpl2.setUseClientMode(false);
            ConscryptEngine conscryptEngine = new ConscryptEngine(sSLParametersImpl2);
            int i = Platform.f81431a;
            return conscryptEngine;
        }
        throw new IllegalStateException("SSLContext is not initialized.");
    }

    public SSLSessionContext engineGetClientSessionContext() {
        return this.clientSessionContext;
    }

    public SSLSessionContext engineGetServerSessionContext() {
        return this.serverSessionContext;
    }

    public SSLServerSocketFactory engineGetServerSocketFactory() {
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (sSLParametersImpl != null) {
            return new OpenSSLServerSocketFactoryImpl(sSLParametersImpl);
        }
        throw new IllegalStateException("SSLContext is not initialized.");
    }

    public SSLSocketFactory engineGetSocketFactory() {
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (sSLParametersImpl != null) {
            OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl = new OpenSSLSocketFactoryImpl(sSLParametersImpl);
            Platform.wrapSocketFactoryIfNeeded(openSSLSocketFactoryImpl);
            return openSSLSocketFactoryImpl;
        }
        throw new IllegalStateException("SSLContext is not initialized.");
    }

    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        this.sslParameters = new SSLParametersImpl(keyManagerArr, trustManagerArr, secureRandom, this.clientSessionContext, this.serverSessionContext, this.protocols);
    }

    public OpenSSLContextImpl(String[] strArr, boolean z) {
        synchronized (DefaultSSLContextImpl.class) {
            this.protocols = null;
            if (defaultSslContextImpl == null) {
                this.clientSessionContext = new ClientSessionContext();
                this.serverSessionContext = new ServerSessionContext();
                defaultSslContextImpl = (DefaultSSLContextImpl) this;
            } else {
                this.clientSessionContext = (ClientSessionContext) defaultSslContextImpl.engineGetClientSessionContext();
                this.serverSessionContext = (ServerSessionContext) defaultSslContextImpl.engineGetServerSessionContext();
            }
            this.sslParameters = new SSLParametersImpl(defaultSslContextImpl.getKeyManagers(), defaultSslContextImpl.getTrustManagers(), (SecureRandom) null, this.clientSessionContext, this.serverSessionContext, strArr);
        }
    }

    public SSLEngine engineCreateSSLEngine(String str, int i) {
        SSLParametersImpl sSLParametersImpl = this.sslParameters;
        if (sSLParametersImpl != null) {
            SSLParametersImpl sSLParametersImpl2 = (SSLParametersImpl) sSLParametersImpl.clone();
            sSLParametersImpl2.setUseClientMode(false);
            ConscryptEngine conscryptEngine = new ConscryptEngine(str, i, sSLParametersImpl2);
            int i2 = Platform.f81431a;
            return conscryptEngine;
        }
        throw new IllegalStateException("SSLContext is not initialized.");
    }
}
