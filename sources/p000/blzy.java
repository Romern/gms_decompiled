package p000;

/* renamed from: blzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blzy f128419d;

    /* renamed from: e */
    private static volatile bxxk f128420e;

    /* renamed from: a */
    public int f128421a;

    /* renamed from: b */
    public String f128422b = "";

    /* renamed from: c */
    public String f128423c = "";

    static {
        blzy blzy = new blzy();
        f128419d = blzy;
        GeneratedMessageLite.m124024a(blzy.class, blzy);
    }

    private blzy() {
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
            return GeneratedMessageLite.m124022a(f128419d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f128419d);
            }
            if (i2 == 5) {
                return f128419d;
            }
            bxxk bxxk = f128420e;
            if (bxxk == null) {
                synchronized (blzy.class) {
                    bxxk = f128420e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128419d);
                        f128420e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
