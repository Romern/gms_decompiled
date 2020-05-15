package p000;

/* renamed from: blzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blzv f128398c;

    /* renamed from: e */
    private static volatile bxxk f128399e;

    /* renamed from: a */
    public String f128400a = "";

    /* renamed from: b */
    public String f128401b = "";

    /* renamed from: d */
    private int f128402d;

    static {
        blzv blzv = new blzv();
        f128398c = blzv;
        GeneratedMessageLite.m124024a(blzv.class, blzv);
    }

    private blzv() {
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
            return GeneratedMessageLite.m124022a(f128398c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blzv();
        } else {
            if (i2 == 4) {
                return new bxvd(f128398c);
            }
            if (i2 == 5) {
                return f128398c;
            }
            bxxk bxxk = f128399e;
            if (bxxk == null) {
                synchronized (blzv.class) {
                    bxxk = f128399e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128398c);
                        f128399e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
