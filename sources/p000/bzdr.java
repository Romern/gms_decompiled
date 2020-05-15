package p000;

/* renamed from: bzdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdr extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bzdr f169556m;

    /* renamed from: n */
    private static volatile bxxk f169557n;

    /* renamed from: a */
    public int f169558a;

    /* renamed from: b */
    public String f169559b = "";

    /* renamed from: c */
    public String f169560c = "";

    /* renamed from: d */
    public String f169561d = "";

    /* renamed from: e */
    public String f169562e = "";

    /* renamed from: f */
    public String f169563f = "";

    /* renamed from: g */
    public String f169564g = "";

    /* renamed from: h */
    public String f169565h = "";

    /* renamed from: i */
    public String f169566i = "";

    /* renamed from: j */
    public String f169567j = "";

    /* renamed from: k */
    public int f169568k;

    /* renamed from: l */
    public int f169569l;

    static {
        bzdr bzdr = new bzdr();
        f169556m = bzdr;
        GeneratedMessageLite.m124024a(bzdr.class, bzdr);
    }

    private bzdr() {
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
            return GeneratedMessageLite.m124022a(f169556m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nင\t\u000bင\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bzdr();
        } else {
            if (i2 == 4) {
                return new bxvd(f169556m);
            }
            if (i2 == 5) {
                return f169556m;
            }
            bxxk bxxk = f169557n;
            if (bxxk == null) {
                synchronized (bzdr.class) {
                    bxxk = f169557n;
                    if (bxxk == null) {
                        bxxk = new bxve(f169556m);
                        f169557n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
