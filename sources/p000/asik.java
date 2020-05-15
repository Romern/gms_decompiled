package p000;

/* renamed from: asik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asik extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final asik f89043b;

    /* renamed from: c */
    private static volatile bxxk f89044c;

    /* renamed from: a */
    public long f89045a;

    static {
        asik asik = new asik();
        f89043b = asik;
        GeneratedMessageLite.m124024a(asik.class, asik);
    }

    private asik() {
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
            return GeneratedMessageLite.m124022a(f89043b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new asik();
        } else {
            if (i2 == 4) {
                return new bxvd(f89043b);
            }
            if (i2 == 5) {
                return f89043b;
            }
            bxxk bxxk = f89044c;
            if (bxxk == null) {
                synchronized (asik.class) {
                    bxxk = f89044c;
                    if (bxxk == null) {
                        bxxk = new bxve(f89043b);
                        f89044c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
