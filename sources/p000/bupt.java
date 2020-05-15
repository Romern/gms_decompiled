package p000;

/* renamed from: bupt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bupt f154674a;

    /* renamed from: b */
    private static volatile bxxk f154675b;

    static {
        bupt bupt = new bupt();
        f154674a = bupt;
        bxvk.m124024a(bupt.class, bupt);
    }

    private bupt() {
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
            return bxvk.m124022a(f154674a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bupt();
        }
        if (i2 == 4) {
            return new bxvd(f154674a);
        }
        if (i2 == 5) {
            return f154674a;
        }
        bxxk bxxk = f154675b;
        if (bxxk == null) {
            synchronized (bupt.class) {
                bxxk = f154675b;
                if (bxxk == null) {
                    bxxk = new bxve(f154674a);
                    f154675b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
