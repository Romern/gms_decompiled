package p000;

import java.util.Map;

/* renamed from: bxwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwx {
    /* renamed from: b */
    public static final boolean m124144b(Object obj) {
        return !((bxww) obj).f165014a;
    }

    /* renamed from: a */
    public static final int m124140a(int i, Object obj, Object obj2) {
        bxww bxww = (bxww) obj;
        bxwv bxwv = (bxwv) obj2;
        int i2 = 0;
        if (!bxww.isEmpty()) {
            for (Map.Entry entry : bxww.entrySet()) {
                i2 += bxuk.m123657i(i) + bxuk.m123663m(bxwv.m124133a(bxwv.f165012a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final bxwu m124141a(Object obj) {
        return ((bxwv) obj).f165012a;
    }

    /* renamed from: a */
    public static final Object m124142a() {
        return bxww.f165013b.mo74203a();
    }

    /* renamed from: a */
    public static final Object m124143a(Object obj, Object obj2) {
        bxww bxww = (bxww) obj;
        bxww bxww2 = (bxww) obj2;
        if (!bxww2.isEmpty()) {
            if (!bxww.f165014a) {
                bxww = bxww.mo74203a();
            }
            bxww.mo74205c();
            if (!bxww2.isEmpty()) {
                bxww.putAll(bxww2);
            }
        }
        return bxww;
    }
}
