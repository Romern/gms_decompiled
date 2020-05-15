package p000;

/* renamed from: bvkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkk extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bxvu f156419n = new bvkj();

    /* renamed from: q */
    public static final bvkk f156420q;

    /* renamed from: r */
    private static volatile bxxk f156421r;

    /* renamed from: a */
    public long f156422a;

    /* renamed from: b */
    public String f156423b = "";

    /* renamed from: c */
    public String f156424c = "";

    /* renamed from: d */
    public int f156425d;

    /* renamed from: e */
    public float f156426e;

    /* renamed from: f */
    public bvkh f156427f;

    /* renamed from: g */
    public int f156428g;

    /* renamed from: h */
    public int f156429h;

    /* renamed from: i */
    public bzaa f156430i;

    /* renamed from: j */
    public boolean f156431j;

    /* renamed from: k */
    public boolean f156432k;

    /* renamed from: l */
    public String f156433l = "";

    /* renamed from: m */
    public bxvt f156434m = bxvm.f164965b;

    /* renamed from: o */
    public int f156435o;

    /* renamed from: p */
    public bvki f156436p;

    static {
        bvkk bvkk = new bvkk();
        f156420q = bvkk;
        GeneratedMessageLite.m124024a(bvkk.class, bvkk);
    }

    private bvkk() {
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
            return GeneratedMessageLite.m124022a(f156420q, "\u0000\u000f\u0000\u0000\u0001\u0017\u000f\u0000\u0001\u0000\u0001\u0002\u0005Ȉ\u0006Ȉ\u0007\u0004\b\u0001\t\t\r\f\u000e\f\u000f\t\u0010\u0007\u0012\u0007\u0013Ȉ\u0014,\u0016\f\u0017\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p"});
        } else if (i2 == 3) {
            return new bvkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f156420q);
            }
            if (i2 == 5) {
                return f156420q;
            }
            bxxk bxxk = f156421r;
            if (bxxk == null) {
                synchronized (bvkk.class) {
                    bxxk = f156421r;
                    if (bxxk == null) {
                        bxxk = new bxve(f156420q);
                        f156421r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
