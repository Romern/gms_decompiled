package p000;

/* renamed from: din */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class din extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final din f13229r;

    /* renamed from: s */
    private static volatile bxxk f13230s;

    /* renamed from: a */
    public int f13231a;

    /* renamed from: b */
    public int f13232b;

    /* renamed from: c */
    public String f13233c = "";

    /* renamed from: d */
    public long f13234d;

    /* renamed from: e */
    public String f13235e = "";

    /* renamed from: f */
    public String f13236f = "";

    /* renamed from: g */
    public String f13237g = "";

    /* renamed from: h */
    public int f13238h;

    /* renamed from: i */
    public int f13239i;

    /* renamed from: j */
    public bxwc f13240j = bxxn.f165040b;

    /* renamed from: k */
    public int f13241k;

    /* renamed from: l */
    public int f13242l;

    /* renamed from: m */
    public int f13243m;

    /* renamed from: n */
    public String f13244n = "";

    /* renamed from: o */
    public String f13245o = "";

    /* renamed from: p */
    public String f13246p = "";

    /* renamed from: q */
    public String f13247q = "";

    static {
        din din = new din();
        f13229r = din;
        GeneratedMessageLite.m124024a(din.class, din);
    }

    private din() {
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
            return GeneratedMessageLite.m124022a(f13229r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bဌ\u0007\t\u001b\nဌ\b\u000bင\t\fင\n\rဈ\u000b\u000eဈ\f\u000fဈ\r\u0010ဈ\u000e", new Object[]{"a", "b", dij.f13227a, "c", "d", "e", "f", "g", "h", "i", dkb.f13378a, "j", diq.class, "k", dil.f13228a, "l", "m", "n", "o", "p", "q"});
        } else if (i2 == 3) {
            return new din();
        } else {
            if (i2 == 4) {
                return new bxvd(f13229r);
            }
            if (i2 == 5) {
                return f13229r;
            }
            bxxk bxxk = f13230s;
            if (bxxk == null) {
                synchronized (din.class) {
                    bxxk = f13230s;
                    if (bxxk == null) {
                        bxxk = new bxve(f13229r);
                        f13230s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
