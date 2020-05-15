package p000;

import android.util.SparseArray;

/* renamed from: dsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsu {

    /* renamed from: a */
    public final ego f13963a = new ego();

    /* renamed from: b */
    public final SparseArray f13964b = new SparseArray();

    /* renamed from: a */
    public final boolean mo9533a(dwa dwa) {
        boolean z;
        new Object[1][0] = dwa;
        if (dwa.f14243c == null || dwa.mo9756i() == null) {
            z = false;
        } else {
            z = dwa.mo9756i().mo9711b() == 1;
        }
        if (z) {
            int i = dwa.mo9747b().f162973bD;
            this.f13963a.mo10098a(i, dwa);
            bnot bnot = (bnot) this.f13964b.get(i);
            if (bnot == null) {
                bnot = bnge.m109299s();
                this.f13964b.put(i, bnot);
            }
            bnot.mo67268a(dwa.f14243c, dwa);
        }
        new Object[1][0] = this.f13964b;
        return z;
    }

    /* renamed from: b */
    public final void mo9534b(dwa dwa) {
        new Object[1][0] = dwa;
        int i = dwa.mo9747b().f162973bD;
        int b = this.f13963a.mo10100b(i, dwa);
        if (b == 3) {
            bnot bnot = (bnot) this.f13964b.get(i);
            if (bnot != null) {
                bnot.mo67310c(dwa.f14243c, dwa);
                if (bnot.mo67314m()) {
                    this.f13964b.remove(i);
                }
            }
        } else if (b == 4) {
            this.f13964b.remove(i);
        }
        new Object[1][0] = this.f13964b;
    }
}
