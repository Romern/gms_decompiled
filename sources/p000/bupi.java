package p000;

/* renamed from: bupi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bupi f154641b;

    /* renamed from: c */
    private static volatile bxxk f154642c;

    /* renamed from: a */
    public bxtx f154643a = bxtx.f164797b;

    static {
        bupi bupi = new bupi();
        f154641b = bupi;
        bxvk.m124024a(bupi.class, bupi);
    }

    private bupi() {
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
            return bxvk.m124022a(f154641b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bupi();
        } else {
            if (i2 == 4) {
                return new bxvd(f154641b);
            }
            if (i2 == 5) {
                return f154641b;
            }
            bxxk bxxk = f154642c;
            if (bxxk == null) {
                synchronized (bupi.class) {
                    bxxk = f154642c;
                    if (bxxk == null) {
                        bxxk = new bxve(f154641b);
                        f154642c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
