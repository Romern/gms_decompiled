package p000;

/* renamed from: bzwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzwb f171594g;

    /* renamed from: h */
    private static volatile bxxk f171595h;

    /* renamed from: a */
    public int f171596a;

    /* renamed from: b */
    public bzvu f171597b;

    /* renamed from: c */
    public bltf f171598c;

    /* renamed from: d */
    public String f171599d = "";

    /* renamed from: e */
    public String f171600e = "";

    /* renamed from: f */
    public String f171601f = "";

    static {
        bzwb bzwb = new bzwb();
        f171594g = bzwb;
        GeneratedMessageLite.m124024a(bzwb.class, bzwb);
    }

    private bzwb() {
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
            return GeneratedMessageLite.m124022a(f171594g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "c", "b", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzwb();
        } else {
            if (i2 == 4) {
                return new bxvd(f171594g);
            }
            if (i2 == 5) {
                return f171594g;
            }
            bxxk bxxk = f171595h;
            if (bxxk == null) {
                synchronized (bzwb.class) {
                    bxxk = f171595h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171594g);
                        f171595h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
