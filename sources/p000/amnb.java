package p000;

/* renamed from: amnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnb extends bxvk implements bxxd {

    /* renamed from: g */
    public static final amnb f75414g;

    /* renamed from: h */
    private static volatile bxxk f75415h;

    /* renamed from: a */
    public int f75416a;

    /* renamed from: b */
    public int f75417b;

    /* renamed from: c */
    public int f75418c;

    /* renamed from: d */
    public int f75419d;

    /* renamed from: e */
    public int f75420e;

    /* renamed from: f */
    public int f75421f;

    static {
        amnb amnb = new amnb();
        f75414g = amnb;
        bxvk.m124024a(amnb.class, amnb);
    }

    private amnb() {
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
            return bxvk.m124022a(f75414g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", amna.f75413a, "c", "d", "e", amjx.m62989b(), "f", amkr.f75076a});
        } else if (i2 == 3) {
            return new amnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f75414g);
            }
            if (i2 == 5) {
                return f75414g;
            }
            bxxk bxxk = f75415h;
            if (bxxk == null) {
                synchronized (amnb.class) {
                    bxxk = f75415h;
                    if (bxxk == null) {
                        bxxk = new bxve(f75414g);
                        f75415h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
