package p000;

import android.util.SparseArray;

/* renamed from: efk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efk {

    /* renamed from: a */
    public final ego f14831a = new ego();

    /* renamed from: b */
    public final SparseArray f14832b = new SparseArray();

    /* renamed from: c */
    public final bnot f14833c = bnge.m109299s();

    /* renamed from: a */
    public final void mo10075a(dwa dwa) {
        if (dwa.f14243c != null && dwa.mo9754h() && dwa.mo9756i().mo9711b() == 2) {
            int i = dwa.mo9747b().f162973bD;
            this.f14831a.mo10098a(i, dwa);
            SparseArray sparseArray = this.f14832b;
            sparseArray.put(i, Long.valueOf(Math.min(((Long) sparseArray.get(i, Long.MAX_VALUE)).longValue(), dwa.mo9756i().mo9712c())));
            this.f14833c.mo67268a(dwa.f14243c, dwa);
        }
    }
}
