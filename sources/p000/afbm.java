package p000;

/* renamed from: afbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final afbm f64144d;

    /* renamed from: e */
    private static volatile bxxk f64145e;

    /* renamed from: a */
    public int f64146a;

    /* renamed from: b */
    public int f64147b;

    /* renamed from: c */
    public afbf f64148c;

    static {
        afbm afbm = new afbm();
        f64144d = afbm;
        bxvk.m124024a(afbm.class, afbm);
    }

    private afbm() {
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
            return bxvk.m124022a(f64144d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", afbk.f64143a, "c"});
        } else if (i2 == 3) {
            return new afbm();
        } else {
            if (i2 == 4) {
                return new bxvd(f64144d);
            }
            if (i2 == 5) {
                return f64144d;
            }
            bxxk bxxk = f64145e;
            if (bxxk == null) {
                synchronized (afbm.class) {
                    bxxk = f64145e;
                    if (bxxk == null) {
                        bxxk = new bxve(f64144d);
                        f64145e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
