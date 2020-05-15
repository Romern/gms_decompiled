package p000;

/* renamed from: bgov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgov extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bgov f116962d;

    /* renamed from: e */
    private static volatile bxxk f116963e;

    /* renamed from: a */
    public int f116964a;

    /* renamed from: b */
    public int f116965b = 1;

    /* renamed from: c */
    public int f116966c;

    static {
        bgov bgov = new bgov();
        f116962d = bgov;
        bxvk.m124024a(bgov.class, bgov);
    }

    private bgov() {
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
            return bxvk.m124022a(f116962d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bgot.f116961a, "c"});
        } else if (i2 == 3) {
            return new bgov();
        } else {
            if (i2 == 4) {
                return new bxvd(f116962d);
            }
            if (i2 == 5) {
                return f116962d;
            }
            bxxk bxxk = f116963e;
            if (bxxk == null) {
                synchronized (bgov.class) {
                    bxxk = f116963e;
                    if (bxxk == null) {
                        bxxk = new bxve(f116962d);
                        f116963e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
