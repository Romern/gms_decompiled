package p000;

/* renamed from: bmlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmlp extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmlp f129947h;

    /* renamed from: j */
    private static volatile bxxk f129948j;

    /* renamed from: a */
    public int f129949a;

    /* renamed from: b */
    public String f129950b = "";

    /* renamed from: c */
    public String f129951c = "";

    /* renamed from: d */
    public String f129952d = "";

    /* renamed from: e */
    public String f129953e = "";

    /* renamed from: f */
    public String f129954f = "";

    /* renamed from: g */
    public int f129955g;

    /* renamed from: i */
    private int f129956i;

    static {
        bmlp bmlp = new bmlp();
        f129947h = bmlp;
        bxvk.m124024a(bmlp.class, bmlp);
    }

    private bmlp() {
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
            return bxvk.m124022a(f129947h, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0007ဈ\u0001\bဈ\u0002\tဈ\u0003\nဈ\u0004\u000bဈ\u0005\fဌ\u0006", new Object[]{"i", "a", bmll.f129945a, "b", "c", "d", "e", "f", "g", bmln.f129946a});
        } else if (i2 == 3) {
            return new bmlp();
        } else {
            if (i2 == 4) {
                return new bxvd(f129947h);
            }
            if (i2 == 5) {
                return f129947h;
            }
            bxxk bxxk = f129948j;
            if (bxxk == null) {
                synchronized (bmlp.class) {
                    bxxk = f129948j;
                    if (bxxk == null) {
                        bxxk = new bxve(f129947h);
                        f129948j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
