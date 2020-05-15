package p000;

/* renamed from: bzta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzta extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzta f171307a;

    /* renamed from: b */
    private static volatile bxxk f171308b;

    static {
        bzta bzta = new bzta();
        f171307a = bzta;
        bxvk.m124024a(bzta.class, bzta);
    }

    private bzta() {
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
            return bxvk.m124022a(f171307a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzta();
        }
        if (i2 == 4) {
            return new bxvd(f171307a);
        }
        if (i2 == 5) {
            return f171307a;
        }
        bxxk bxxk = f171308b;
        if (bxxk == null) {
            synchronized (bzta.class) {
                bxxk = f171308b;
                if (bxxk == null) {
                    bxxk = new bxve(f171307a);
                    f171308b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
