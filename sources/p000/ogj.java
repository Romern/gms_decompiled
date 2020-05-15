package p000;

import android.util.SparseArray;

/* renamed from: ogj */
final /* synthetic */ class ogj implements bmxj {

    /* renamed from: a */
    private final SparseArray f37557a;

    public ogj(SparseArray sparseArray) {
        this.f37557a = sparseArray;
    }

    public final Object apply(Object obj) {
        SparseArray sparseArray = this.f37557a;
        ogs ogs = (ogs) obj;
        bnsn bnsn = ogs.f37577a;
        ogs.f37578b.mo22161b();
        ogs.f37584h.mo22088i();
        for (int i = 0; i < sparseArray.size(); i++) {
            ((ojh) sparseArray.valueAt(i)).mo22088i();
        }
        return null;
    }
}
