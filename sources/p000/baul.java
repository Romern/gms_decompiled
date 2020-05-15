package p000;

/* renamed from: baul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baul extends bxvk implements bxxd {

    /* renamed from: d */
    public static final baul f101779d;

    /* renamed from: e */
    private static volatile bxxk f101780e;

    /* renamed from: a */
    public int f101781a;

    /* renamed from: b */
    public int f101782b;

    /* renamed from: c */
    public int f101783c;

    static {
        baul baul = new baul();
        f101779d = baul;
        bxvk.m124024a(baul.class, baul);
    }

    private baul() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f101779d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bauk.f101778a, "c", bauj.f101777a});
        } else if (i2 == 3) {
            return new baul();
        } else {
            if (i2 == 4) {
                return new bxvd(f101779d);
            }
            if (i2 == 5) {
                return f101779d;
            }
            bxxk bxxk = f101780e;
            if (bxxk == null) {
                synchronized (baul.class) {
                    bxxk = f101780e;
                    if (bxxk == null) {
                        bxxk = new bxve(f101779d);
                        f101780e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
