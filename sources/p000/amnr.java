package p000;

/* renamed from: amnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final amnr f75534d;

    /* renamed from: e */
    private static volatile bxxk f75535e;

    /* renamed from: a */
    public int f75536a;

    /* renamed from: b */
    public int f75537b;

    /* renamed from: c */
    public long f75538c;

    static {
        amnr amnr = new amnr();
        f75534d = amnr;
        bxvk.m124024a(amnr.class, amnr);
    }

    private amnr() {
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
            return bxvk.m124022a(f75534d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", amnq.f75533a, "c"});
        } else if (i2 == 3) {
            return new amnr();
        } else {
            if (i2 == 4) {
                return new bxvd(f75534d);
            }
            if (i2 == 5) {
                return f75534d;
            }
            bxxk bxxk = f75535e;
            if (bxxk == null) {
                synchronized (amnr.class) {
                    bxxk = f75535e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75534d);
                        f75535e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
