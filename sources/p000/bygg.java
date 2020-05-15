package p000;

/* renamed from: bygg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygg extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final bygg f166294p;

    /* renamed from: q */
    private static volatile bxxk f166295q;

    /* renamed from: a */
    public int f166296a;

    /* renamed from: b */
    public int f166297b = 100;

    /* renamed from: c */
    public String f166298c = "";

    /* renamed from: d */
    public String f166299d = "";

    /* renamed from: e */
    public String f166300e = "";

    /* renamed from: f */
    public String f166301f = "";

    /* renamed from: g */
    public long f166302g;

    /* renamed from: h */
    public String f166303h = "";

    /* renamed from: i */
    public String f166304i = "";

    /* renamed from: j */
    public String f166305j = "";

    /* renamed from: k */
    public String f166306k = "";

    /* renamed from: l */
    public String f166307l = "";

    /* renamed from: m */
    public String f166308m = "";

    /* renamed from: n */
    public String f166309n = "";

    /* renamed from: o */
    public String f166310o = "";

    static {
        bygg bygg = new bygg();
        f166294p = bygg;
        GeneratedMessageLite.m124024a(bygg.class, bygg);
    }

    private bygg() {
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
            return GeneratedMessageLite.m124022a(f166294p, "\u0001\u000e\u0000\u0001\u0001\u0016\u000e\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000fဈ\u000e\u0015ဈ\u0014\u0016ဈ\u0015", new Object[]{"a", "b", bygf.f166293a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bygg();
        } else {
            if (i2 == 4) {
                return new bxvd(f166294p);
            }
            if (i2 == 5) {
                return f166294p;
            }
            bxxk bxxk = f166295q;
            if (bxxk == null) {
                synchronized (bygg.class) {
                    bxxk = f166295q;
                    if (bxxk == null) {
                        bxxk = new bxve(f166294p);
                        f166295q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
