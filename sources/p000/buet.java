package p000;

/* renamed from: buet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buet extends bxvk implements bxxd {

    /* renamed from: a */
    public static final buet f153644a;

    /* renamed from: b */
    private static volatile bxxk f153645b;

    static {
        buet buet = new buet();
        f153644a = buet;
        bxvk.m124024a(buet.class, buet);
    }

    private buet() {
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
            return bxvk.m124022a(f153644a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new buet();
        }
        if (i2 == 4) {
            return new bxvd(f153644a);
        }
        if (i2 == 5) {
            return f153644a;
        }
        bxxk bxxk = f153645b;
        if (bxxk == null) {
            synchronized (buet.class) {
                bxxk = f153645b;
                if (bxxk == null) {
                    bxxk = new bxve(f153644a);
                    f153645b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
