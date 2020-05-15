package p000;

/* renamed from: blnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blnh f126972b;

    /* renamed from: c */
    private static volatile bxxk f126973c;

    /* renamed from: a */
    public bxwc f126974a = bxxn.f165040b;

    static {
        blnh blnh = new blnh();
        f126972b = blnh;
        bxvk.m124024a(blnh.class, blnh);
    }

    private blnh() {
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
            return bxvk.m124022a(f126972b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new blnh();
        } else {
            if (i2 == 4) {
                return new bxvd(f126972b);
            }
            if (i2 == 5) {
                return f126972b;
            }
            bxxk bxxk = f126973c;
            if (bxxk == null) {
                synchronized (blnh.class) {
                    bxxk = f126973c;
                    if (bxxk == null) {
                        bxxk = new bxve(f126972b);
                        f126973c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
