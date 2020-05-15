package p000;

/* renamed from: bylg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bylg f166825e;

    /* renamed from: g */
    private static volatile bxxk f166826g;

    /* renamed from: a */
    public int f166827a;

    /* renamed from: b */
    public boolean f166828b;

    /* renamed from: c */
    public int f166829c;

    /* renamed from: d */
    public boolean f166830d;

    /* renamed from: f */
    private int f166831f;

    static {
        bylg bylg = new bylg();
        f166825e = bylg;
        bxvk.m124024a(bylg.class, bylg);
    }

    private bylg() {
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
            return bxvk.m124022a(f166825e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", byle.f166824a, "b", "c", bylc.f166823a, "d"});
        } else if (i2 == 3) {
            return new bylg();
        } else {
            if (i2 == 4) {
                return new bxvd(f166825e);
            }
            if (i2 == 5) {
                return f166825e;
            }
            bxxk bxxk = f166826g;
            if (bxxk == null) {
                synchronized (bylg.class) {
                    bxxk = f166826g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166825e);
                        f166826g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
