package p000;

/* renamed from: blzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzu extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final blzu f128387j;

    /* renamed from: k */
    private static volatile bxxk f128388k;

    /* renamed from: a */
    public int f128389a;

    /* renamed from: b */
    public String f128390b = "";

    /* renamed from: c */
    public int f128391c;

    /* renamed from: d */
    public String f128392d = "";

    /* renamed from: e */
    public String f128393e = "";

    /* renamed from: f */
    public String f128394f = "";

    /* renamed from: g */
    public blzr f128395g;

    /* renamed from: h */
    public boolean f128396h;

    /* renamed from: i */
    public boolean f128397i;

    static {
        blzu blzu = new blzu();
        f128387j = blzu;
        GeneratedMessageLite.m124024a(blzu.class, blzu);
    }

    private blzu() {
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
            return GeneratedMessageLite.m124022a(f128387j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဉ\u0005\u0005ဈ\u0000\u0006ဇ\u0006\u0007ဇ\u0007\bဌ\u0001", new Object[]{"a", "d", "e", "f", "g", "b", "h", "i", "c", blzs.f128386a});
        } else if (i2 == 3) {
            return new blzu();
        } else {
            if (i2 == 4) {
                return new bxvd(f128387j);
            }
            if (i2 == 5) {
                return f128387j;
            }
            bxxk bxxk = f128388k;
            if (bxxk == null) {
                synchronized (blzu.class) {
                    bxxk = f128388k;
                    if (bxxk == null) {
                        bxxk = new bxve(f128387j);
                        f128388k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
