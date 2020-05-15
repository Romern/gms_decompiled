package p000;

/* renamed from: blrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrj extends bxvk implements bxxd {

    /* renamed from: w */
    public static final blrj f127456w;

    /* renamed from: z */
    private static volatile bxxk f127457z;

    /* renamed from: a */
    public int f127458a;

    /* renamed from: b */
    public blox f127459b;

    /* renamed from: c */
    public blrw f127460c;

    /* renamed from: d */
    public blrn f127461d;

    /* renamed from: e */
    public String f127462e = "";

    /* renamed from: f */
    public long f127463f;

    /* renamed from: g */
    public long f127464g;

    /* renamed from: h */
    public boolean f127465h;

    /* renamed from: i */
    public boolean f127466i;

    /* renamed from: j */
    public boolean f127467j;

    /* renamed from: k */
    public boolean f127468k;

    /* renamed from: l */
    public long f127469l;

    /* renamed from: m */
    public blnv f127470m;

    /* renamed from: n */
    public blnv f127471n;

    /* renamed from: o */
    public blny f127472o;

    /* renamed from: p */
    public bloc f127473p;

    /* renamed from: q */
    public long f127474q;

    /* renamed from: r */
    public blow f127475r;

    /* renamed from: s */
    public blov f127476s;

    /* renamed from: t */
    public blnk f127477t;

    /* renamed from: u */
    public blpy f127478u;

    /* renamed from: v */
    public long f127479v;

    /* renamed from: x */
    private blnp f127480x;

    /* renamed from: y */
    private byte f127481y = 2;

    static {
        blrj blrj = new blrj();
        f127456w = blrj;
        bxvk.m124024a(blrj.class, blrj);
    }

    private blrj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127481y);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127481y = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127456w, "\u0001\u0016\u0000\u0001\u0001\u001a\u0016\u0000\u0000\u0007\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0005ᐉ\f\u0006ᐉ\u000e\u0007ᐉ\r\bဇ\u0006\nဇ\u0007\u000bဂ\u0005\fᐉ\u000f\rဉ\u0001\u000eဂ\u0010\u000fᐉ\u0011\u0010ᐉ\u0012\u0011ဉ\u0013\u0012ဂ\u0004\u0014ᐉ\u0014\u0015ဇ\b\u0016ဇ\t\u0017စ\u000b\u0019ဉ\u0015\u001aဂ\u0016", new Object[]{"a", "b", "d", "e", "m", "o", "n", "h", "i", "g", "p", "c", "q", "r", "s", "t", "f", "x", "j", "k", "l", "u", "v"});
        } else if (i2 == 3) {
            return new blrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f127456w);
            }
            if (i2 == 5) {
                return f127456w;
            }
            bxxk bxxk = f127457z;
            if (bxxk == null) {
                synchronized (blrj.class) {
                    bxxk = f127457z;
                    if (bxxk == null) {
                        bxxk = new bxve(f127456w);
                        f127457z = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
