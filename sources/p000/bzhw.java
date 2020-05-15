package p000;

/* renamed from: bzhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bzhw f170123h;

    /* renamed from: i */
    private static volatile bxxk f170124i;

    /* renamed from: a */
    public int f170125a;

    /* renamed from: b */
    public int f170126b;

    /* renamed from: c */
    public double f170127c;

    /* renamed from: d */
    public double f170128d;

    /* renamed from: e */
    public long f170129e;

    /* renamed from: f */
    public String f170130f = "";

    /* renamed from: g */
    public String f170131g = "";

    static {
        bzhw bzhw = new bzhw();
        f170123h = bzhw;
        GeneratedMessageLite.m124024a(bzhw.class, bzhw);
    }

    private bzhw() {
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
            return GeneratedMessageLite.m124022a(f170123h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002\u0004ဂ\u0003\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", bzhu.f170122a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzhw();
        } else {
            if (i2 == 4) {
                return new bxvd(f170123h);
            }
            if (i2 == 5) {
                return f170123h;
            }
            bxxk bxxk = f170124i;
            if (bxxk == null) {
                synchronized (bzhw.class) {
                    bxxk = f170124i;
                    if (bxxk == null) {
                        bxxk = new bxve(f170123h);
                        f170124i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
