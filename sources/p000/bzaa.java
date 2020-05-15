package p000;

/* renamed from: bzaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzaa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzaa f169202d;

    /* renamed from: f */
    private static volatile bxxk f169203f;

    /* renamed from: a */
    public String f169204a = "";

    /* renamed from: b */
    public String f169205b = "";

    /* renamed from: c */
    public String f169206c = "";

    /* renamed from: e */
    private int f169207e;

    static {
        bzaa bzaa = new bzaa();
        f169202d = bzaa;
        GeneratedMessageLite.m124024a(bzaa.class, bzaa);
    }

    private bzaa() {
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
            return GeneratedMessageLite.m124022a(f169202d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bzaa();
        } else {
            if (i2 == 4) {
                return new bxvd(f169202d);
            }
            if (i2 == 5) {
                return f169202d;
            }
            bxxk bxxk = f169203f;
            if (bxxk == null) {
                synchronized (bzaa.class) {
                    bxxk = f169203f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169202d);
                        f169203f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
