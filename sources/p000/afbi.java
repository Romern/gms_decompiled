package p000;

/* renamed from: afbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final afbi f64137c;

    /* renamed from: d */
    private static volatile bxxk f64138d;

    /* renamed from: a */
    public int f64139a;

    /* renamed from: b */
    public afbf f64140b;

    static {
        afbi afbi = new afbi();
        f64137c = afbi;
        GeneratedMessageLite.m124024a(afbi.class, afbi);
    }

    private afbi() {
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
            return GeneratedMessageLite.m124022a(f64137c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new afbi();
        } else {
            if (i2 == 4) {
                return new bxvd(f64137c);
            }
            if (i2 == 5) {
                return f64137c;
            }
            bxxk bxxk = f64138d;
            if (bxxk == null) {
                synchronized (afbi.class) {
                    bxxk = f64138d;
                    if (bxxk == null) {
                        bxxk = new bxve(f64137c);
                        f64138d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
