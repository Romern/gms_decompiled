package p000;

/* renamed from: btdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btdy f148473d;

    /* renamed from: e */
    private static volatile bxxk f148474e;

    /* renamed from: a */
    public btcf f148475a;

    /* renamed from: b */
    public bteb f148476b;

    /* renamed from: c */
    public bxvt f148477c = bxvm.f164965b;

    static {
        btdy btdy = new btdy();
        f148473d = btdy;
        bxvk.m124024a(btdy.class, btdy);
    }

    private btdy() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f148473d, "\u0000\u0003\u0000\u0000\u0004\t\u0003\u0000\u0001\u0000\u0004\t\u0006\t\t,", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btdy();
        } else {
            if (i2 == 4) {
                return new btdw();
            }
            if (i2 == 5) {
                return f148473d;
            }
            bxxk bxxk = f148474e;
            if (bxxk == null) {
                synchronized (btdy.class) {
                    bxxk = f148474e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148473d);
                        f148474e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
