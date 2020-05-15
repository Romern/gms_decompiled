package p000;

import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: aavg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavg {

    /* renamed from: a */
    private final aatr f56646a;

    /* renamed from: b */
    private final List f56647b;

    public aavg(aatr aatr, List list) {
        this.f56646a = aatr;
        this.f56647b = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    public static void m47063a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aavg aavg = (aavg) it.next();
            List list2 = aavg.f56647b;
            int size = list2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    aavg.f56646a.setVisibility(8);
                    break;
                }
                for (Pair pair : (List) list2.get(i)) {
                    aavk aavk = (aavk) pair.first;
                    if (aavk == null || !aavk.mo31782b() || !((String) pair.second).equals(aavk.mo31794d())) {
                        i++;
                    }
                    while (r5.hasNext()) {
                    }
                }
                aavg.f56646a.setVisibility(0);
                break;
            }
        }
    }
}
