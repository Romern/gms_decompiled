package p000;

/* renamed from: bzuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzuh f171422b;

    /* renamed from: c */
    private static volatile bxxk f171423c;

    /* renamed from: a */
    public bzud f171424a;

    static {
        bzuh bzuh = new bzuh();
        f171422b = bzuh;
        bxvk.m124024a(bzuh.class, bzuh);
    }

    private bzuh() {
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
            return bxvk.m124022a(f171422b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzuh();
        } else {
            if (i2 == 4) {
                return new bxvd(f171422b);
            }
            if (i2 == 5) {
                return f171422b;
            }
            bxxk bxxk = f171423c;
            if (bxxk == null) {
                synchronized (bzuh.class) {
                    bxxk = f171423c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171422b);
                        f171423c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
