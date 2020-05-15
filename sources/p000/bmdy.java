package p000;

/* renamed from: bmdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmdy f128893c;

    /* renamed from: d */
    private static volatile bxxk f128894d;

    /* renamed from: a */
    public int f128895a = 0;

    /* renamed from: b */
    public Object f128896b;

    static {
        bmdy bmdy = new bmdy();
        f128893c = bmdy;
        bxvk.m124024a(bmdy.class, bmdy);
    }

    private bmdy() {
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
            return bxvk.m124022a(f128893c, "\u0001\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", bmqk.class, bmbs.class, bmdt.class, bmjk.class, bmdw.class, bmbu.class, bmnk.class, bmcc.class});
        } else if (i2 == 3) {
            return new bmdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f128893c);
            }
            if (i2 == 5) {
                return f128893c;
            }
            bxxk bxxk = f128894d;
            if (bxxk == null) {
                synchronized (bmdy.class) {
                    bxxk = f128894d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128893c);
                        f128894d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
