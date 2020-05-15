package p000;

/* renamed from: bupr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bupr f154670a;

    /* renamed from: b */
    private static volatile bxxk f154671b;

    static {
        bupr bupr = new bupr();
        f154670a = bupr;
        bxvk.m124024a(bupr.class, bupr);
    }

    private bupr() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f154670a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bupr();
        }
        if (i2 == 4) {
            return new bxvd(f154670a);
        }
        if (i2 == 5) {
            return f154670a;
        }
        bxxk bxxk = f154671b;
        if (bxxk == null) {
            synchronized (bupr.class) {
                bxxk = f154671b;
                if (bxxk == null) {
                    bxxk = new bxve(f154670a);
                    f154671b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
