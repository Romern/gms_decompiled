package p000;

/* renamed from: bmgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgk extends bxvk implements bxxd {

    /* renamed from: r */
    public static final bmgk f129245r;

    /* renamed from: t */
    private static volatile bxxk f129246t;

    /* renamed from: a */
    public int f129247a;

    /* renamed from: b */
    public long f129248b;

    /* renamed from: c */
    public String f129249c = "";

    /* renamed from: d */
    public bxtx f129250d = bxtx.f164797b;

    /* renamed from: e */
    public String f129251e = "";

    /* renamed from: f */
    public bxwc f129252f = bxxn.f165040b;

    /* renamed from: g */
    public String f129253g = "";

    /* renamed from: h */
    public bmeb f129254h;

    /* renamed from: i */
    public bmfu f129255i;

    /* renamed from: j */
    public bmno f129256j;

    /* renamed from: k */
    public bxwc f129257k = bxxn.f165040b;

    /* renamed from: l */
    public boolean f129258l = true;

    /* renamed from: m */
    public int f129259m;

    /* renamed from: n */
    public bmge f129260n;

    /* renamed from: o */
    public bmkl f129261o;

    /* renamed from: p */
    public bmfy f129262p;

    /* renamed from: q */
    public bwdm f129263q;

    /* renamed from: s */
    private byte f129264s = 2;

    static {
        bmgk bmgk = new bmgk();
        f129245r = bmgk;
        bxvk.m124024a(bmgk.class, bmgk);
    }

    private bmgk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129264s);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129264s = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129245r, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0002\u0003\u0001ဈ\u0001\u0002ဈ\u0003\u0003ဈ\u0004\u0005ဇ\t\u0007ဉ\b\bᐉ\u000b\tဂ\u0000\nဉ\r\u000bဌ\n\fည\u0002\rᐉ\u0005\u000fᐉ\u0006\u0010\u001b\u0012ဉ\f\u0013\u001a\u0014ဉ\u000e", new Object[]{"a", "c", "e", "g", "l", "j", "n", "b", "p", "m", bmgi.f129244a, "d", "h", "i", "k", bmno.class, "o", "f", "q"});
        } else if (i2 == 3) {
            return new bmgk();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129245r;
            }
            bxxk bxxk = f129246t;
            if (bxxk == null) {
                synchronized (bmgk.class) {
                    bxxk = f129246t;
                    if (bxxk == null) {
                        bxxk = new bxve(f129245r);
                        f129246t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
