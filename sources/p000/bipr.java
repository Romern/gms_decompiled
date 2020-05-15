package p000;

/* renamed from: bipr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bipr f121205e;

    /* renamed from: g */
    private static volatile bxxk f121206g;

    /* renamed from: a */
    public int f121207a;

    /* renamed from: b */
    public int f121208b;

    /* renamed from: c */
    public int f121209c;

    /* renamed from: d */
    public int f121210d;

    /* renamed from: f */
    private byte f121211f = 2;

    static {
        bipr bipr = new bipr();
        f121205e = bipr;
        bxvk.m124024a(bipr.class, bipr);
    }

    private bipr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121211f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121211f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121205e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bipr();
        } else {
            if (i2 == 4) {
                return new bxvd(f121205e);
            }
            if (i2 == 5) {
                return f121205e;
            }
            bxxk bxxk = f121206g;
            if (bxxk == null) {
                synchronized (bipr.class) {
                    bxxk = f121206g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121205e);
                        f121206g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
