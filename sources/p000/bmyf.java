package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bmyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmyf {
    /* renamed from: a */
    public static bmxz m108613a(bmxz bmxz) {
        return new bmyc(bmxz);
    }

    /* renamed from: a */
    public static bmxz m108614a(Object obj) {
        if (obj != null) {
            return new bmyb(obj);
        }
        return bmyd.IS_NULL;
    }

    /* renamed from: a */
    public static String m108615a(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static List m108616a(Iterable r4) {
        ArrayList arrayList = new ArrayList();
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            Object obj = r4.get(i);
            bmxy.m108581a(obj);
            arrayList.add(obj);
        }
        return arrayList;
    }
}
