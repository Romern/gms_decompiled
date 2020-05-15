package p000;

/* renamed from: bmaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmaq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxvu f128477g = new bmak();

    /* renamed from: j */
    public static final bxvu f128478j = new bmal();

    /* renamed from: l */
    public static final bmaq f128479l;

    /* renamed from: m */
    private static volatile bxxk f128480m;

    /* renamed from: a */
    public int f128481a;

    /* renamed from: b */
    public long f128482b = -1;

    /* renamed from: c */
    public ByteString f128483c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f128484d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f128485e = ByteString.f164797b;

    /* renamed from: f */
    public bxvt f128486f = bxvm.f164965b;

    /* renamed from: h */
    public int f128487h;

    /* renamed from: i */
    public bxvt f128488i = bxvm.f164965b;

    /* renamed from: k */
    public boolean f128489k;

    static {
        bmaq bmaq = new bmaq();
        f128479l = bmaq;
        GeneratedMessageLite.m124024a(bmaq.class, bmaq);
    }

    private bmaq() {
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
            return GeneratedMessageLite.m124022a(f128479l, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0000\u0001ဂ\u0000\u0002ည\u0001\u0005ည\u0002\u0007ည\u0004\b\u001e\nဌ\u0005\r,\u000fဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", bmap.m107841b(), "h", bmam.f128466a, "i", bwfe.m121903b(), "k"});
        } else if (i2 == 3) {
            return new bmaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f128479l);
            }
            if (i2 == 5) {
                return f128479l;
            }
            bxxk bxxk = f128480m;
            if (bxxk == null) {
                synchronized (bmaq.class) {
                    bxxk = f128480m;
                    if (bxxk == null) {
                        bxxk = new bxve(f128479l);
                        f128480m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
