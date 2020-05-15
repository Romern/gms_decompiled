package p000;

/* renamed from: asig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asig extends bxvk implements bxxd {

    /* renamed from: b */
    public static final asig f89014b;

    /* renamed from: c */
    private static volatile bxxk f89015c;

    /* renamed from: a */
    public bxwc f89016a = bxxn.f165040b;

    static {
        asig asig = new asig();
        f89014b = asig;
        bxvk.m124024a(asig.class, asig);
    }

    private asig() {
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
            return bxvk.m124022a(f89014b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", asif.class});
        } else if (i2 == 3) {
            return new asig();
        } else {
            if (i2 == 4) {
                return new bxvd(f89014b);
            }
            if (i2 == 5) {
                return f89014b;
            }
            bxxk bxxk = f89015c;
            if (bxxk == null) {
                synchronized (asig.class) {
                    bxxk = f89015c;
                    if (bxxk == null) {
                        bxxk = new bxve(f89014b);
                        f89015c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
