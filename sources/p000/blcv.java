package p000;

/* renamed from: blcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blcv f125988c;

    /* renamed from: e */
    private static volatile bxxk f125989e;

    /* renamed from: a */
    public String f125990a = "";

    /* renamed from: b */
    public String f125991b = "";

    /* renamed from: d */
    private int f125992d;

    static {
        blcv blcv = new blcv();
        f125988c = blcv;
        GeneratedMessageLite.m124024a(blcv.class, blcv);
    }

    private blcv() {
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
            return GeneratedMessageLite.m124022a(f125988c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f125988c);
            }
            if (i2 == 5) {
                return f125988c;
            }
            bxxk bxxk = f125989e;
            if (bxxk == null) {
                synchronized (blcv.class) {
                    bxxk = f125989e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125988c);
                        f125989e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
