package p000;

/* renamed from: abdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final abdt f57133a;

    /* renamed from: b */
    private static volatile bxxk f57134b;

    static {
        abdt abdt = new abdt();
        f57133a = abdt;
        bxvk.m124024a(abdt.class, abdt);
    }

    private abdt() {
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
            return bxvk.m124022a(f57133a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdt();
        }
        if (i2 == 4) {
            return new bxvd(f57133a);
        }
        if (i2 == 5) {
            return f57133a;
        }
        bxxk bxxk = f57134b;
        if (bxxk == null) {
            synchronized (abdt.class) {
                bxxk = f57134b;
                if (bxxk == null) {
                    bxxk = new bxve(f57133a);
                    f57134b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
