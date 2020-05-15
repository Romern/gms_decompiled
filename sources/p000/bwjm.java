package p000;

/* renamed from: bwjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjm extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bwjm f159811p;

    /* renamed from: r */
    private static volatile bxxk f159812r;

    /* renamed from: a */
    public int f159813a;

    /* renamed from: b */
    public String f159814b = "";

    /* renamed from: c */
    public bxwc f159815c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f159816d = bxxn.f165040b;

    /* renamed from: e */
    public bmgn f159817e;

    /* renamed from: f */
    public bmfs f159818f;

    /* renamed from: g */
    public bxwc f159819g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f159820h = bxxn.f165040b;

    /* renamed from: i */
    public bmdb f159821i;

    /* renamed from: j */
    public bmlz f159822j;

    /* renamed from: k */
    public bxwc f159823k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f159824l = bxxn.f165040b;

    /* renamed from: m */
    public bxwc f159825m = bxxn.f165040b;

    /* renamed from: n */
    public bmkw f159826n;

    /* renamed from: o */
    public bmdj f159827o;

    /* renamed from: q */
    private byte f159828q = 2;

    static {
        bwjm bwjm = new bwjm();
        f159811p = bwjm;
        bxvk.m124024a(bwjm.class, bwjm);
    }

    private bwjm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159828q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159828q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159811p, "\u0001\u000e\u0000\u0001\u0001\u0015\u000e\u0000\u0007\u0004\u0001ဈ\u0000\u0004ᐉ\u0002\u0005ဉ\u0003\u0007ဉ\u0004\b\u001b\t\u001b\nဉ\u0005\u000b\u001b\r\u001b\u0010ᐉ\u0006\u0011Л\u0012\u001b\u0013\u001b\u0015ᐉ\u0007", new Object[]{"a", "b", "e", "f", "i", "c", bmnr.class, "d", bmlv.class, "j", "g", bmjf.class, "h", bmdb.class, "n", "k", bmeb.class, "l", bmde.class, "m", bwio.class, "o"});
        } else if (i2 == 3) {
            return new bwjm();
        } else {
            if (i2 == 4) {
                return new bxvd(f159811p);
            }
            if (i2 == 5) {
                return f159811p;
            }
            bxxk bxxk = f159812r;
            if (bxxk == null) {
                synchronized (bwjm.class) {
                    bxxk = f159812r;
                    if (bxxk == null) {
                        bxxk = new bxve(f159811p);
                        f159812r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
