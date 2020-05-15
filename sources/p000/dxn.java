package p000;

import android.util.SparseArray;
import java.util.HashSet;

/* renamed from: dxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxn {

    /* renamed from: a */
    public final SparseArray f14363a = new SparseArray();

    /* renamed from: a */
    private final boolean m9755a(dxr dxr, HashSet hashSet) {
        hashSet.add(dxr);
        int[] iArr = dxr.f14370d;
        if (iArr != null) {
            for (int i : iArr) {
                dxr a = mo9832a(i);
                if (a == null || !m9755a(a, hashSet)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final HashSet mo9833b(int i) {
        dxr a = mo9832a(i);
        if (a != null) {
            HashSet hashSet = new HashSet();
            if (m9755a(a, hashSet)) {
                return hashSet;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final dxr mo9832a(int i) {
        dxr dxr = (dxr) this.f14363a.get(i);
        if (dxr != null || !dze.m9874b(i)) {
            return dxr;
        }
        sdo.m34974b(dze.m9874b(i));
        dxr dxr2 = new dxr(new dzd(i), "GenericBackendProducedContextProducer", new int[]{i}, null);
        dze.f14471b.append(i, dxr2);
        this.f14363a.put(i, dxr2);
        return dxr2;
    }
}
