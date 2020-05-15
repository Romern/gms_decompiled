package p000;

/* renamed from: afrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afrd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final afrd f64606c;

    /* renamed from: d */
    private static volatile bxxk f64607d;

    /* renamed from: a */
    public int f64608a;

    /* renamed from: b */
    public int f64609b;

    static {
        afrd afrd = new afrd();
        f64606c = afrd;
        bxvk.m124024a(afrd.class, afrd);
    }

    private afrd() {
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
            return bxvk.m124022a(f64606c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", afyd.m53665b()});
        } else if (i2 == 3) {
            return new afrd();
        } else {
            if (i2 == 4) {
                return new bxvd(f64606c);
            }
            if (i2 == 5) {
                return f64606c;
            }
            bxxk bxxk = f64607d;
            if (bxxk == null) {
                synchronized (afrd.class) {
                    bxxk = f64607d;
                    if (bxxk == null) {
                        bxxk = new bxve(f64606c);
                        f64607d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
