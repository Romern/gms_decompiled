package p000;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

/* renamed from: bjea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjea extends bjeb implements LayeredSocketFactory {

    /* renamed from: b */
    private final LayeredSocketFactory f122566b;

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f122566b.createSocket(socket, str, i, z);
    }

    public bjea(bjec bjec, LayeredSocketFactory layeredSocketFactory) {
        super(bjec, layeredSocketFactory);
        this.f122566b = layeredSocketFactory;
    }
}
