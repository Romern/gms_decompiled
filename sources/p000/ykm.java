package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ykm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ykm {
    /* renamed from: a */
    public static ygx m44281a(Iterable iterable, yhg yhg, yhx yhx) {
        return m44282a(iterable, yhg, yhx, false);
    }

    /* renamed from: a */
    public static ygx m44282a(Iterable iterable, yhg yhg, yhx yhx, boolean z) {
        ypq.m44537a();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bngx a = ((ygx) it.next()).mo30473a();
            if (a.listIterator().hasNext()) {
                arrayList.add(bnjr.m109626h(a.listIterator()));
            }
        }
        m44283a(arrayList, 0, yhg.mo30385a(), yhg.mo30387b(), 0, yhx, z);
        return yhx.mo30520b();
    }

    /* renamed from: a */
    private static void m44283a(List list, int i, long j, long j2, long j3, yhx yhx, boolean z) {
        int i2 = i;
        if (i2 < list.size()) {
            bnjq bnjq = (bnjq) list.get(i);
            long j4 = j;
            long j5 = j3;
            while (true) {
                if (bnjq.hasNext()) {
                    if (((yhu) bnjq.mo67862a()).mo30387b() > j2) {
                        break;
                    }
                    yhu yhu = (yhu) bnjq.next();
                    long a = yhu.mo30385a();
                    long b = yhu.mo30387b();
                    long j6 = (!z || !(a == b || a == 0)) ? a : b;
                    if (z || (yhu.mo30387b() > yhu.mo30385a() && yhu.mo30385a() != 0)) {
                        if (j6 >= j5 && b > j4) {
                            m44283a(list, i2 + 1, j4, j6, j5, yhx, z);
                            yfp.m43965a(yhx, yhu);
                            j4 = b;
                            j5 = j4;
                        }
                    }
                } else {
                    break;
                }
            }
            m44283a(list, i2 + 1, j4, j2, j5, yhx, z);
        }
    }
}
