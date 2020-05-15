package p000;

/* renamed from: blzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blzr f128380e;

    /* renamed from: f */
    private static volatile bxxk f128381f;

    /* renamed from: a */
    public int f128382a;

    /* renamed from: b */
    public bxtx f128383b = bxtx.f164797b;

    /* renamed from: c */
    public btwp f128384c;

    /* renamed from: d */
    public String f128385d = "";

    static {
        blzr blzr = new blzr();
        f128380e = blzr;
        bxvk.m124024a(blzr.class, blzr);
    }

    private blzr() {
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
            return bxvk.m124022a(f128380e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဈ\u0002\u0003ည\u0000", new Object[]{"a", "c", "d", "b"});
        } else if (i2 == 3) {
            return new blzr();
        } else {
            if (i2 == 4) {
                return new bxvd(f128380e);
            }
            if (i2 == 5) {
                return f128380e;
            }
            bxxk bxxk = f128381f;
            if (bxxk == null) {
                synchronized (blzr.class) {
                    bxxk = f128381f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128380e);
                        f128381f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
