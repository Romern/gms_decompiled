package p000;

/* renamed from: bzfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfg extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzfg f169792f;

    /* renamed from: g */
    private static volatile bxxk f169793g;

    /* renamed from: a */
    public int f169794a;

    /* renamed from: b */
    public int f169795b;

    /* renamed from: c */
    public String f169796c = "";

    /* renamed from: d */
    public String f169797d = "";

    /* renamed from: e */
    public String f169798e = "";

    static {
        bzfg bzfg = new bzfg();
        f169792f = bzfg;
        GeneratedMessageLite.m124024a(bzfg.class, bzfg);
    }

    private bzfg() {
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
            return GeneratedMessageLite.m124022a(f169792f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", bzfe.f169791a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzfg();
        } else {
            if (i2 == 4) {
                return new bxvd(f169792f);
            }
            if (i2 == 5) {
                return f169792f;
            }
            bxxk bxxk = f169793g;
            if (bxxk == null) {
                synchronized (bzfg.class) {
                    bxxk = f169793g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169792f);
                        f169793g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
