package p000;

/* renamed from: afbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final afbg f64133a;

    /* renamed from: b */
    private static volatile bxxk f64134b;

    static {
        afbg afbg = new afbg();
        f64133a = afbg;
        GeneratedMessageLite.m124024a(afbg.class, afbg);
    }

    private afbg() {
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
            return GeneratedMessageLite.m124022a(f64133a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new afbg();
        }
        if (i2 == 4) {
            return new bxvd(f64133a);
        }
        if (i2 == 5) {
            return f64133a;
        }
        bxxk bxxk = f64134b;
        if (bxxk == null) {
            synchronized (afbg.class) {
                bxxk = f64134b;
                if (bxxk == null) {
                    bxxk = new bxve(f64133a);
                    f64134b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
