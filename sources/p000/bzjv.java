package p000;

/* renamed from: bzjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzjv f170351g;

    /* renamed from: h */
    private static volatile bxxk f170352h;

    /* renamed from: a */
    public int f170353a;

    /* renamed from: b */
    public int f170354b;

    /* renamed from: c */
    public long f170355c;

    /* renamed from: d */
    public String f170356d = "";

    /* renamed from: e */
    public String f170357e = "";

    /* renamed from: f */
    public String f170358f = "";

    static {
        bzjv bzjv = new bzjv();
        f170351g = bzjv;
        GeneratedMessageLite.m124024a(bzjv.class, bzjv);
    }

    private bzjv() {
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
            return GeneratedMessageLite.m124022a(f170351g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", bzjw.f170359a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzjv();
        } else {
            if (i2 == 4) {
                return new bxvd(f170351g);
            }
            if (i2 == 5) {
                return f170351g;
            }
            bxxk bxxk = f170352h;
            if (bxxk == null) {
                synchronized (bzjv.class) {
                    bxxk = f170352h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170351g);
                        f170352h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
