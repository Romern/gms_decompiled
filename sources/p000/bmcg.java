package p000;

/* renamed from: bmcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmcg f128673d;

    /* renamed from: e */
    private static volatile bxxk f128674e;

    /* renamed from: a */
    public int f128675a;

    /* renamed from: b */
    public bxtx f128676b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f128677c = bxtx.f164797b;

    static {
        bmcg bmcg = new bmcg();
        f128673d = bmcg;
        bxvk.m124024a(bmcg.class, bmcg);
    }

    private bmcg() {
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
            return bxvk.m124022a(f128673d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmcg();
        } else {
            if (i2 == 4) {
                return new bxvd(f128673d);
            }
            if (i2 == 5) {
                return f128673d;
            }
            bxxk bxxk = f128674e;
            if (bxxk == null) {
                synchronized (bmcg.class) {
                    bxxk = f128674e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128673d);
                        f128674e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
