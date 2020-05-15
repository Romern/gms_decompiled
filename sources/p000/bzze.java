package p000;

/* renamed from: bzze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzze extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzze f171962c;

    /* renamed from: e */
    private static volatile bxxk f171963e;

    /* renamed from: a */
    public String f171964a = "";

    /* renamed from: b */
    public String f171965b = "";

    /* renamed from: d */
    private int f171966d;

    static {
        bzze bzze = new bzze();
        f171962c = bzze;
        GeneratedMessageLite.m124024a(bzze.class, bzze);
    }

    private bzze() {
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
            return GeneratedMessageLite.m124022a(f171962c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzze();
        } else {
            if (i2 == 4) {
                return new bxvd(f171962c);
            }
            if (i2 == 5) {
                return f171962c;
            }
            bxxk bxxk = f171963e;
            if (bxxk == null) {
                synchronized (bzze.class) {
                    bxxk = f171963e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171962c);
                        f171963e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
