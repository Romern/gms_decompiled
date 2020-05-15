package p000;

/* renamed from: aqav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqav extends bxvk implements bxxd {

    /* renamed from: r */
    public static final aqav f85478r;

    /* renamed from: s */
    private static volatile bxxk f85479s;

    /* renamed from: a */
    public int f85480a;

    /* renamed from: b */
    public int f85481b;

    /* renamed from: c */
    public int f85482c;

    /* renamed from: d */
    public long f85483d;

    /* renamed from: e */
    public boolean f85484e;

    /* renamed from: f */
    public int f85485f;

    /* renamed from: g */
    public long f85486g;

    /* renamed from: h */
    public String f85487h = "";

    /* renamed from: i */
    public boolean f85488i;

    /* renamed from: j */
    public bxwc f85489j = bxxn.f165040b;

    /* renamed from: k */
    public String f85490k = "";

    /* renamed from: l */
    public String f85491l = "";

    /* renamed from: m */
    public String f85492m = "";

    /* renamed from: n */
    public boolean f85493n;

    /* renamed from: o */
    public String f85494o = "";

    /* renamed from: p */
    public boolean f85495p;

    /* renamed from: q */
    public boolean f85496q;

    static {
        aqav aqav = new aqav();
        f85478r = aqav;
        bxvk.m124024a(aqav.class, aqav);
    }

    private aqav() {
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
            return bxvk.m124022a(f85478r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0001\u0000\u0001င\u0001\u0002ဂ\u0002\u0003ဇ\u0003\u0004ဂ\u0005\u0005ဇ\b\u0006\u001a\u0007ဈ\t\tဈ\n\nဈ\u000b\u000bဈ\u0007\fဇ\f\rဇ\u000e\u000eဇ\u000f\u000fဌ\u0000\u0010ဈ\r\u0011ဌ\u0004", new Object[]{"a", "c", "d", "e", "g", "i", "j", "k", "l", "m", "h", "n", "p", "q", "b", aqau.f85477a, "o", "f", aqdq.f85784a});
        } else if (i2 == 3) {
            return new aqav();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f85478r;
            }
            bxxk bxxk = f85479s;
            if (bxxk == null) {
                synchronized (aqav.class) {
                    bxxk = f85479s;
                    if (bxxk == null) {
                        bxxk = new bxve(f85478r);
                        f85479s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
