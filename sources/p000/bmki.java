package p000;

/* renamed from: bmki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmki extends bxvk implements bxxd {

    /* renamed from: w */
    public static final bmki f129802w;

    /* renamed from: y */
    private static volatile bxxk f129803y;

    /* renamed from: a */
    public int f129804a;

    /* renamed from: b */
    public bmdn f129805b;

    /* renamed from: c */
    public String f129806c = "";

    /* renamed from: d */
    public String f129807d = "";

    /* renamed from: e */
    public String f129808e = "";

    /* renamed from: f */
    public String f129809f = "";

    /* renamed from: g */
    public String f129810g = "";

    /* renamed from: h */
    public bmdb f129811h;

    /* renamed from: i */
    public int f129812i;

    /* renamed from: j */
    public boolean f129813j;

    /* renamed from: k */
    public bxwc f129814k = bxxn.f165040b;

    /* renamed from: l */
    public String f129815l = "";

    /* renamed from: m */
    public String f129816m = "";

    /* renamed from: n */
    public String f129817n = "";

    /* renamed from: o */
    public String f129818o = "";

    /* renamed from: p */
    public String f129819p = "";

    /* renamed from: q */
    public bxwc f129820q = bxxn.f165040b;

    /* renamed from: r */
    public bmeb f129821r;

    /* renamed from: s */
    public String f129822s = "";

    /* renamed from: t */
    public bmac f129823t;

    /* renamed from: u */
    public boolean f129824u;

    /* renamed from: v */
    public int f129825v = 1;

    /* renamed from: x */
    private byte f129826x = 2;

    static {
        bmki bmki = new bmki();
        f129802w = bmki;
        bxvk.m124024a(bmki.class, bmki);
    }

    private bmki() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129826x);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129826x = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129802w, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဉ\u0006\u0007ဌ\u0007\bဇ\b\t\u001a\nဈ\t\rဈ\n\u000eဈ\u000b\u000fဈ\f\u0010\u001b\u0011ဈ\u0003\u0012ဈ\r\u0014ᐉ\u000e\u0016ဈ\u000f\u0018ဉ\u0010\u0019ဇ\u0011\u001aဌ\u0012", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", bmkf.m108113b(), "j", "k", "l", "m", "n", "o", "q", bmkd.class, "e", "p", "r", "s", "t", "u", "v", bmkg.f129801a});
        } else if (i2 == 3) {
            return new bmki();
        } else {
            if (i2 == 4) {
                return new bxvd(f129802w);
            }
            if (i2 == 5) {
                return f129802w;
            }
            bxxk bxxk = f129803y;
            if (bxxk == null) {
                synchronized (bmki.class) {
                    bxxk = f129803y;
                    if (bxxk == null) {
                        bxxk = new bxve(f129802w);
                        f129803y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
