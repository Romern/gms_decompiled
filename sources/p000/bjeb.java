package p000;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

/* renamed from: bjeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bjeb implements SocketFactory {

    /* renamed from: a */
    final /* synthetic */ bjec f122567a;

    /* renamed from: b */
    private final SocketFactory f122568b;

    public bjeb(bjec bjec, SocketFactory socketFactory) {
        this.f122567a = bjec;
        this.f122568b = socketFactory;
    }

    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        this.f122567a.f122570b.set(Boolean.TRUE);
        return this.f122568b.connectSocket(socket, str, i, inetAddress, i2, httpParams);
    }

    public final Socket createSocket() {
        return this.f122568b.createSocket();
    }

    public final boolean isSecure(Socket socket) {
        return this.f122568b.isSecure(socket);
    }
}
