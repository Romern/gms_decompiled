package p000;

/* renamed from: bmav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmav extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmav f128500h;

    /* renamed from: i */
    private static volatile bxxk f128501i;

    /* renamed from: a */
    public int f128502a;

    /* renamed from: b */
    public String f128503b = "";

    /* renamed from: c */
    public int f128504c = 1;

    /* renamed from: d */
    public bxwc f128505d = bxxn.f165040b;

    /* renamed from: e */
    public String f128506e = "";

    /* renamed from: f */
    public String f128507f = "";

    /* renamed from: g */
    public bxtx f128508g = bxtx.f164797b;

    static {
        bmav bmav = new bmav();
        f128500h = bmav;
        bxvk.m124024a(bmav.class, bmav);
    }

    private bmav() {
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
            return bxvk.m124022a(f128500h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဌ\u0003\u0006ည\u0006", new Object[]{"a", "b", "d", bmas.class, "e", "f", "c", bmat.f128499a, "g"});
        } else if (i2 == 3) {
            return new bmav();
        } else {
            if (i2 == 4) {
                return new bxvd(f128500h);
            }
            if (i2 == 5) {
                return f128500h;
            }
            bxxk bxxk = f128501i;
            if (bxxk == null) {
                synchronized (bmav.class) {
                    bxxk = f128501i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128500h);
                        f128501i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
