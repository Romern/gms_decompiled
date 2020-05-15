package p000;

/* renamed from: btcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btcf f148263b;

    /* renamed from: c */
    private static volatile bxxk f148264c;

    /* renamed from: a */
    public bxvt f148265a = bxvm.f164965b;

    static {
        btcf btcf = new btcf();
        f148263b = btcf;
        bxvk.m124024a(btcf.class, btcf);
    }

    private btcf() {
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
            return bxvk.m124022a(f148263b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btcf();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148263b;
            }
            bxxk bxxk = f148264c;
            if (bxxk == null) {
                synchronized (btcf.class) {
                    bxxk = f148264c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148263b);
                        f148264c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
