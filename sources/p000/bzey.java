package p000;

/* renamed from: bzey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzey extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzey f169745e;

    /* renamed from: f */
    public static final bxvj f169746f;

    /* renamed from: g */
    private static volatile bxxk f169747g;

    /* renamed from: a */
    public int f169748a;

    /* renamed from: b */
    public bzex f169749b;

    /* renamed from: c */
    public bzfx f169750c;

    /* renamed from: d */
    public bzgm f169751d;

    static {
        bzey bzey = new bzey();
        f169745e = bzey;
        bxvk.m124024a(bzey.class, bzey);
        blcc blcc = blcc.f125904a;
        bzey bzey2 = f169745e;
        f169746f = bxvk.m124006a(blcc, bzey2, bzey2, 90015708, bxzf.MESSAGE);
    }

    private bzey() {
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
            return bxvk.m124022a(f169745e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzey();
        } else {
            if (i2 == 4) {
                return new bxvd(f169745e);
            }
            if (i2 == 5) {
                return f169745e;
            }
            bxxk bxxk = f169747g;
            if (bxxk == null) {
                synchronized (bzey.class) {
                    bxxk = f169747g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169745e);
                        f169747g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
