package com.google.android.gms.org.conscrypt;

import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class Java8FileDescriptorSocket extends ConscryptFileDescriptorSocket {
    private BiFunction selector;

    public Java8FileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        super(sSLParametersImpl);
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(final BiFunction biFunction) {
        if (biFunction != null) {
            return new ApplicationProtocolSelector() {
                /* class com.google.android.gms.org.conscrypt.Java8FileDescriptorSocket.C16401 */

                public String selectApplicationProtocol(SSLEngine sSLEngine, List list) {
                    throw new UnsupportedOperationException();
                }

                public String selectApplicationProtocol(SSLSocket sSLSocket, List list) {
                    return (String) biFunction.apply(sSLSocket, list);
                }
            };
        }
        return null;
    }

    public BiFunction getHandshakeApplicationProtocolSelector() {
        return this.selector;
    }

    public void setHandshakeApplicationProtocolSelector(BiFunction biFunction) {
        this.selector = biFunction;
        setApplicationProtocolSelector(toApplicationProtocolSelector(biFunction));
    }

    public Java8FileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        super(str, i, sSLParametersImpl);
    }

    public Java8FileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        super(str, i, inetAddress, i2, sSLParametersImpl);
    }

    public Java8FileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i, sSLParametersImpl);
    }

    public Java8FileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    public Java8FileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i, z, sSLParametersImpl);
    }
}
