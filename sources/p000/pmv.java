package p000;

import java.net.NetworkInterface;
import java.util.List;

/* renamed from: pmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmv {

    /* renamed from: a */
    public final NetworkInterface f39757a;

    public pmv(NetworkInterface networkInterface) {
        this.f39757a = networkInterface;
    }

    /* renamed from: a */
    public final boolean mo23444a() {
        return this.f39757a.isUp();
    }

    /* renamed from: b */
    public final boolean mo23445b() {
        return this.f39757a.isLoopback();
    }

    /* renamed from: c */
    public final boolean mo23446c() {
        return this.f39757a.isPointToPoint();
    }

    /* renamed from: d */
    public final boolean mo23447d() {
        return this.f39757a.isVirtual();
    }

    /* renamed from: e */
    public final boolean mo23448e() {
        return this.f39757a.supportsMulticast();
    }

    /* renamed from: f */
    public final List mo23449f() {
        return this.f39757a.getInterfaceAddresses();
    }

    public final String toString() {
        return this.f39757a.toString();
    }
}
