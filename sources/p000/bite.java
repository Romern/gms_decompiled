package p000;

/* renamed from: bite */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bite extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bite f121633a;

    /* renamed from: b */
    private static volatile bxxk f121634b;

    static {
        bite bite = new bite();
        f121633a = bite;
        bxvk.m124024a(bite.class, bite);
    }

    private bite() {
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
            return bxvk.m124022a(f121633a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bite();
        }
        if (i2 == 4) {
            return new bxvd(f121633a);
        }
        if (i2 == 5) {
            return f121633a;
        }
        bxxk bxxk = f121634b;
        if (bxxk == null) {
            synchronized (bite.class) {
                bxxk = f121634b;
                if (bxxk == null) {
                    bxxk = new bxve(f121633a);
                    f121634b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
