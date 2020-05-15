package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: capw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class capw {
    /* renamed from: a */
    public static casg m126927a(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 1;
        int i3 = 0;
        while (i3 < size) {
            casg a = ((caqe) list.get(i3)).mo74754a();
            int i4 = a.f175749b;
            if (i4 > i2) {
                i2 = i4;
            }
            Iterator it = a.f175748a.iterator();
            while (true) {
                i = i3 + 1;
                if (!it.hasNext()) {
                    break;
                }
                cash cash = (cash) it.next();
                if (!arrayList.contains(cash)) {
                    arrayList.add(cash);
                }
            }
            i3 = i;
        }
        return new casg(i2, arrayList);
    }
}
