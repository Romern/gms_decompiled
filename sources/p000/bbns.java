package p000;

/* renamed from: bbns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbns extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bbns f102968e;

    /* renamed from: g */
    private static volatile bxxk f102969g;

    /* renamed from: a */
    public int f102970a;

    /* renamed from: b */
    public int f102971b;

    /* renamed from: c */
    public long f102972c;

    /* renamed from: d */
    public long f102973d;

    /* renamed from: f */
    private byte f102974f = 2;

    static {
        bbns bbns = new bbns();
        f102968e = bbns;
        bxvk.m124024a(bbns.class, bbns);
    }

    private bbns() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f102974f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f102974f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f102968e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bbns();
        } else {
            if (i2 == 4) {
                return new bxvd(f102968e);
            }
            if (i2 == 5) {
                return f102968e;
            }
            bxxk bxxk = f102969g;
            if (bxxk == null) {
                synchronized (bbns.class) {
                    bxxk = f102969g;
                    if (bxxk == null) {
                        bxxk = new bxve(f102968e);
                        f102969g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
