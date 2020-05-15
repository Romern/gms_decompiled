package p000;

/* renamed from: bmcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmcb f128649e;

    /* renamed from: g */
    private static volatile bxxk f128650g;

    /* renamed from: a */
    public int f128651a;

    /* renamed from: b */
    public bmdn f128652b;

    /* renamed from: c */
    public bxwc f128653c = bxxn.f165040b;

    /* renamed from: d */
    public bmct f128654d;

    /* renamed from: f */
    private byte f128655f = 2;

    static {
        bmcb bmcb = new bmcb();
        f128649e = bmcb;
        bxvk.m124024a(bmcb.class, bmcb);
    }

    private bmcb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128655f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128655f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128649e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ဉ\u0001", new Object[]{"a", "b", "c", bmca.class, "d"});
        } else if (i2 == 3) {
            return new bmcb();
        } else {
            if (i2 == 4) {
                return new bxvd(f128649e);
            }
            if (i2 == 5) {
                return f128649e;
            }
            bxxk bxxk = f128650g;
            if (bxxk == null) {
                synchronized (bmcb.class) {
                    bxxk = f128650g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128649e);
                        f128650g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
