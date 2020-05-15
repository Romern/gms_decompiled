package p000;

/* renamed from: afiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afiu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final afiu f64251d;

    /* renamed from: e */
    private static volatile bxxk f64252e;

    /* renamed from: a */
    public int f64253a;

    /* renamed from: b */
    public int f64254b;

    /* renamed from: c */
    public bxwc f64255c = bxxn.f165040b;

    static {
        afiu afiu = new afiu();
        f64251d = afiu;
        GeneratedMessageLite.m124024a(afiu.class, afiu);
    }

    private afiu() {
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
            return GeneratedMessageLite.m124022a(f64251d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"a", "b", afit.f64250a, "c"});
        } else if (i2 == 3) {
            return new afiu();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f64251d;
            }
            bxxk bxxk = f64252e;
            if (bxxk == null) {
                synchronized (afiu.class) {
                    bxxk = f64252e;
                    if (bxxk == null) {
                        bxxk = new bxve(f64251d);
                        f64252e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
