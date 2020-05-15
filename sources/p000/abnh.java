package p000;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* renamed from: abnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abnh {
    /* renamed from: a */
    static int m47951a(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet4Address)) {
            return inetAddress instanceof Inet6Address ? 3 : 1;
        }
        return 2;
    }
}
