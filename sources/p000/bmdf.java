package p000;

/* renamed from: bmdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmdf f128792c;

    /* renamed from: e */
    private static volatile bxxk f128793e;

    /* renamed from: a */
    public String f128794a = "";

    /* renamed from: b */
    public String f128795b = "";

    /* renamed from: d */
    private int f128796d;

    static {
        bmdf bmdf = new bmdf();
        f128792c = bmdf;
        GeneratedMessageLite.m124024a(bmdf.class, bmdf);
    }

    private bmdf() {
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
            return GeneratedMessageLite.m124022a(f128792c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmdf();
        } else {
            if (i2 == 4) {
                return new bxvd(f128792c);
            }
            if (i2 == 5) {
                return f128792c;
            }
            bxxk bxxk = f128793e;
            if (bxxk == null) {
                synchronized (bmdf.class) {
                    bxxk = f128793e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128792c);
                        f128793e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
