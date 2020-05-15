package p000;

/* renamed from: byaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byaw extends bxvk implements bxxd {

    /* renamed from: u */
    public static final byaw f165345u;

    /* renamed from: v */
    private static volatile bxxk f165346v;

    /* renamed from: a */
    public int f165347a;

    /* renamed from: b */
    public String f165348b = "";

    /* renamed from: c */
    public String f165349c = "";

    /* renamed from: d */
    public int f165350d = 1;

    /* renamed from: e */
    public boolean f165351e;

    /* renamed from: f */
    public int f165352f;

    /* renamed from: g */
    public int f165353g;

    /* renamed from: h */
    public int f165354h;

    /* renamed from: i */
    public boolean f165355i;

    /* renamed from: j */
    public String f165356j = "";

    /* renamed from: k */
    public long f165357k;

    /* renamed from: l */
    public long f165358l;

    /* renamed from: m */
    public long f165359m;

    /* renamed from: n */
    public long f165360n;

    /* renamed from: o */
    public long f165361o;

    /* renamed from: p */
    public int f165362p;

    /* renamed from: q */
    public int f165363q;

    /* renamed from: r */
    public int f165364r;

    /* renamed from: s */
    public int f165365s;

    /* renamed from: t */
    public int f165366t;

    static {
        byaw byaw = new byaw();
        f165345u = byaw;
        bxvk.m124024a(byaw.class, byaw);
    }

    private byaw() {
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
            return bxvk.m124022a(f165345u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007\tဈ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fင\u000e\u0010င\u000f\u0011င\u0010\u0013င\u0011\u0014င\u0012", new Object[]{"a", "b", "c", "d", byav.f165344a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
        } else if (i2 == 3) {
            return new byaw();
        } else {
            if (i2 == 4) {
                return new bxvd(f165345u);
            }
            if (i2 == 5) {
                return f165345u;
            }
            bxxk bxxk = f165346v;
            if (bxxk == null) {
                synchronized (byaw.class) {
                    bxxk = f165346v;
                    if (bxxk == null) {
                        bxxk = new bxve(f165345u);
                        f165346v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
