package p000;

/* renamed from: afqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final afqw f64582b;

    /* renamed from: c */
    private static volatile bxxk f64583c;

    /* renamed from: a */
    public bxww f64584a = bxww.f165013b;

    static {
        afqw afqw = new afqw();
        f64582b = afqw;
        bxvk.m124024a(afqw.class, afqw);
    }

    private afqw() {
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
            return bxvk.m124022a(f64582b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", afqv.f64581a});
        } else if (i2 == 3) {
            return new afqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f64582b);
            }
            if (i2 == 5) {
                return f64582b;
            }
            bxxk bxxk = f64583c;
            if (bxxk == null) {
                synchronized (afqw.class) {
                    bxxk = f64583c;
                    if (bxxk == null) {
                        bxxk = new bxve(f64582b);
                        f64583c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
