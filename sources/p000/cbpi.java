package p000;

/* renamed from: cbpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbpi f177930b;

    /* renamed from: c */
    private static volatile bxxk f177931c;

    /* renamed from: a */
    public int f177932a;

    static {
        cbpi cbpi = new cbpi();
        f177930b = cbpi;
        bxvk.m124024a(cbpi.class, cbpi);
    }

    private cbpi() {
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
            return bxvk.m124022a(f177930b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbpi();
        } else {
            if (i2 == 4) {
                return new bxvd(f177930b);
            }
            if (i2 == 5) {
                return f177930b;
            }
            bxxk bxxk = f177931c;
            if (bxxk == null) {
                synchronized (cbpi.class) {
                    bxxk = f177931c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177930b);
                        f177931c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
