package p000;

/* renamed from: aqcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aqcc f85634b;

    /* renamed from: d */
    private static volatile bxxk f85635d;

    /* renamed from: a */
    public bxtx f85636a = bxtx.f164797b;

    /* renamed from: c */
    private int f85637c;

    static {
        aqcc aqcc = new aqcc();
        f85634b = aqcc;
        bxvk.m124024a(aqcc.class, aqcc);
    }

    private aqcc() {
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
            return bxvk.m124022a(f85634b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new aqcc();
        } else {
            if (i2 == 4) {
                return new bxvd(f85634b);
            }
            if (i2 == 5) {
                return f85634b;
            }
            bxxk bxxk = f85635d;
            if (bxxk == null) {
                synchronized (aqcc.class) {
                    bxxk = f85635d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85634b);
                        f85635d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
