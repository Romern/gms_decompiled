package p000;

/* renamed from: bmfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfe extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmfe f129078f;

    /* renamed from: g */
    private static volatile bxxk f129079g;

    /* renamed from: a */
    public int f129080a;

    /* renamed from: b */
    public long f129081b;

    /* renamed from: c */
    public bxtx f129082c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f129083d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129084e = bxxn.f165040b;

    static {
        bmfe bmfe = new bmfe();
        f129078f = bmfe;
        bxvk.m124024a(bmfe.class, bmfe);
    }

    private bmfe() {
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
            return bxvk.m124022a(f129078f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003\u001b\u0005\u001b", new Object[]{"a", "b", "c", "d", bmed.class, "e", bmfg.class});
        } else if (i2 == 3) {
            return new bmfe();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129078f;
            }
            bxxk bxxk = f129079g;
            if (bxxk == null) {
                synchronized (bmfe.class) {
                    bxxk = f129079g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129078f);
                        f129079g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
