package p000;

/* renamed from: bzqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzqx f171083c;

    /* renamed from: e */
    private static volatile bxxk f171084e;

    /* renamed from: a */
    public bzqz f171085a;

    /* renamed from: b */
    public bxwc f171086b = bxxn.f165040b;

    /* renamed from: d */
    private int f171087d;

    static {
        bzqx bzqx = new bzqx();
        f171083c = bzqx;
        bxvk.m124024a(bzqx.class, bzqx);
    }

    private bzqx() {
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
            return bxvk.m124022a(f171083c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bzqv.class});
        } else if (i2 == 3) {
            return new bzqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f171083c);
            }
            if (i2 == 5) {
                return f171083c;
            }
            bxxk bxxk = f171084e;
            if (bxxk == null) {
                synchronized (bzqx.class) {
                    bxxk = f171084e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171083c);
                        f171084e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
