package p000;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: cavh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cavh {

    /* renamed from: a */
    public static final cavh f176134a;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[ExcHandler: NoSuchMethodException (e java.lang.NoSuchMethodException), Splitter:B:9:0x0033] */
    static {
        cavh cavh;
        cavd cavd;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            try {
                Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    cavh = new cavf(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException e3) {
                    cavh = new cavh();
                }
            }
        }
        cavd cavd2 = null;
        cavd cavd3 = new cavd(null, "setUseSessionTickets", Boolean.TYPE);
        cavd cavd4 = new cavd(null, "setHostname", String.class);
        try {
            Class<?> cls3 = Class.forName("android.net.TrafficStats");
            cls3.getMethod("tagSocket", Socket.class);
            cls3.getMethod("untagSocket", Socket.class);
            Class.forName("android.net.Network");
            cavd = new cavd(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            try {
                cavd2 = new cavd(null, "setAlpnProtocols", byte[].class);
            } catch (ClassNotFoundException | NoSuchMethodException e4) {
            }
        } catch (ClassNotFoundException e5) {
            cavd = null;
        } catch (NoSuchMethodException e6) {
        }
        cavh = new cave(cavd3, cavd4, cavd, cavd2);
        f176134a = cavh;
    }

    /* renamed from: a */
    public String mo74954a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo74956a(SSLSocket sSLSocket, String str, List list) {
    }

    /* renamed from: b */
    public void mo74957b(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public final void mo74959a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo74955a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }
}
