package p000;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cigo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cigo {

    /* renamed from: a */
    static final List f190153a = Collections.unmodifiableList(Arrays.asList(cihj.HTTP_2));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket, java.lang.String, int, boolean):java.net.Socket throws java.io.IOException}
     arg types: [java.net.Socket, java.lang.String, int, int]
     candidates:
      ClspMth{javax.net.SocketFactory.createSocket(java.lang.String, int, java.net.InetAddress, int):java.net.Socket throws java.io.IOException, java.net.UnknownHostException}
      ClspMth{javax.net.SocketFactory.createSocket(java.net.InetAddress, int, java.net.InetAddress, int):java.net.Socket throws java.io.IOException}
      ClspMth{javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket, java.lang.String, int, boolean):java.net.Socket throws java.io.IOException} */
    /* renamed from: a */
    public static SSLSocket m150258a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, cigx cigx) {
        String[] strArr;
        cihj cihj;
        String str2;
        bmxy.m108582a(sSLSocketFactory, "sslSocketFactory");
        bmxy.m108582a(socket, "socket");
        bmxy.m108582a(cigx, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        List list = null;
        if (cigx.f190274c != null) {
            strArr = (String[]) cihl.m150313a(String.class, cigx.f190274c, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        cigw cigw = new cigw(cigx);
        cigw.mo86091a(strArr);
        cigw.mo86093b((String[]) cihl.m150313a(String.class, cigx.f190275d, enabledProtocols));
        cigx a = cigw.mo86088a();
        sSLSocket.setEnabledProtocols(a.f190275d);
        String[] strArr2 = a.f190274c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        cigm cigm = cigm.f190149b;
        if (cigx.f190276e) {
            list = f190153a;
        }
        String a2 = cigm.mo86075a(sSLSocket, str, list);
        List list2 = f190153a;
        if (a2.equals(cihj.HTTP_1_0.f190314e)) {
            cihj = cihj.HTTP_1_0;
        } else if (a2.equals(cihj.HTTP_1_1.f190314e)) {
            cihj = cihj.HTTP_1_1;
        } else if (a2.equals(cihj.HTTP_2.f190314e)) {
            cihj = cihj.HTTP_2;
        } else if (!a2.equals(cihj.SPDY_3.f190314e)) {
            String valueOf = String.valueOf(a2);
            throw new IOException(valueOf.length() == 0 ? new String("Unexpected protocol: ") : "Unexpected protocol: ".concat(valueOf));
        } else {
            cihj = cihj.SPDY_3;
        }
        boolean contains = list2.contains(cihj);
        String valueOf2 = String.valueOf(f190153a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 50);
        sb.append("Only ");
        sb.append(valueOf2);
        sb.append(" are supported, but negotiated protocol is %s");
        bmxy.m108605b(contains, sb.toString(), a2);
        cigz cigz = cigz.f190284a;
        if (!str.startsWith("[") || !str.endsWith("]")) {
            str2 = str;
        } else {
            str2 = str.substring(1, str.length() - 1);
        }
        if (cigz.verify(str2, sSLSocket.getSession())) {
            return sSLSocket;
        }
        String valueOf3 = String.valueOf(str);
        throw new SSLPeerUnverifiedException(valueOf3.length() == 0 ? new String("Cannot verify hostname: ") : "Cannot verify hostname: ".concat(valueOf3));
    }
}
