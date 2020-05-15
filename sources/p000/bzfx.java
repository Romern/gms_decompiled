package p000;

/* renamed from: bzfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzfx f169887d;

    /* renamed from: e */
    private static volatile bxxk f169888e;

    /* renamed from: a */
    public int f169889a;

    /* renamed from: b */
    public String f169890b = "";

    /* renamed from: c */
    public String f169891c = "";

    static {
        bzfx bzfx = new bzfx();
        f169887d = bzfx;
        bxvk.m124024a(bzfx.class, bzfx);
    }

    private bzfx() {
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
            return bxvk.m124022a(f169887d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzfx();
        } else {
            if (i2 == 4) {
                return new bxvd(f169887d);
            }
            if (i2 == 5) {
                return f169887d;
            }
            bxxk bxxk = f169888e;
            if (bxxk == null) {
                synchronized (bzfx.class) {
                    bxxk = f169888e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169887d);
                        f169888e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
