package p000;

import android.util.Pair;

/* renamed from: pol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pol extends poq {

    /* renamed from: c */
    private final pls f39923c;

    /* renamed from: d */
    private final long f39924d;

    public pol(pnl pnl, plx plx, pls pls, long j) {
        super(pnl, plx, true, false, "GuestModeBleScanOperation");
        this.f39923c = pls;
        this.f39924d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        if (this.f39923c.f39620c) {
            pnr e = pnl.mo23495e();
            pls pls = this.f39923c;
            String str = pls.f39621d;
            String str2 = pls.f39619b;
            for (pnm pnm : e.mo23505a()) {
                if (str2.equals(pnm.mo23497a().f39867c)) {
                    pnq a = pnm.mo23497a();
                    a.f39869e = true;
                    a.f39871g = str;
                    return;
                }
            }
            pnq a2 = e.f39873b.mo23497a();
            a2.f39866b.put(str2, new Pair(str, Long.valueOf(this.f39924d)));
            a2.f39868d = false;
            a2.f39869e = true;
        }
    }
}
