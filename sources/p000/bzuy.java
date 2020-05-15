package p000;

/* renamed from: bzuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzuy f171484a;

    /* renamed from: b */
    private static volatile bxxk f171485b;

    static {
        bzuy bzuy = new bzuy();
        f171484a = bzuy;
        bxvk.m124024a(bzuy.class, bzuy);
    }

    private bzuy() {
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
            return bxvk.m124022a(f171484a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzuy();
        }
        if (i2 == 4) {
            return new bxvd(f171484a);
        }
        if (i2 == 5) {
            return f171484a;
        }
        bxxk bxxk = f171485b;
        if (bxxk == null) {
            synchronized (bzuy.class) {
                bxxk = f171485b;
                if (bxxk == null) {
                    bxxk = new bxve(f171484a);
                    f171485b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
