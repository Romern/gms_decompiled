package p000;

/* renamed from: bzik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzik extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzik f170200a;

    /* renamed from: b */
    private static volatile bxxk f170201b;

    static {
        bzik bzik = new bzik();
        f170200a = bzik;
        bxvk.m124024a(bzik.class, bzik);
    }

    private bzik() {
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
            return bxvk.m124022a(f170200a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzik();
        }
        if (i2 == 4) {
            return new bxvd(f170200a);
        }
        if (i2 == 5) {
            return f170200a;
        }
        bxxk bxxk = f170201b;
        if (bxxk == null) {
            synchronized (bzik.class) {
                bxxk = f170201b;
                if (bxxk == null) {
                    bxxk = new bxve(f170200a);
                    f170201b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
