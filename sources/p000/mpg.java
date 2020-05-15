package p000;

/* renamed from: mpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpg extends bxvk implements bxxd {

    /* renamed from: o */
    public static final mpg f34125o;

    /* renamed from: p */
    private static volatile bxxk f34126p;

    /* renamed from: a */
    public int f34127a;

    /* renamed from: b */
    public int f34128b;

    /* renamed from: c */
    public int f34129c;

    /* renamed from: d */
    public int f34130d;

    /* renamed from: e */
    public String f34131e = "";

    /* renamed from: f */
    public String f34132f = "";

    /* renamed from: g */
    public int f34133g;

    /* renamed from: h */
    public String f34134h = "";

    /* renamed from: i */
    public int f34135i;

    /* renamed from: j */
    public int f34136j;

    /* renamed from: k */
    public bxtx f34137k = bxtx.f164797b;

    /* renamed from: l */
    public boolean f34138l;

    /* renamed from: m */
    public int f34139m;

    /* renamed from: n */
    public bxtx f34140n = bxtx.f164797b;

    static {
        mpg mpg = new mpg();
        f34125o = mpg;
        bxvk.m124024a(mpg.class, mpg);
    }

    private mpg() {
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
            return bxvk.m124022a(f34125o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nည\t\u000bဇ\n\fင\u000b\rည\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new mpg();
        } else {
            if (i2 == 4) {
                return new bxvd(f34125o);
            }
            if (i2 == 5) {
                return f34125o;
            }
            bxxk bxxk = f34126p;
            if (bxxk == null) {
                synchronized (mpg.class) {
                    bxxk = f34126p;
                    if (bxxk == null) {
                        bxxk = new bxve(f34125o);
                        f34126p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
