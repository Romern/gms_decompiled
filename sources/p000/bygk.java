package p000;

/* renamed from: bygk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygk extends bxvk implements bxxd {

    /* renamed from: s */
    public static final bygk f166327s;

    /* renamed from: t */
    private static volatile bxxk f166328t;

    /* renamed from: a */
    public int f166329a;

    /* renamed from: b */
    public bxwc f166330b = bxxn.f165040b;

    /* renamed from: c */
    public int f166331c = -1;

    /* renamed from: d */
    public long f166332d = -86400000;

    /* renamed from: e */
    public bygi f166333e;

    /* renamed from: f */
    public boolean f166334f;

    /* renamed from: g */
    public boolean f166335g;

    /* renamed from: h */
    public String f166336h = "";

    /* renamed from: i */
    public String f166337i = "";

    /* renamed from: j */
    public bxwc f166338j = bxxn.f165040b;

    /* renamed from: k */
    public String f166339k = "";

    /* renamed from: l */
    public String f166340l = "";

    /* renamed from: m */
    public String f166341m = "";

    /* renamed from: n */
    public String f166342n = "";

    /* renamed from: o */
    public int f166343o = -1;

    /* renamed from: p */
    public long f166344p;

    /* renamed from: q */
    public String f166345q = "";

    /* renamed from: r */
    public int f166346r;

    static {
        bygk bygk = new bygk();
        f166327s = bygk;
        bxvk.m124024a(bygk.class, bygk);
    }

    private bygk() {
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
            return bxvk.m124022a(f166327s, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0002\u0000\u0001\u001b\u0003င\u0000\u0004ဂ\u0001\u0006ဉ\u0003\u0007ဇ\u0004\bဇ\u0005\tဈ\u0006\n\u001a\u000bဈ\b\u000eဈ\f\u000fဈ\r\u0012ဈ\u0007\u0013ဈ\t\u0014င\u0010\u0015ဂ\u0011\u0016ဈ\u0012\u0017င\u0013", new Object[]{"a", "b", bygj.class, "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "i", "l", "o", "p", "q", "r"});
        } else if (i2 == 3) {
            return new bygk();
        } else {
            if (i2 == 4) {
                return new bygh();
            }
            if (i2 == 5) {
                return f166327s;
            }
            bxxk bxxk = f166328t;
            if (bxxk == null) {
                synchronized (bygk.class) {
                    bxxk = f166328t;
                    if (bxxk == null) {
                        bxxk = new bxve(f166327s);
                        f166328t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
