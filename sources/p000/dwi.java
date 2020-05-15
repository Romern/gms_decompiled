package p000;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwi implements dvw {

    /* renamed from: a */
    public final dwh f14272a = new dwh();

    /* renamed from: a */
    private static final void m9623a() {
        dwq.m9682z().mo10071b(cdgp.f180782a.mo6606a().mo77547aL());
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
    }

    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
        Object[] objArr = {doh, Integer.valueOf(bxco.f162973bD)};
        if (this.f14272a.mo9775b(bxco.f162973bD)) {
            this.f14272a.mo9773a(doh, bxco.f162973bD, 3);
            m9623a();
        }
    }

    /* renamed from: a */
    public final Set mo9776a(doh doh, int i) {
        sdo.m34974b(true);
        dwh dwh = this.f14272a;
        sdo.m34974b(true);
        SparseArray sparseArray = (SparseArray) dwh.f14271c.get(doh);
        HashSet hashSet = null;
        if (!(sparseArray == null || sparseArray.size() == 0)) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                dwg dwg = (dwg) sparseArray.valueAt(i2);
                if (dwg.f14264c && dwg.f14265d == i) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(Integer.valueOf(dwg.f14263b));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
        Object[] objArr = {doh, Integer.valueOf(bxco.f162973bD)};
        if (this.f14272a.mo9775b(bxco.f162973bD)) {
            this.f14272a.mo9773a(doh, bxco.f162973bD, 2);
            m9623a();
        }
    }
}
