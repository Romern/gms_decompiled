package p000;

/* renamed from: byev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byev extends bxvk implements bxxd {

    /* renamed from: w */
    public static final byev f165940w;

    /* renamed from: x */
    private static volatile bxxk f165941x;

    /* renamed from: a */
    public int f165942a;

    /* renamed from: b */
    public int f165943b;

    /* renamed from: c */
    public int f165944c;

    /* renamed from: d */
    public int f165945d;

    /* renamed from: e */
    public int f165946e;

    /* renamed from: f */
    public int f165947f;

    /* renamed from: g */
    public int f165948g;

    /* renamed from: h */
    public int f165949h;

    /* renamed from: i */
    public double f165950i;

    /* renamed from: j */
    public byem f165951j;

    /* renamed from: k */
    public String f165952k = "";

    /* renamed from: l */
    public bxwc f165953l = bxxn.f165040b;

    /* renamed from: m */
    public int f165954m;

    /* renamed from: n */
    public int f165955n;

    /* renamed from: o */
    public int f165956o;

    /* renamed from: p */
    public float f165957p;

    /* renamed from: q */
    public float f165958q;

    /* renamed from: r */
    public int f165959r;

    /* renamed from: s */
    public float f165960s;

    /* renamed from: t */
    public int f165961t;

    /* renamed from: u */
    public float f165962u;

    /* renamed from: v */
    public int f165963v;

    static {
        byev byev = new byev();
        f165940w = byev;
        bxvk.m124024a(byev.class, byev);
    }

    private byev() {
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
            return bxvk.m124022a(f165940w, "\u0001\u0015\u0000\u0001\u0002\u0016\u0015\u0000\u0001\u0000\u0002င\u0000\u0003င\u0001\u0004င\u0003\u0005င\u0005\u0006င\u0006\u0007က\u0007\bဉ\b\tဈ\t\nခ\u0012\u000b\u001b\fင\u0002\rင\u0004\u000eဌ\n\u000fဌ\u000b\u0010ဌ\f\u0011ခ\r\u0012ခ\u000e\u0013ဌ\u000f\u0014ခ\u0010\u0015ဌ\u0011\u0016င\u0013", new Object[]{"a", "b", "c", "e", "g", "h", "i", "j", "k", "u", "l", byek.class, "d", "f", "m", byet.f165938a, "n", byer.f165936a, "o", byes.f165937a, "p", "q", "r", byeq.f165935a, "s", "t", byeu.f165939a, "v"});
        } else if (i2 == 3) {
            return new byev();
        } else {
            if (i2 == 4) {
                return new byep();
            }
            if (i2 == 5) {
                return f165940w;
            }
            bxxk bxxk = f165941x;
            if (bxxk == null) {
                synchronized (byev.class) {
                    bxxk = f165941x;
                    if (bxxk == null) {
                        bxxk = new bxve(f165940w);
                        f165941x = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
