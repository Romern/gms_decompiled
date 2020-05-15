package p000;

/* renamed from: sxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxl extends bxvk implements bxxd {

    /* renamed from: q */
    public static final sxl f45372q;

    /* renamed from: r */
    private static volatile bxxk f45373r;

    /* renamed from: a */
    public int f45374a;

    /* renamed from: b */
    public String f45375b = "";

    /* renamed from: c */
    public String f45376c = "";

    /* renamed from: d */
    public String f45377d = "";

    /* renamed from: e */
    public bxwc f45378e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f45379f = bxxn.f165040b;

    /* renamed from: g */
    public int f45380g;

    /* renamed from: h */
    public String f45381h = "";

    /* renamed from: i */
    public String f45382i = "";

    /* renamed from: j */
    public String f45383j = "";

    /* renamed from: k */
    public bxwc f45384k = bxxn.f165040b;

    /* renamed from: l */
    public int f45385l;

    /* renamed from: m */
    public bxwc f45386m = bxxn.f165040b;

    /* renamed from: n */
    public int f45387n;

    /* renamed from: o */
    public int f45388o;

    /* renamed from: p */
    public int f45389p;

    static {
        sxl sxl = new sxl();
        f45372q = sxl;
        bxvk.m124024a(sxl.class, sxl);
    }

    private sxl() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f45372q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0004\u0000\u0001ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001b\t\u001b\u000bင\b\fဈ\n\rဈ\t\u000eဈ\u000b\u000f\u001a\u0010င\f\u0011\u001b\u0012င\r\u0013င\u000e\u0014င\u000f", new Object[]{"a", "b", "c", "d", "e", sxk.class, "f", sxk.class, "g", "i", "h", "j", "k", "l", "m", sxk.class, "n", "o", "p"});
        } else if (i2 == 3) {
            return new sxl();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f45372q;
            }
            bxxk bxxk = f45373r;
            if (bxxk == null) {
                synchronized (sxl.class) {
                    bxxk = f45373r;
                    if (bxxk == null) {
                        bxxk = new bxve(f45372q);
                        f45373r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
