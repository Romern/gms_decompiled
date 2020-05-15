package p000;

/* renamed from: bmjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjc extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bmjc f129674i;

    /* renamed from: j */
    private static volatile bxxk f129675j;

    /* renamed from: a */
    public int f129676a;

    /* renamed from: b */
    public bmqk f129677b;

    /* renamed from: c */
    public bmqk f129678c;

    /* renamed from: d */
    public bxwc f129679d = bxxn.f165040b;

    /* renamed from: e */
    public String f129680e = "";

    /* renamed from: f */
    public int f129681f;

    /* renamed from: g */
    public String f129682g = "";

    /* renamed from: h */
    public bxtx f129683h = bxtx.f164797b;

    static {
        bmjc bmjc = new bmjc();
        f129674i = bmjc;
        bxvk.m124024a(bmjc.class, bmjc);
    }

    private bmjc() {
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
            return bxvk.m124022a(f129674i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ဈ\u0004\u0005ဈ\u0002\u0007ည\u0005\b\u001b", new Object[]{"a", "b", "c", "f", bmiz.f129660a, "g", "e", "h", "d", bmqk.class});
        } else if (i2 == 3) {
            return new bmjc();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f129674i;
            }
            bxxk bxxk = f129675j;
            if (bxxk == null) {
                synchronized (bmjc.class) {
                    bxxk = f129675j;
                    if (bxxk == null) {
                        bxxk = new bxve(f129674i);
                        f129675j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
