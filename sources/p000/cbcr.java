package p000;

/* renamed from: cbcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbcr f176677e;

    /* renamed from: f */
    private static volatile bxxk f176678f;

    /* renamed from: a */
    public cbmo f176679a;

    /* renamed from: b */
    public bxtx f176680b = bxtx.f164797b;

    /* renamed from: c */
    public bxvt f176681c = bxvm.f164965b;

    /* renamed from: d */
    public cbdl f176682d;

    static {
        cbcr cbcr = new cbcr();
        f176677e = cbcr;
        bxvk.m124024a(cbcr.class, cbcr);
    }

    private cbcr() {
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
            return bxvk.m124022a(f176677e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\n\u0003,\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbcr();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176677e;
            }
            bxxk bxxk = f176678f;
            if (bxxk == null) {
                synchronized (cbcr.class) {
                    bxxk = f176678f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176677e);
                        f176678f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
