package p000;

/* renamed from: bmgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmgz f129371e;

    /* renamed from: f */
    private static volatile bxxk f129372f;

    /* renamed from: a */
    public int f129373a;

    /* renamed from: b */
    public String f129374b = "";

    /* renamed from: c */
    public bxtx f129375c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f129376d = bxtx.f164797b;

    static {
        bmgz bmgz = new bmgz();
        f129371e = bmgz;
        bxvk.m124024a(bmgz.class, bmgz);
    }

    private bmgz() {
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
            return bxvk.m124022a(f129371e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmgz();
        } else {
            if (i2 == 4) {
                return new bxvd(f129371e);
            }
            if (i2 == 5) {
                return f129371e;
            }
            bxxk bxxk = f129372f;
            if (bxxk == null) {
                synchronized (bmgz.class) {
                    bxxk = f129372f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129371e);
                        f129372f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
