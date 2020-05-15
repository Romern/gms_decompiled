package p000;

/* renamed from: djd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final djd f13314d;

    /* renamed from: e */
    private static volatile bxxk f13315e;

    /* renamed from: a */
    public int f13316a;

    /* renamed from: b */
    public String f13317b = "";

    /* renamed from: c */
    public long f13318c;

    static {
        djd djd = new djd();
        f13314d = djd;
        GeneratedMessageLite.m124024a(djd.class, djd);
    }

    private djd() {
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
            return GeneratedMessageLite.m124022a(f13314d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new djd();
        } else {
            if (i2 == 4) {
                return new bxvd(f13314d);
            }
            if (i2 == 5) {
                return f13314d;
            }
            bxxk bxxk = f13315e;
            if (bxxk == null) {
                synchronized (djd.class) {
                    bxxk = f13315e;
                    if (bxxk == null) {
                        bxxk = new bxve(f13314d);
                        f13315e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
