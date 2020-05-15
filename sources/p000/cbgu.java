package p000;

/* renamed from: cbgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbgu f177088b;

    /* renamed from: c */
    private static volatile bxxk f177089c;

    /* renamed from: a */
    public long f177090a;

    static {
        cbgu cbgu = new cbgu();
        f177088b = cbgu;
        bxvk.m124024a(cbgu.class, cbgu);
    }

    private cbgu() {
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
            return bxvk.m124022a(f177088b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbgu();
        } else {
            if (i2 == 4) {
                return new bxvd(f177088b);
            }
            if (i2 == 5) {
                return f177088b;
            }
            bxxk bxxk = f177089c;
            if (bxxk == null) {
                synchronized (cbgu.class) {
                    bxxk = f177089c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177088b);
                        f177089c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
