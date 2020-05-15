package p000;

/* renamed from: mpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final mpq f34203d;

    /* renamed from: e */
    private static volatile bxxk f34204e;

    /* renamed from: a */
    public int f34205a;

    /* renamed from: b */
    public int f34206b;

    /* renamed from: c */
    public bxtx f34207c = bxtx.f164797b;

    static {
        mpq mpq = new mpq();
        f34203d = mpq;
        bxvk.m124024a(mpq.class, mpq);
    }

    private mpq() {
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
            return bxvk.m124022a(f34203d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", mpp.m25490b(), "c"});
        } else if (i2 == 3) {
            return new mpq();
        } else {
            if (i2 == 4) {
                return new bxvd(f34203d);
            }
            if (i2 == 5) {
                return f34203d;
            }
            bxxk bxxk = f34204e;
            if (bxxk == null) {
                synchronized (mpq.class) {
                    bxxk = f34204e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34203d);
                        f34204e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
