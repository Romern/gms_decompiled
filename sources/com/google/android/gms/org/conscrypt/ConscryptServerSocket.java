package com.google.android.gms.org.conscrypt;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ConscryptServerSocket extends SSLServerSocket {
    private boolean channelIdEnabled;
    private final SSLParametersImpl sslParameters;
    private boolean useEngineSocket;

    public ConscryptServerSocket(int i, int i2, SSLParametersImpl sSLParametersImpl) {
        super(i, i2);
        this.sslParameters = sSLParametersImpl;
    }

    public Socket accept() {
        AbstractConscryptSocket abstractConscryptSocket;
        if (this.useEngineSocket) {
            abstractConscryptSocket = Platform.createEngineSocket(this.sslParameters);
        } else {
            abstractConscryptSocket = Platform.createFileDescriptorSocket(this.sslParameters);
        }
        abstractConscryptSocket.setChannelIdEnabled(this.channelIdEnabled);
        implAccept(abstractConscryptSocket);
        return abstractConscryptSocket;
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

    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    /* access modifiers changed from: package-private */
    public boolean isChannelIdEnabled() {
        return this.channelIdEnabled;
    }

    /* access modifiers changed from: package-private */
    public void setChannelIdEnabled(boolean z) {
        this.channelIdEnabled = z;
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

    public void setNeedClientAuth(boolean z) {
        this.sslParameters.setNeedClientAuth(z);
    }

    public void setUseClientMode(boolean z) {
        this.sslParameters.setUseClientMode(z);
    }

    public ConscryptServerSocket setUseEngineSocket(boolean z) {
        this.useEngineSocket = z;
        return this;
    }

    public void setWantClientAuth(boolean z) {
        this.sslParameters.setWantClientAuth(z);
    }

    public ConscryptServerSocket(int i, int i2, InetAddress inetAddress, SSLParametersImpl sSLParametersImpl) {
        super(i, i2, inetAddress);
        this.sslParameters = sSLParametersImpl;
    }

    public ConscryptServerSocket(int i, SSLParametersImpl sSLParametersImpl) {
        super(i);
        this.sslParameters = sSLParametersImpl;
    }

    public ConscryptServerSocket(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
    }
}
