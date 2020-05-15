package p000;

/* renamed from: bmco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmco extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmco f128726b;

    /* renamed from: c */
    private static volatile bxxk f128727c;

    /* renamed from: a */
    public bxwc f128728a = bxxn.f165040b;

    static {
        bmco bmco = new bmco();
        f128726b = bmco;
        bxvk.m124024a(bmco.class, bmco);
    }

    private bmco() {
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
            return bxvk.m124022a(f128726b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bmco();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f128726b;
            }
            bxxk bxxk = f128727c;
            if (bxxk == null) {
                synchronized (bmco.class) {
                    bxxk = f128727c;
                    if (bxxk == null) {
                        bxxk = new bxve(f128726b);
                        f128727c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
