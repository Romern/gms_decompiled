package p000;

import java.net.InetSocketAddress;

/* renamed from: pot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pot extends poq {

    /* renamed from: c */
    private final InetSocketAddress f39939c;

    /* renamed from: d */
    private final String f39940d;

    /* renamed from: e */
    private final int f39941e;

    /* renamed from: f */
    private final long f39942f;

    public pot(pnl pnl, plx plx, InetSocketAddress inetSocketAddress, String str, int i, long j) {
        super(pnl, plx, false, false, "TcpProbingFailureOperation");
        this.f39939c = inetSocketAddress;
        this.f39940d = str;
        this.f39941e = i;
        this.f39942f = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pns a = pnl.mo23483a(this.f39939c);
        if (a == null) {
            a = pnl.mo23488b(this.f39939c);
        }
        pno a2 = a.mo23508a(this.f39940d);
        if (a2 == null) {
            a2 = new pno(this.f39940d);
            a.mo23509a(a2);
        }
        a2.f39859c = this.f39942f;
        a2.f39858b = false;
        a2.f39861e++;
        a2.f39860d = this.f39941e;
    }
}
