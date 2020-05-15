package p000;

/* renamed from: bycs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycs extends GeneratedMessageLite implements bxxd {

    /* renamed from: s */
    public static final bycs f165680s;

    /* renamed from: u */
    private static volatile bxxk f165681u;

    /* renamed from: a */
    public int f165682a;

    /* renamed from: b */
    public int f165683b = 0;

    /* renamed from: c */
    public boolean f165684c;

    /* renamed from: d */
    public String f165685d = "";

    /* renamed from: e */
    public String f165686e = "";

    /* renamed from: f */
    public String f165687f = "";

    /* renamed from: g */
    public String f165688g = "";

    /* renamed from: h */
    public String f165689h = "";

    /* renamed from: i */
    public int f165690i = 1;

    /* renamed from: j */
    public int f165691j;

    /* renamed from: k */
    public int f165692k;

    /* renamed from: l */
    public bxvt f165693l = bxvm.f164965b;

    /* renamed from: m */
    public int f165694m;

    /* renamed from: n */
    public bxww f165695n = bxww.f165013b;

    /* renamed from: o */
    public boolean f165696o;

    /* renamed from: p */
    public String f165697p = "";

    /* renamed from: q */
    public byco f165698q;

    /* renamed from: r */
    public boolean f165699r;

    /* renamed from: t */
    private Object f165700t;

    static {
        bycs bycs = new bycs();
        f165680s = bycs;
        GeneratedMessageLite.m124024a(bycs.class, bycs);
    }

    private bycs() {
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
            return GeneratedMessageLite.m124022a(f165680s, "\u0001\u0013\u0001\u0001\u0001\u0014\u0013\u0001\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007\tင\b\n\u0016\u000bင\t\rဇ\u000b\u000e2\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ဈ\u000f\u0013ဉ\u0010\u0014ဇ\u0011", new Object[]{"t", "b", "a", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "n", bycr.f165679a, bycp.class, bycj.class, byck.class, "p", "q", "r"});
        } else if (i2 == 3) {
            return new bycs();
        } else {
            if (i2 == 4) {
                return new bxvd(f165680s);
            }
            if (i2 == 5) {
                return f165680s;
            }
            bxxk bxxk = f165681u;
            if (bxxk == null) {
                synchronized (bycs.class) {
                    bxxk = f165681u;
                    if (bxxk == null) {
                        bxxk = new bxve(f165680s);
                        f165681u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
