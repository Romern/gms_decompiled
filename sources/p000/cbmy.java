package p000;

/* renamed from: cbmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbmy f177698b;

    /* renamed from: c */
    private static volatile bxxk f177699c;

    /* renamed from: a */
    public cbma f177700a;

    static {
        cbmy cbmy = new cbmy();
        f177698b = cbmy;
        bxvk.m124024a(cbmy.class, cbmy);
    }

    private cbmy() {
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
            return bxvk.m124022a(f177698b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f177698b);
            }
            if (i2 == 5) {
                return f177698b;
            }
            bxxk bxxk = f177699c;
            if (bxxk == null) {
                synchronized (cbmy.class) {
                    bxxk = f177699c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177698b);
                        f177699c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
