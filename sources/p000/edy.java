package p000;

import android.util.SparseArray;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: edy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edy {

    /* renamed from: a */
    public final HashMap f14759a = new HashMap();

    /* renamed from: a */
    public static int m10195a(long j, long j2) {
        long j3 = j - j2;
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 >= -2147483648L) {
            return (int) j3;
        }
        return Integer.MIN_VALUE;
    }

    protected edy() {
    }

    /* renamed from: a */
    public final edp mo10016a(doh doh, bxco bxco) {
        edu edu;
        SparseArray sparseArray = (SparseArray) this.f14759a.get(doh);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.f14759a.put(doh, sparseArray);
        }
        edp edp = (edp) sparseArray.get(bxco.f162973bD);
        if (edp != null) {
            return edp;
        }
        boolean z = !doh.mo9338b();
        int a = edt.m10183a(bxco);
        if (a == 0) {
            edu = new edv(z);
        } else if (a == 1) {
            edu = new edu((int) cdgp.m133197f(), edo.m10176a(bxco), z);
        } else if (a != 2) {
            edu = new edw(edo.m10176a(bxco));
        } else {
            edu = new edx((int) cdgp.m133197f(), edo.m10176a(bxco), z);
        }
        sparseArray.put(bxco.f162973bD, edu);
        return edu;
    }

    /* renamed from: a */
    public final void mo10017a(doh doh, ContextDataFilterImpl contextDataFilterImpl, boolean z) {
        SparseArray sparseArray = (SparseArray) this.f14759a.get(doh);
        if (sparseArray != null) {
            Iterator it = contextDataFilterImpl.mo18054d().iterator();
            while (it.hasNext()) {
                edp edp = (edp) sparseArray.get(((Integer) it.next()).intValue());
                if (edp != null) {
                    edp.mo10007a(contextDataFilterImpl, z);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10018a(doh doh, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            edr edr = (edr) list.get(i);
            mo10016a(doh, edr.f14749a.mo18019h()).mo10008a(edr);
        }
    }

    /* renamed from: a */
    public final void mo10019a(ArrayList arrayList, doh doh, ContextDataFilterImpl contextDataFilterImpl, boolean z, long j) {
        HashSet d;
        ContextDataFilterImpl contextDataFilterImpl2 = contextDataFilterImpl;
        long j2 = j;
        SparseArray sparseArray = (SparseArray) this.f14759a.get(doh);
        if (sparseArray != null && (d = contextDataFilterImpl.mo18054d()) != null && !d.isEmpty()) {
            int i = contextDataFilterImpl2.f30672c.f30697b;
            if (i == -1) {
                i = Integer.MAX_VALUE;
            }
            Iterator it = contextDataFilterImpl.mo18054d().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                edp edp = (edp) sparseArray.get(intValue);
                if (edp != null) {
                    if (doi.m8940d(intValue)) {
                        Object[] objArr = {Integer.toString(intValue), edp.getClass(), Boolean.valueOf(dql.m9090a(intValue)), Boolean.valueOf(edp.mo10010a(j2))};
                    }
                    if (dql.m9090a(intValue)) {
                        if (doh.mo9338b()) {
                            if (dql.m9090a(intValue)) {
                                Iterator it2 = this.f14759a.values().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    edp edp2 = (edp) ((SparseArray) it2.next()).get(intValue);
                                    if (edp2 != null) {
                                        if (edp2.mo10010a(j2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (doh.mo9338b() || edp.mo10010a(j2)) {
                            Iterator it3 = edp.iterator();
                            int i2 = 0;
                            int i3 = 0;
                            while (it3.hasNext()) {
                                edr edr = (edr) it3.next();
                                i2++;
                                if (!z || edr.f14750b) {
                                    if (i > 0 && contextDataFilterImpl2.mo18051a(edr.f14749a)) {
                                        arrayList.add(edr.f14749a);
                                        i--;
                                        i3++;
                                    }
                                }
                            }
                            if (doi.m8940d(intValue)) {
                                Object[] objArr2 = {Integer.toString(intValue), edp.getClass(), Integer.valueOf(i2), Integer.valueOf(i3)};
                            }
                        }
                    }
                }
            }
        }
    }
}
