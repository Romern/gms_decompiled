package p000;

/* renamed from: bmqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmqr f130414c;

    /* renamed from: e */
    private static volatile bxxk f130415e;

    /* renamed from: a */
    public int f130416a;

    /* renamed from: b */
    public bxtx f130417b = bxtx.f164797b;

    /* renamed from: d */
    private int f130418d;

    static {
        bmqr bmqr = new bmqr();
        f130414c = bmqr;
        bxvk.m124024a(bmqr.class, bmqr);
    }

    private bmqr() {
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
            return bxvk.m124022a(f130414c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"d", "a", bmqp.f130413a, "b"});
        } else if (i2 == 3) {
            return new bmqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f130414c);
            }
            if (i2 == 5) {
                return f130414c;
            }
            bxxk bxxk = f130415e;
            if (bxxk == null) {
                synchronized (bmqr.class) {
                    bxxk = f130415e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130414c);
                        f130415e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
