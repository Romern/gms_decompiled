package p000;

/* renamed from: bzfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzfb f169764b;

    /* renamed from: c */
    public static final bxvj f169765c;

    /* renamed from: e */
    private static volatile bxxk f169766e;

    /* renamed from: a */
    public bzft f169767a;

    /* renamed from: d */
    private int f169768d;

    static {
        bzfb bzfb = new bzfb();
        f169764b = bzfb;
        bxvk.m124024a(bzfb.class, bzfb);
        blcd blcd = blcd.f125907a;
        bzfb bzfb2 = f169764b;
        f169765c = bxvk.m124006a(blcd, bzfb2, bzfb2, 90751297, bxzf.MESSAGE);
    }

    private bzfb() {
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
            return bxvk.m124022a(f169764b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bzfb();
        } else {
            if (i2 == 4) {
                return new bxvd(f169764b);
            }
            if (i2 == 5) {
                return f169764b;
            }
            bxxk bxxk = f169766e;
            if (bxxk == null) {
                synchronized (bzfb.class) {
                    bxxk = f169766e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169764b);
                        f169766e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
