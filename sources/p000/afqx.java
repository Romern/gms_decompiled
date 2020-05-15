package p000;

/* renamed from: afqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final afqx f64585b;

    /* renamed from: c */
    private static volatile bxxk f64586c;

    /* renamed from: a */
    public bxwc f64587a = bxxn.f165040b;

    static {
        afqx afqx = new afqx();
        f64585b = afqx;
        bxvk.m124024a(afqx.class, afqx);
    }

    private afqx() {
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
            return bxvk.m124022a(f64585b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", afqz.class});
        } else if (i2 == 3) {
            return new afqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f64585b);
            }
            if (i2 == 5) {
                return f64585b;
            }
            bxxk bxxk = f64586c;
            if (bxxk == null) {
                synchronized (afqx.class) {
                    bxxk = f64586c;
                    if (bxxk == null) {
                        bxxk = new bxve(f64585b);
                        f64586c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
