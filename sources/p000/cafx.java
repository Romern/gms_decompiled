package p000;

/* renamed from: cafx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafx extends bxvg implements bxvh {

    /* renamed from: C */
    public static final cafx f173026C;

    /* renamed from: E */
    private static volatile bxxk f173027E;

    /* renamed from: A */
    public String f173028A = "";

    /* renamed from: B */
    public int f173029B;

    /* renamed from: D */
    private byte f173030D = 2;

    /* renamed from: a */
    public int f173031a;

    /* renamed from: b */
    public long f173032b;

    /* renamed from: c */
    public String f173033c = "";

    /* renamed from: d */
    public int f173034d;

    /* renamed from: e */
    public String f173035e = "";

    /* renamed from: f */
    public String f173036f = "";

    /* renamed from: g */
    public String f173037g = "";

    /* renamed from: h */
    public String f173038h = "";

    /* renamed from: i */
    public String f173039i = "";

    /* renamed from: j */
    public String f173040j = "";

    /* renamed from: k */
    public String f173041k = "";

    /* renamed from: l */
    public String f173042l = "";

    /* renamed from: n */
    public String f173043n = "";

    /* renamed from: o */
    public String f173044o = "";

    /* renamed from: p */
    public String f173045p = "";

    /* renamed from: q */
    public String f173046q = "";

    /* renamed from: r */
    public String f173047r = "";

    /* renamed from: s */
    public String f173048s = "";

    /* renamed from: t */
    public int f173049t;

    /* renamed from: u */
    public aymg f173050u;

    /* renamed from: v */
    public boolean f173051v;

    /* renamed from: w */
    public int f173052w;

    /* renamed from: x */
    public cafy f173053x;

    /* renamed from: y */
    public boci f173054y;

    /* renamed from: z */
    public String f173055z = "";

    static {
        cafx cafx = new cafx();
        f173026C = cafx;
        GeneratedMessageLite.m124024a(cafx.class, cafx);
    }

    private cafx() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f173030D);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f173030D = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f173026C, "\u0001\u001a\u0000\u0001\u0001!\u001a\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\b\u0007ဈ\t\bဈ\u0006\tဈ\u0007\nဈ\n\u000bဈ\u000b\fဈ\f\rဈ\r\u000eဈ\u000e\u000fဈ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0013င\u0012\u0014ဇ\u0014\u0017ဌ\u0016\u0018ဉ\u0017\u0019ဉ\u0018\u001aဈ\u0019\u001bဈ\u001a ဉ\u0013!င\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "i", "j", "g", "h", "k", "l", "n", "o", "p", "q", "r", "s", "t", "v", "w", cahf.f174543a, "x", "y", "z", "A", "u", "B"});
        } else if (i2 == 3) {
            return new cafx();
        } else {
            if (i2 == 4) {
                return new bxvf(f173026C);
            }
            if (i2 == 5) {
                return f173026C;
            }
            bxxk bxxk = f173027E;
            if (bxxk == null) {
                synchronized (cafx.class) {
                    bxxk = f173027E;
                    if (bxxk == null) {
                        bxxk = new bxve(f173026C);
                        f173027E = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
