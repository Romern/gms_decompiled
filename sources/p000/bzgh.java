package p000;

/* renamed from: bzgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzgh f169931f;

    /* renamed from: g */
    private static volatile bxxk f169932g;

    /* renamed from: a */
    public int f169933a;

    /* renamed from: b */
    public int f169934b;

    /* renamed from: c */
    public String f169935c = "";

    /* renamed from: d */
    public String f169936d = "";

    /* renamed from: e */
    public String f169937e = "";

    static {
        bzgh bzgh = new bzgh();
        f169931f = bzgh;
        GeneratedMessageLite.m124024a(bzgh.class, bzgh);
    }

    private bzgh() {
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
            return GeneratedMessageLite.m124022a(f169931f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", bzgg.f169930a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzgh();
        } else {
            if (i2 == 4) {
                return new bxvd(f169931f);
            }
            if (i2 == 5) {
                return f169931f;
            }
            bxxk bxxk = f169932g;
            if (bxxk == null) {
                synchronized (bzgh.class) {
                    bxxk = f169932g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169931f);
                        f169932g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
