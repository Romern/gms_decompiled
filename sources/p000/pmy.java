package p000;

import java.net.InetSocketAddress;

/* renamed from: pmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pmy implements Comparable {

    /* renamed from: a */
    public final InetSocketAddress f39765a;

    /* renamed from: b */
    public final bpfn f39766b;

    /* renamed from: c */
    public final long f39767c = System.currentTimeMillis();

    /* renamed from: d */
    public boolean f39768d;

    public pmy(InetSocketAddress inetSocketAddress, bpfn bpfn, boolean z) {
        this.f39765a = inetSocketAddress;
        this.f39766b = bpfn;
        this.f39768d = z;
    }

    /* renamed from: a */
    private static int m30884a(bpfn bpfn) {
        bpfn bpfn2 = bpfn.TCP_PROBER_UNKNOWN;
        int ordinal = bpfn.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 0;
        }
        if (ordinal == 3) {
            return 4;
        }
        if (ordinal != 5) {
            return ordinal != 7 ? 5 : 1;
        }
        return 3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        pmy pmy = (pmy) obj;
        int a = m30884a(this.f39766b) - m30884a(pmy.f39766b);
        return a == 0 ? (this.f39767c > pmy.f39767c ? 1 : (this.f39767c == pmy.f39767c ? 0 : -1)) : a;
    }
}
