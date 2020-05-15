package p000;

/* renamed from: cbde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbde extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbde f176723b;

    /* renamed from: c */
    private static volatile bxxk f176724c;

    /* renamed from: a */
    public long f176725a;

    static {
        cbde cbde = new cbde();
        f176723b = cbde;
        bxvk.m124024a(cbde.class, cbde);
    }

    private cbde() {
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
            return bxvk.m124022a(f176723b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbde();
        } else {
            if (i2 == 4) {
                return new bxvd(f176723b);
            }
            if (i2 == 5) {
                return f176723b;
            }
            bxxk bxxk = f176724c;
            if (bxxk == null) {
                synchronized (cbde.class) {
                    bxxk = f176724c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176723b);
                        f176724c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
