package p000;

/* renamed from: bmbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmbu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmbu f128626e;

    /* renamed from: f */
    private static volatile bxxk f128627f;

    /* renamed from: a */
    public int f128628a;

    /* renamed from: b */
    public String f128629b = "";

    /* renamed from: c */
    public bxtx f128630c = bxtx.f164797b;

    /* renamed from: d */
    public String f128631d = "";

    static {
        bmbu bmbu = new bmbu();
        f128626e = bmbu;
        bxvk.m124024a(bmbu.class, bmbu);
    }

    private bmbu() {
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
            return bxvk.m124022a(f128626e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmbu();
        } else {
            if (i2 == 4) {
                return new bxvd(f128626e);
            }
            if (i2 == 5) {
                return f128626e;
            }
            bxxk bxxk = f128627f;
            if (bxxk == null) {
                synchronized (bmbu.class) {
                    bxxk = f128627f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128626e);
                        f128627f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
