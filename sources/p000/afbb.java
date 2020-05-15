package p000;

/* renamed from: afbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final afbb f64114a;

    /* renamed from: b */
    private static volatile bxxk f64115b;

    static {
        afbb afbb = new afbb();
        f64114a = afbb;
        bxvk.m124024a(afbb.class, afbb);
    }

    private afbb() {
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
            return bxvk.m124022a(f64114a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new afbb();
        }
        if (i2 == 4) {
            return new bxvd(f64114a);
        }
        if (i2 == 5) {
            return f64114a;
        }
        bxxk bxxk = f64115b;
        if (bxxk == null) {
            synchronized (afbb.class) {
                bxxk = f64115b;
                if (bxxk == null) {
                    bxxk = new bxve(f64114a);
                    f64115b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
