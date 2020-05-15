package p000;

import android.util.SparseArray;

/* renamed from: efb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class efb {

    /* renamed from: a */
    private SparseArray f14820a = null;

    public efb(bxik bxik) {
        if (bxik != null && bxik.f163532a.size() != 0) {
            this.f14820a = new SparseArray(bxik.f163532a.size());
            bxwc bxwc = bxik.f163532a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bxiq bxiq = (bxiq) bxwc.get(i);
                SparseArray sparseArray = this.f14820a;
                bxco a = bxco.m122577a(bxiq.f163556b);
                bxiq bxiq2 = (bxiq) sparseArray.get((a == null ? bxco.UNKNOWN_CONTEXT_NAME : a).f162973bD);
                if (bxiq2 == null || bxiq2.f163557c <= bxiq.f163557c) {
                    SparseArray sparseArray2 = this.f14820a;
                    bxco a2 = bxco.m122577a(bxiq.f163556b);
                    sparseArray2.put((a2 == null ? bxco.UNKNOWN_CONTEXT_NAME : a2).f162973bD, bxiq);
                }
            }
        }
    }

    /* renamed from: a */
    public final bxiq mo10067a(bxco bxco) {
        SparseArray sparseArray = this.f14820a;
        if (sparseArray != null) {
            return (bxiq) sparseArray.get(bxco.f162973bD);
        }
        return null;
    }
}
