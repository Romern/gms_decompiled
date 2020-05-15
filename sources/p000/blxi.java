package p000;

/* renamed from: blxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blxi f128068c;

    /* renamed from: e */
    private static volatile bxxk f128069e;

    /* renamed from: a */
    public String f128070a = "";

    /* renamed from: b */
    public blxh f128071b;

    /* renamed from: d */
    private int f128072d;

    static {
        blxi blxi = new blxi();
        f128068c = blxi;
        bxvk.m124024a(blxi.class, blxi);
    }

    private blxi() {
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
            return bxvk.m124022a(f128068c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f128068c);
            }
            if (i2 == 5) {
                return f128068c;
            }
            bxxk bxxk = f128069e;
            if (bxxk == null) {
                synchronized (blxi.class) {
                    bxxk = f128069e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128068c);
                        f128069e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
