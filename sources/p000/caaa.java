package p000;

/* renamed from: caaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caaa extends bxvk implements bxxd {

    /* renamed from: j */
    public static final caaa f172305j;

    /* renamed from: k */
    private static volatile bxxk f172306k;

    /* renamed from: a */
    public int f172307a;

    /* renamed from: b */
    public long f172308b;

    /* renamed from: c */
    public long f172309c;

    /* renamed from: d */
    public String f172310d = "";

    /* renamed from: e */
    public String f172311e = "";

    /* renamed from: f */
    public bxwc f172312f = bxxn.f165040b;

    /* renamed from: g */
    public long f172313g;

    /* renamed from: h */
    public long f172314h;

    /* renamed from: i */
    public bxtx f172315i = bxtx.f164797b;

    static {
        caaa caaa = new caaa();
        f172305j = caaa;
        bxvk.m124024a(caaa.class, caaa);
    }

    private caaa() {
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
            return bxvk.m124022a(f172305j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001b\u0006ဂ\u0004\u0007ဂ\u0005\tည\u0007", new Object[]{"a", "b", "c", "d", "e", "f", caaw.class, "g", "h", "i"});
        } else if (i2 == 3) {
            return new caaa();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f172305j;
            }
            bxxk bxxk = f172306k;
            if (bxxk == null) {
                synchronized (caaa.class) {
                    bxxk = f172306k;
                    if (bxxk == null) {
                        bxxk = new bxve(f172305j);
                        f172306k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
