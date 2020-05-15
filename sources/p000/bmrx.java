package p000;

/* renamed from: bmrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrx extends bxvk implements bxxd {

    /* renamed from: t */
    public static final bmrx f130597t;

    /* renamed from: v */
    private static volatile bxxk f130598v;

    /* renamed from: a */
    public int f130599a;

    /* renamed from: b */
    public int f130600b = 0;

    /* renamed from: c */
    public Object f130601c;

    /* renamed from: d */
    public String f130602d = "";

    /* renamed from: e */
    public bmjt f130603e;

    /* renamed from: f */
    public bmnr f130604f;

    /* renamed from: g */
    public bxwc f130605g = bxxn.f165040b;

    /* renamed from: h */
    public boolean f130606h;

    /* renamed from: i */
    public bmoc f130607i;

    /* renamed from: j */
    public String f130608j = "";

    /* renamed from: k */
    public String f130609k = "";

    /* renamed from: l */
    public bxwc f130610l = bxxn.f165040b;

    /* renamed from: m */
    public boolean f130611m;

    /* renamed from: n */
    public long f130612n;

    /* renamed from: o */
    public int f130613o;

    /* renamed from: p */
    public bmlz f130614p;

    /* renamed from: q */
    public bmkw f130615q;

    /* renamed from: r */
    public bmeb f130616r;

    /* renamed from: s */
    public bmdj f130617s;

    /* renamed from: u */
    private byte f130618u = 2;

    static {
        bmrx bmrx = new bmrx();
        f130597t = bmrx;
        bxvk.m124024a(bmrx.class, bmrx);
    }

    private bmrx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130618u);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130618u = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130597t, "\u0001\u0015\u0001\u0001\u0001 \u0015\u0000\u0002\u0005\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ဈ\u0000\b\u001b\tဈ\n\nဉ\u0004\fဈ\u000b\rဇ\f\u000e\u001b\u000fဉ\u000f\u0015ြ\u0000\u0017ဇ\u0007\u0018ဉ\u0001\u0019ᐉ\u0015\u001aᐉ\u0016\u001bဂ\r\u001cဌ\u000e\u001eဉ\t\u001fြ\u0000 ᐉ\u0017", new Object[]{"c", "b", "a", bmeq.class, bmfu.class, bmie.class, "d", "l", bmaf.class, "j", "f", "k", "m", "g", bmdb.class, "p", bmfs.class, "h", "e", "q", "r", "n", "o", bmql.f130411a, "i", bmrs.class, "s"});
        } else if (i2 == 3) {
            return new bmrx();
        } else {
            if (i2 == 4) {
                return new bxvd(f130597t);
            }
            if (i2 == 5) {
                return f130597t;
            }
            bxxk bxxk = f130598v;
            if (bxxk == null) {
                synchronized (bmrx.class) {
                    bxxk = f130598v;
                    if (bxxk == null) {
                        bxxk = new bxve(f130597t);
                        f130598v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
