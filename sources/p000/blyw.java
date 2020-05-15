package p000;

/* renamed from: blyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blyw f128318d;

    /* renamed from: f */
    private static volatile bxxk f128319f;

    /* renamed from: a */
    public int f128320a;

    /* renamed from: b */
    public int f128321b;

    /* renamed from: c */
    public int f128322c;

    /* renamed from: e */
    private int f128323e;

    static {
        blyw blyw = new blyw();
        f128318d = blyw;
        GeneratedMessageLite.m124024a(blyw.class, blyw);
    }

    private blyw() {
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
            return GeneratedMessageLite.m124022a(f128318d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"e", "a", blys.f128316a, "b", blyu.f128317a, "c"});
        } else if (i2 == 3) {
            return new blyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f128318d);
            }
            if (i2 == 5) {
                return f128318d;
            }
            bxxk bxxk = f128319f;
            if (bxxk == null) {
                synchronized (blyw.class) {
                    bxxk = f128319f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128318d);
                        f128319f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
