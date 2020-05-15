package p000;

/* renamed from: bmcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmcw f128758e;

    /* renamed from: g */
    private static volatile bxxk f128759g;

    /* renamed from: a */
    public String f128760a = "";

    /* renamed from: b */
    public int f128761b;

    /* renamed from: c */
    public String f128762c = "";

    /* renamed from: d */
    public boolean f128763d;

    /* renamed from: f */
    private int f128764f;

    static {
        bmcw bmcw = new bmcw();
        f128758e = bmcw;
        bxvk.m124024a(bmcw.class, bmcw);
    }

    private bmcw() {
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
            return bxvk.m124022a(f128758e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဌ\u0001", new Object[]{"f", "a", "c", "d", "b", bmcd.f128662a});
        } else if (i2 == 3) {
            return new bmcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f128758e);
            }
            if (i2 == 5) {
                return f128758e;
            }
            bxxk bxxk = f128759g;
            if (bxxk == null) {
                synchronized (bmcw.class) {
                    bxxk = f128759g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128758e);
                        f128759g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
