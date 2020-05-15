package p000;

/* renamed from: cbia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbia extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbia f177224a;

    /* renamed from: b */
    private static volatile bxxk f177225b;

    static {
        cbia cbia = new cbia();
        f177224a = cbia;
        bxvk.m124024a(cbia.class, cbia);
    }

    private cbia() {
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
            return bxvk.m124022a(f177224a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbia();
        }
        if (i2 == 4) {
            return new bxvd(f177224a);
        }
        if (i2 == 5) {
            return f177224a;
        }
        bxxk bxxk = f177225b;
        if (bxxk == null) {
            synchronized (cbia.class) {
                bxxk = f177225b;
                if (bxxk == null) {
                    bxxk = new bxve(f177224a);
                    f177225b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
