package p000;

/* renamed from: bmgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgx extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmgx f129356h;

    /* renamed from: i */
    private static volatile bxxk f129357i;

    /* renamed from: a */
    public int f129358a;

    /* renamed from: b */
    public long f129359b;

    /* renamed from: c */
    public String f129360c = "";

    /* renamed from: d */
    public bmnr f129361d;

    /* renamed from: e */
    public bmnr f129362e;

    /* renamed from: f */
    public bxtx f129363f = bxtx.f164797b;

    /* renamed from: g */
    public boolean f129364g;

    static {
        bmgx bmgx = new bmgx();
        f129356h = bmgx;
        bxvk.m124024a(bmgx.class, bmgx);
    }

    private bmgx() {
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
            return bxvk.m124022a(f129356h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0003ည\u0004\u0005ဇ\u0006\u0006ဉ\u0002\u0007ဉ\u0003\bဂ\u0000", new Object[]{"a", "c", "f", "g", "d", "e", "b"});
        } else if (i2 == 3) {
            return new bmgx();
        } else {
            if (i2 == 4) {
                return new bxvd(f129356h);
            }
            if (i2 == 5) {
                return f129356h;
            }
            bxxk bxxk = f129357i;
            if (bxxk == null) {
                synchronized (bmgx.class) {
                    bxxk = f129357i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129356h);
                        f129357i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
