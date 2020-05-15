package p000;

/* renamed from: bmhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmhb f129389f;

    /* renamed from: g */
    private static volatile bxxk f129390g;

    /* renamed from: a */
    public int f129391a;

    /* renamed from: b */
    public String f129392b = "";

    /* renamed from: c */
    public bxtx f129393c = bxtx.f164797b;

    /* renamed from: d */
    public String f129394d = "";

    /* renamed from: e */
    public bxwc f129395e = bxxn.f165040b;

    static {
        bmhb bmhb = new bmhb();
        f129389f = bmhb;
        bxvk.m124024a(bmhb.class, bmhb);
    }

    private bmhb() {
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
            return bxvk.m124022a(f129389f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", bmqk.class});
        } else if (i2 == 3) {
            return new bmhb();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null);
            }
            if (i2 == 5) {
                return f129389f;
            }
            bxxk bxxk = f129390g;
            if (bxxk == null) {
                synchronized (bmhb.class) {
                    bxxk = f129390g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129389f);
                        f129390g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
