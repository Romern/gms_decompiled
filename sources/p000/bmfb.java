package p000;

/* renamed from: bmfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxvu f129051e = new bmew();

    /* renamed from: m */
    public static final bmfb f129052m;

    /* renamed from: n */
    private static volatile bxxk f129053n;

    /* renamed from: a */
    public int f129054a;

    /* renamed from: b */
    public bmdn f129055b;

    /* renamed from: c */
    public int f129056c;

    /* renamed from: d */
    public bxvt f129057d = bxvm.f164965b;

    /* renamed from: f */
    public String f129058f = "";

    /* renamed from: g */
    public bxtx f129059g = bxtx.f164797b;

    /* renamed from: h */
    public int f129060h;

    /* renamed from: i */
    public String f129061i = "";

    /* renamed from: j */
    public bmno f129062j;

    /* renamed from: k */
    public bmnr f129063k;

    /* renamed from: l */
    public bmdb f129064l;

    static {
        bmfb bmfb = new bmfb();
        f129052m = bmfb;
        bxvk.m124024a(bmfb.class, bmfb);
    }

    private bmfb() {
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
            return bxvk.m124022a(f129052m, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001e\tင\u0004\u000bည\u0003\fဈ\u0005\rဉ\u0006\u000eဌ\u0001\u000fဉ\b\u0012ဈ\u0002\u0013ဉ\u0007", new Object[]{"a", "b", "d", bmey.m107963b(), "h", "g", "i", "j", "c", bmez.f129050a, "l", "f", "k"});
        } else if (i2 == 3) {
            return new bmfb();
        } else {
            if (i2 == 4) {
                return new bxvd(f129052m);
            }
            if (i2 == 5) {
                return f129052m;
            }
            bxxk bxxk = f129053n;
            if (bxxk == null) {
                synchronized (bmfb.class) {
                    bxxk = f129053n;
                    if (bxxk == null) {
                        bxxk = new bxve(f129052m);
                        f129053n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
