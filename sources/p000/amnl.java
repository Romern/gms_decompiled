package p000;

/* renamed from: amnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnl extends bxvk implements bxxd {

    /* renamed from: f */
    public static final amnl f75504f;

    /* renamed from: g */
    private static volatile bxxk f75505g;

    /* renamed from: a */
    public int f75506a;

    /* renamed from: b */
    public int f75507b;

    /* renamed from: c */
    public int f75508c;

    /* renamed from: d */
    public int f75509d;

    /* renamed from: e */
    public int f75510e;

    static {
        amnl amnl = new amnl();
        f75504f = amnl;
        bxvk.m124024a(amnl.class, amnl);
    }

    private amnl() {
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
            return bxvk.m124022a(f75504f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", amjf.m62966b(), "c", "d", amkb.m62995b(), "e", amjd.m62962b()});
        } else if (i2 == 3) {
            return new amnl();
        } else {
            if (i2 == 4) {
                return new bxvd(f75504f);
            }
            if (i2 == 5) {
                return f75504f;
            }
            bxxk bxxk = f75505g;
            if (bxxk == null) {
                synchronized (amnl.class) {
                    bxxk = f75505g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75504f);
                        f75505g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
