package p000;

/* renamed from: blnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnf extends bxvk implements bxxd {

    /* renamed from: B */
    private static volatile bxxk f126935B;

    /* renamed from: z */
    public static final blnf f126936z;

    /* renamed from: A */
    private byte f126937A = 2;

    /* renamed from: a */
    public int f126938a;

    /* renamed from: b */
    public String f126939b = "";

    /* renamed from: c */
    public String f126940c = "";

    /* renamed from: d */
    public String f126941d = "";

    /* renamed from: e */
    public String f126942e = "";

    /* renamed from: f */
    public String f126943f = "";

    /* renamed from: g */
    public String f126944g = "";

    /* renamed from: h */
    public bxwc f126945h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f126946i = bxxn.f165040b;

    /* renamed from: j */
    public blmx f126947j;

    /* renamed from: k */
    public boolean f126948k;

    /* renamed from: l */
    public long f126949l;

    /* renamed from: m */
    public int f126950m;

    /* renamed from: n */
    public int f126951n;

    /* renamed from: o */
    public long f126952o;

    /* renamed from: p */
    public String f126953p = "";

    /* renamed from: q */
    public long f126954q;

    /* renamed from: r */
    public bxwc f126955r = bxxn.f165040b;

    /* renamed from: s */
    public boolean f126956s;

    /* renamed from: t */
    public boolean f126957t;

    /* renamed from: u */
    public int f126958u;

    /* renamed from: v */
    public int f126959v;

    /* renamed from: w */
    public int f126960w;

    /* renamed from: x */
    public int f126961x;

    /* renamed from: y */
    public bxwc f126962y = bxxn.f165040b;

    static {
        blnf blnf = new blnf();
        f126936z = blnf;
        bxvk.m124024a(blnf.class, blnf);
    }

    private blnf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126937A);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126937A = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126936z, "\u0001\u0018\u0000\u0001\u0001\u001d\u0018\u0000\u0004\u0007\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006ဈ\u0005\bЛ\n\u001a\rᐉ\b\u000eဇ\t\u000fဂ\n\u0010ဌ\u000b\u0011င\f\u0012ဂ\r\u0013ဈ\u000e\u0015ဃ\u0010\u0016\u001b\u0017ဇ\u0011\u0018ဇ\u0012\u0019င\u0013\u001aဌ\u0014\u001bင\u0015\u001cဌ\u0016\u001d\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", blni.class, "i", "j", "k", "l", "m", blnb.f126932a, "n", "o", "p", "q", "r", blml.class, "s", "t", "u", "v", blnd.f126933a, "w", "x", blne.f126934a, "y"});
        } else if (i2 == 3) {
            return new blnf();
        } else {
            if (i2 == 4) {
                return new blnc();
            }
            if (i2 == 5) {
                return f126936z;
            }
            bxxk bxxk = f126935B;
            if (bxxk == null) {
                synchronized (blnf.class) {
                    bxxk = f126935B;
                    if (bxxk == null) {
                        bxxk = new bxve(f126936z);
                        f126935B = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo66686a() {
        if (!this.f126955r.mo73666a()) {
            this.f126955r = bxvk.m124021a(this.f126955r);
        }
    }
}
