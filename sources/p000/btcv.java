package p000;

/* renamed from: btcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btcv f148356b;

    /* renamed from: c */
    private static volatile bxxk f148357c;

    /* renamed from: a */
    public btcs f148358a;

    static {
        btcv btcv = new btcv();
        f148356b = btcv;
        bxvk.m124024a(btcv.class, btcv);
    }

    private btcv() {
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
            return bxvk.m124022a(f148356b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f148356b);
            }
            if (i2 == 5) {
                return f148356b;
            }
            bxxk bxxk = f148357c;
            if (bxxk == null) {
                synchronized (btcv.class) {
                    bxxk = f148357c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148356b);
                        f148357c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
