package p000;

/* renamed from: boiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boiz extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final boiz f133248g;

    /* renamed from: h */
    private static volatile bxxk f133249h;

    /* renamed from: a */
    public int f133250a;

    /* renamed from: b */
    public String f133251b = "";

    /* renamed from: c */
    public String f133252c = "";

    /* renamed from: d */
    public int f133253d;

    /* renamed from: e */
    public String f133254e = "";

    /* renamed from: f */
    public String f133255f = "";

    static {
        boiz boiz = new boiz();
        f133248g = boiz;
        GeneratedMessageLite.m124024a(boiz.class, boiz);
    }

    private boiz() {
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
            return GeneratedMessageLite.m124022a(f133248g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0005ဈ\u0004\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", boiy.f133247a, "e", "f"});
        } else if (i2 == 3) {
            return new boiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f133248g);
            }
            if (i2 == 5) {
                return f133248g;
            }
            bxxk bxxk = f133249h;
            if (bxxk == null) {
                synchronized (boiz.class) {
                    bxxk = f133249h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133248g);
                        f133249h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
