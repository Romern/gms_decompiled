package p000;

/* renamed from: amnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final amnp f75526f;

    /* renamed from: g */
    private static volatile bxxk f75527g;

    /* renamed from: a */
    public int f75528a;

    /* renamed from: b */
    public int f75529b;

    /* renamed from: c */
    public long f75530c;

    /* renamed from: d */
    public int f75531d;

    /* renamed from: e */
    public String f75532e = "";

    static {
        amnp amnp = new amnp();
        f75526f = amnp;
        bxvk.m124024a(amnp.class, amnp);
    }

    private amnp() {
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
            return bxvk.m124022a(f75526f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", amjv.f75016a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new amnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f75526f);
            }
            if (i2 == 5) {
                return f75526f;
            }
            bxxk bxxk = f75527g;
            if (bxxk == null) {
                synchronized (amnp.class) {
                    bxxk = f75527g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75526f);
                        f75527g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
