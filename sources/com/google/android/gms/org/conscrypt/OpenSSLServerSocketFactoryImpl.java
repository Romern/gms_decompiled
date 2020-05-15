package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class OpenSSLServerSocketFactoryImpl extends SSLServerSocketFactory {
    private static boolean useEngineSocketByDefault = SSLUtils.USE_ENGINE_SOCKET_BY_DEFAULT;
    private IOException instantiationException;
    private SSLParametersImpl sslParameters;
    private boolean useEngineSocket = useEngineSocketByDefault;

    OpenSSLServerSocketFactoryImpl() {
        try {
            SSLParametersImpl sSLParametersImpl = SSLParametersImpl.getDefault();
            this.sslParameters = sSLParametersImpl;
            sSLParametersImpl.setUseClientMode(false);
        } catch (KeyManagementException e) {
            IOException iOException = new IOException("Delayed instantiation exception:");
            this.instantiationException = iOException;
            iOException.initCause(e);
        }
    }

    static void setUseEngineSocketByDefault(boolean z) {
        useEngineSocketByDefault = z;
    }

    public ServerSocket createServerSocket() {
        ConscryptServerSocket conscryptServerSocket = new ConscryptServerSocket((SSLParametersImpl) this.sslParameters.clone());
        conscryptServerSocket.setUseEngineSocket(this.useEngineSocket);
        return conscryptServerSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public void setUseEngineSocket(boolean z) {
        this.useEngineSocket = z;
    }

    public ServerSocket createServerSocket(int i) {
        ConscryptServerSocket conscryptServerSocket = new ConscryptServerSocket(i, (SSLParametersImpl) this.sslParameters.clone());
        conscryptServerSocket.setUseEngineSocket(this.useEngineSocket);
        return conscryptServerSocket;
    }

    public ServerSocket createServerSocket(int i, int i2) {
        ConscryptServerSocket conscryptServerSocket = new ConscryptServerSocket(i, i2, (SSLParametersImpl) this.sslParameters.clone());
        conscryptServerSocket.setUseEngineSocket(this.useEngineSocket);
        return conscryptServerSocket;
    }

    public OpenSSLServerSocketFactoryImpl(SSLParametersImpl sSLParametersImpl) {
        SSLParametersImpl sSLParametersImpl2 = (SSLParametersImpl) sSLParametersImpl.clone();
        this.sslParameters = sSLParametersImpl2;
        sSLParametersImpl2.setUseClientMode(false);
    }

    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        ConscryptServerSocket conscryptServerSocket = new ConscryptServerSocket(i, i2, inetAddress, (SSLParametersImpl) this.sslParameters.clone());
        conscryptServerSocket.setUseEngineSocket(this.useEngineSocket);
        return conscryptServerSocket;
    }
}
