package p000;

/* renamed from: blsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blsq f127611b;

    /* renamed from: c */
    private static volatile bxxk f127612c;

    /* renamed from: a */
    public bxwc f127613a = bxxn.f165040b;

    static {
        blsq blsq = new blsq();
        f127611b = blsq;
        bxvk.m124024a(blsq.class, blsq);
    }

    private blsq() {
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
            return bxvk.m124022a(f127611b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", blsp.class});
        } else if (i2 == 3) {
            return new blsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f127611b);
            }
            if (i2 == 5) {
                return f127611b;
            }
            bxxk bxxk = f127612c;
            if (bxxk == null) {
                synchronized (blsq.class) {
                    bxxk = f127612c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127611b);
                        f127612c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
