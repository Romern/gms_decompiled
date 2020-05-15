package p000;

/* renamed from: bmac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmac extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmac f128430c;

    /* renamed from: e */
    private static volatile bxxk f128431e;

    /* renamed from: a */
    public String f128432a = "";

    /* renamed from: b */
    public bmnr f128433b;

    /* renamed from: d */
    private int f128434d;

    static {
        bmac bmac = new bmac();
        f128430c = bmac;
        GeneratedMessageLite.m124024a(bmac.class, bmac);
    }

    private bmac() {
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
            return GeneratedMessageLite.m124022a(f128430c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmac();
        } else {
            if (i2 == 4) {
                return new bxvd(f128430c);
            }
            if (i2 == 5) {
                return f128430c;
            }
            bxxk bxxk = f128431e;
            if (bxxk == null) {
                synchronized (bmac.class) {
                    bxxk = f128431e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128430c);
                        f128431e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
