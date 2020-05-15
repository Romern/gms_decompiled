package p000;

/* renamed from: bqho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqho extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bqho f140681a;

    /* renamed from: b */
    private static volatile bxxk f140682b;

    static {
        bqho bqho = new bqho();
        f140681a = bqho;
        bxvk.m124024a(bqho.class, bqho);
    }

    private bqho() {
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
            return bxvk.m124022a(f140681a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqho();
        }
        if (i2 == 4) {
            return new bxvd(f140681a);
        }
        if (i2 == 5) {
            return f140681a;
        }
        bxxk bxxk = f140682b;
        if (bxxk == null) {
            synchronized (bqho.class) {
                bxxk = f140682b;
                if (bxxk == null) {
                    bxxk = new bxve(f140681a);
                    f140682b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
