package p000;

/* renamed from: abue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abue extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abue f58372e;

    /* renamed from: g */
    private static volatile bxxk f58373g;

    /* renamed from: a */
    public bxvt f58374a = bxvm.f164965b;

    /* renamed from: b */
    public bxtx f58375b = bxtx.f164797b;

    /* renamed from: c */
    public bxvt f58376c = bxvm.f164965b;

    /* renamed from: d */
    public bxtx f58377d = bxtx.f164797b;

    /* renamed from: f */
    private int f58378f;

    static {
        abue abue = new abue();
        f58372e = abue;
        bxvk.m124024a(abue.class, abue);
    }

    private abue() {
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
            return bxvk.m124022a(f58372e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001'\u0002ည\u0002\u0003'\u0004ည\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abue();
        } else {
            if (i2 == 4) {
                return new bxvd(f58372e);
            }
            if (i2 == 5) {
                return f58372e;
            }
            bxxk bxxk = f58373g;
            if (bxxk == null) {
                synchronized (abue.class) {
                    bxxk = f58373g;
                    if (bxxk == null) {
                        bxxk = new bxve(f58372e);
                        f58373g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
