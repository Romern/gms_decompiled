package p000;

/* renamed from: blcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcl extends bxvk implements bxxd {

    /* renamed from: h */
    public static final blcl f125932h;

    /* renamed from: i */
    private static volatile bxxk f125933i;

    /* renamed from: a */
    public int f125934a;

    /* renamed from: b */
    public String f125935b = "";

    /* renamed from: c */
    public String f125936c = "";

    /* renamed from: d */
    public String f125937d = "";

    /* renamed from: e */
    public String f125938e = "";

    /* renamed from: f */
    public String f125939f = "";

    /* renamed from: g */
    public int f125940g;

    static {
        blcl blcl = new blcl();
        f125932h = blcl;
        bxvk.m124024a(blcl.class, blcl);
    }

    private blcl() {
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
            return bxvk.m124022a(f125932h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဌ\u0005\u0006ဈ\u0001", new Object[]{"a", "b", "d", "e", "f", "g", blcj.f125931a, "c"});
        } else if (i2 == 3) {
            return new blcl();
        } else {
            if (i2 == 4) {
                return new bxvd(f125932h);
            }
            if (i2 == 5) {
                return f125932h;
            }
            bxxk bxxk = f125933i;
            if (bxxk == null) {
                synchronized (blcl.class) {
                    bxxk = f125933i;
                    if (bxxk == null) {
                        bxxk = new bxve(f125932h);
                        f125933i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
