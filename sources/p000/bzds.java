package p000;

/* renamed from: bzds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzds extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzds f169570g;

    /* renamed from: h */
    private static volatile bxxk f169571h;

    /* renamed from: a */
    public int f169572a;

    /* renamed from: b */
    public String f169573b = "";

    /* renamed from: c */
    public String f169574c = "";

    /* renamed from: d */
    public String f169575d = "";

    /* renamed from: e */
    public String f169576e = "";

    /* renamed from: f */
    public String f169577f = "";

    static {
        bzds bzds = new bzds();
        f169570g = bzds;
        bxvk.m124024a(bzds.class, bzds);
    }

    private bzds() {
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
            return bxvk.m124022a(f169570g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzds();
        } else {
            if (i2 == 4) {
                return new bxvd(f169570g);
            }
            if (i2 == 5) {
                return f169570g;
            }
            bxxk bxxk = f169571h;
            if (bxxk == null) {
                synchronized (bzds.class) {
                    bxxk = f169571h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169570g);
                        f169571h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
