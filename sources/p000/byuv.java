package p000;

/* renamed from: byuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byuv f168376b;

    /* renamed from: d */
    private static volatile bxxk f168377d;

    /* renamed from: a */
    public String f168378a = "";

    /* renamed from: c */
    private int f168379c;

    static {
        byuv byuv = new byuv();
        f168376b = byuv;
        GeneratedMessageLite.m124024a(byuv.class, byuv);
    }

    private byuv() {
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
            return GeneratedMessageLite.m124022a(f168376b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byuv();
        } else {
            if (i2 == 4) {
                return new bxvd(f168376b);
            }
            if (i2 == 5) {
                return f168376b;
            }
            bxxk bxxk = f168377d;
            if (bxxk == null) {
                synchronized (byuv.class) {
                    bxxk = f168377d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168376b);
                        f168377d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
