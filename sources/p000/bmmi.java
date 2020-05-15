package p000;

/* renamed from: bmmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmmi f130016b;

    /* renamed from: d */
    private static volatile bxxk f130017d;

    /* renamed from: a */
    public bxtx f130018a = bxtx.f164797b;

    /* renamed from: c */
    private int f130019c;

    static {
        bmmi bmmi = new bmmi();
        f130016b = bmmi;
        bxvk.m124024a(bmmi.class, bmmi);
    }

    private bmmi() {
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
            return bxvk.m124022a(f130016b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f130016b);
            }
            if (i2 == 5) {
                return f130016b;
            }
            bxxk bxxk = f130017d;
            if (bxxk == null) {
                synchronized (bmmi.class) {
                    bxxk = f130017d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130016b);
                        f130017d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
