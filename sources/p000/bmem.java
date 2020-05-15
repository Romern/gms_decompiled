package p000;

/* renamed from: bmem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmem extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmem f128964c;

    /* renamed from: e */
    private static volatile bxxk f128965e;

    /* renamed from: a */
    public long f128966a;

    /* renamed from: b */
    public bxwc f128967b = bxxn.f165040b;

    /* renamed from: d */
    private int f128968d;

    static {
        bmem bmem = new bmem();
        f128964c = bmem;
        bxvk.m124024a(bmem.class, bmem);
    }

    private bmem() {
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
            return bxvk.m124022a(f128964c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0004\u001b", new Object[]{"d", "a", "b", bwhm.class});
        } else if (i2 == 3) {
            return new bmem();
        } else {
            if (i2 == 4) {
                return new bxvd(f128964c);
            }
            if (i2 == 5) {
                return f128964c;
            }
            bxxk bxxk = f128965e;
            if (bxxk == null) {
                synchronized (bmem.class) {
                    bxxk = f128965e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128964c);
                        f128965e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
