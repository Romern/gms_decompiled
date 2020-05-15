package p000;

/* renamed from: bzqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqi extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bzqi f170993p;

    /* renamed from: q */
    private static volatile bxxk f170994q;

    /* renamed from: a */
    public int f170995a;

    /* renamed from: b */
    public String f170996b = "";

    /* renamed from: c */
    public String f170997c = "";

    /* renamed from: d */
    public boolean f170998d;

    /* renamed from: e */
    public int f170999e = 1;

    /* renamed from: f */
    public bxwc f171000f = bxxn.f165040b;

    /* renamed from: g */
    public String f171001g = "";

    /* renamed from: h */
    public bzqj f171002h;

    /* renamed from: i */
    public String f171003i = "";

    /* renamed from: j */
    public String f171004j = "";

    /* renamed from: k */
    public String f171005k = "";

    /* renamed from: l */
    public boolean f171006l;

    /* renamed from: m */
    public bxwc f171007m;

    /* renamed from: n */
    public bxwc f171008n;

    /* renamed from: o */
    public boolean f171009o;

    static {
        bzqi bzqi = new bzqi();
        f170993p = bzqi;
        bxvk.m124024a(bzqi.class, bzqi);
    }

    private bzqi() {
        bxwq bxwq = bxwq.f165002b;
        this.f171007m = bxxn.f165040b;
        this.f171008n = bxxn.f165040b;
        this.f171009o = true;
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
            return bxvk.m124022a(f170993p, "\u0001\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005\u001b\u0006ဈ\u0004\bဉ\u0006\tဈ\u0007\nဈ\b\fဈ\n\u0011ဇ\u000e\u0012\u001a\u0013\u001b\u0017ဇ\u0012", new Object[]{"a", "b", "c", "d", "e", bzqg.f170992a, "f", bzqk.class, "g", "h", "i", "j", "k", "l", "m", "n", bzqk.class, "o"});
        } else if (i2 == 3) {
            return new bzqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f170993p);
            }
            if (i2 == 5) {
                return f170993p;
            }
            bxxk bxxk = f170994q;
            if (bxxk == null) {
                synchronized (bzqi.class) {
                    bxxk = f170994q;
                    if (bxxk == null) {
                        bxxk = new bxve(f170993p);
                        f170994q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
