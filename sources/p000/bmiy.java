package p000;

/* renamed from: bmiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmiy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmiy f129654d;

    /* renamed from: f */
    private static volatile bxxk f129655f;

    /* renamed from: a */
    public String f129656a = "";

    /* renamed from: b */
    public String f129657b = "";

    /* renamed from: c */
    public String f129658c = "";

    /* renamed from: e */
    private int f129659e;

    static {
        bmiy bmiy = new bmiy();
        f129654d = bmiy;
        GeneratedMessageLite.m124024a(bmiy.class, bmiy);
    }

    private bmiy() {
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
            return GeneratedMessageLite.m124022a(f129654d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bmiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f129654d);
            }
            if (i2 == 5) {
                return f129654d;
            }
            bxxk bxxk = f129655f;
            if (bxxk == null) {
                synchronized (bmiy.class) {
                    bxxk = f129655f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129654d);
                        f129655f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
