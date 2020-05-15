package p000;

/* renamed from: bmqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqf extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bmqf f130370r;

    /* renamed from: s */
    private static volatile bxxk f130371s;

    /* renamed from: a */
    public int f130372a;

    /* renamed from: b */
    public int f130373b = 0;

    /* renamed from: c */
    public Object f130374c;

    /* renamed from: d */
    public String f130375d = "";

    /* renamed from: e */
    public long f130376e;

    /* renamed from: f */
    public boolean f130377f;

    /* renamed from: g */
    public boolean f130378g;

    /* renamed from: h */
    public boolean f130379h;

    /* renamed from: i */
    public String f130380i = "";

    /* renamed from: j */
    public String f130381j = "";

    /* renamed from: k */
    public bmoq f130382k;

    /* renamed from: l */
    public bxwc f130383l = bxxn.f165040b;

    /* renamed from: m */
    public int f130384m = 1;

    /* renamed from: n */
    public ByteString f130385n = ByteString.f164797b;

    /* renamed from: o */
    public int f130386o;

    /* renamed from: p */
    public boolean f130387p;

    /* renamed from: q */
    public int f130388q;

    static {
        bmqf bmqf = new bmqf();
        f130370r = bmqf;
        GeneratedMessageLite.m124024a(bmqf.class, bmqf);
    }

    private bmqf() {
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
            return GeneratedMessageLite.m124022a(f130370r, "\u0001\u0014\u0001\u0001\u0001\u001e\u0014\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဈ\u0005\u0006ြ\u0000\u0007ြ\u0000\b\u001b\tဉ\u0007\nြ\u0000\u000bဇ\u0004\rြ\u0000\u000eည\t\u000fဂ\u0001\u0010ြ\u0000\u0011ဌ\n\u0012ဌ\f\u0014ဇ\u000b\u0016ဈ\u0006\u0017ဌ\b\u001eြ\u0000", new Object[]{"c", "b", "a", "d", "f", "g", "i", bmqe.class, bmpl.class, "l", bmno.class, "k", bmow.class, "h", bmpf.class, "n", "e", bmpe.class, "o", bmqn.f130412a, "q", bmpm.f130322a, "p", "j", "m", bmpg.f130296a, bmoz.class});
        } else if (i2 == 3) {
            return new bmqf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130370r);
            }
            if (i2 == 5) {
                return f130370r;
            }
            bxxk bxxk = f130371s;
            if (bxxk == null) {
                synchronized (bmqf.class) {
                    bxxk = f130371s;
                    if (bxxk == null) {
                        bxxk = new bxve(f130370r);
                        f130371s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
