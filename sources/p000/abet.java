package p000;

/* renamed from: abet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abet extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final abet f57292q;

    /* renamed from: r */
    private static volatile bxxk f57293r;

    /* renamed from: a */
    public int f57294a;

    /* renamed from: b */
    public String f57295b = "";

    /* renamed from: c */
    public String f57296c = "";

    /* renamed from: d */
    public String f57297d = "";

    /* renamed from: e */
    public bxwc f57298e = bxxn.f165040b;

    /* renamed from: f */
    public aben f57299f;

    /* renamed from: g */
    public abel f57300g;

    /* renamed from: h */
    public abek f57301h;

    /* renamed from: i */
    public abem f57302i;

    /* renamed from: j */
    public int f57303j;

    /* renamed from: k */
    public String f57304k = "";

    /* renamed from: l */
    public abei f57305l;

    /* renamed from: m */
    public abej f57306m;

    /* renamed from: n */
    public String f57307n = "";

    /* renamed from: o */
    public String f57308o = "";

    /* renamed from: p */
    public String f57309p = "";

    static {
        abet abet = new abet();
        f57292q = abet;
        GeneratedMessageLite.m124024a(abet.class, abet);
    }

    private abet() {
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
            return GeneratedMessageLite.m124022a(f57292q, "\u0001\u000f\u0000\u0001\u0001\u0016\u000f\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001b\u0006ဉ\u0004\u0007ဉ\u0005\nဉ\b\u000bဉ\t\fင\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဈ\u000e\u0015ဈ\u0013\u0016ဈ\u0014", new Object[]{"a", "b", "c", "d", "e", abes.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new abet();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57292q;
            }
            bxxk bxxk = f57293r;
            if (bxxk == null) {
                synchronized (abet.class) {
                    bxxk = f57293r;
                    if (bxxk == null) {
                        bxxk = new bxve(f57292q);
                        f57293r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
