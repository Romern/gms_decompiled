package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: caxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxc {

    /* renamed from: a */
    public static final caxc f176303a = new caxc();

    /* renamed from: a */
    public static final InetAddress m127458a(Proxy proxy, caue caue) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(caue.f175991b);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }
}
