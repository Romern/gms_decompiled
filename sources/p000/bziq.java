package p000;

/* renamed from: bziq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bziq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bziq f170219f;

    /* renamed from: g */
    private static volatile bxxk f170220g;

    /* renamed from: a */
    public int f170221a;

    /* renamed from: b */
    public int f170222b = 1;

    /* renamed from: c */
    public bzim f170223c;

    /* renamed from: d */
    public bzir f170224d;

    /* renamed from: e */
    public bzix f170225e;

    static {
        bziq bziq = new bziq();
        f170219f = bziq;
        bxvk.m124024a(bziq.class, bziq);
    }

    private bziq() {
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
            return bxvk.m124022a(f170219f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", bzip.f170218a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bziq();
        } else {
            if (i2 == 4) {
                return new bxvd(f170219f);
            }
            if (i2 == 5) {
                return f170219f;
            }
            bxxk bxxk = f170220g;
            if (bxxk == null) {
                synchronized (bziq.class) {
                    bxxk = f170220g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170219f);
                        f170220g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
