package p000;

/* renamed from: blre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blre extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blre f127439b;

    /* renamed from: d */
    private static volatile bxxk f127440d;

    /* renamed from: a */
    public String f127441a = "";

    /* renamed from: c */
    private int f127442c;

    static {
        blre blre = new blre();
        f127439b = blre;
        GeneratedMessageLite.m124024a(blre.class, blre);
    }

    private blre() {
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
            return GeneratedMessageLite.m124022a(f127439b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blre();
        } else {
            if (i2 == 4) {
                return new bxvd(f127439b);
            }
            if (i2 == 5) {
                return f127439b;
            }
            bxxk bxxk = f127440d;
            if (bxxk == null) {
                synchronized (blre.class) {
                    bxxk = f127440d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127439b);
                        f127440d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
