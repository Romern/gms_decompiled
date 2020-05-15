package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bdjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bdjt {
    /* renamed from: a */
    public abstract bxxc mo58090a(bxxc bxxc, bxxc bxxc2);

    /* renamed from: a */
    public abstract bxxc mo58091a(String str, Object obj);

    /* renamed from: a */
    public abstract String mo58092a(bxxc bxxc);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo58093a(List list, List list2) {
        bxxc bxxc;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bxxc bxxc2 = (bxxc) list.get(i);
            String a = mo58092a(bxxc2);
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    bxxc = null;
                    break;
                }
                bxxc = (bxxc) list2.get(i2);
                i2++;
                if (a.equals(mo58092a(bxxc))) {
                    break;
                }
            }
            bxxc a2 = mo58090a(bxxc2, bxxc);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo58094a(Map map) {
        bxxc a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getValue() == null || (a = mo58091a((String) entry.getKey(), entry.getValue())) == null)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
