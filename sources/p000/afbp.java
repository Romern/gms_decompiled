package p000;

/* renamed from: afbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final afbp f64150d;

    /* renamed from: e */
    private static volatile bxxk f64151e;

    /* renamed from: a */
    public int f64152a;

    /* renamed from: b */
    public int f64153b;

    /* renamed from: c */
    public String f64154c = "";

    static {
        afbp afbp = new afbp();
        f64150d = afbp;
        GeneratedMessageLite.m124024a(afbp.class, afbp);
    }

    private afbp() {
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
            return GeneratedMessageLite.m124022a(f64150d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", afbn.f64149a, "c"});
        } else if (i2 == 3) {
            return new afbp();
        } else {
            if (i2 == 4) {
                return new bxvd(f64150d);
            }
            if (i2 == 5) {
                return f64150d;
            }
            bxxk bxxk = f64151e;
            if (bxxk == null) {
                synchronized (afbp.class) {
                    bxxk = f64151e;
                    if (bxxk == null) {
                        bxxk = new bxve(f64150d);
                        f64151e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
