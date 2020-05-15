package p000;

/* renamed from: aqcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aqcw f85718c;

    /* renamed from: e */
    private static volatile bxxk f85719e;

    /* renamed from: a */
    public bxtx f85720a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f85721b = bxtx.f164797b;

    /* renamed from: d */
    private int f85722d;

    static {
        aqcw aqcw = new aqcw();
        f85718c = aqcw;
        bxvk.m124024a(aqcw.class, aqcw);
    }

    private aqcw() {
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
            return bxvk.m124022a(f85718c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new aqcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f85718c);
            }
            if (i2 == 5) {
                return f85718c;
            }
            bxxk bxxk = f85719e;
            if (bxxk == null) {
                synchronized (aqcw.class) {
                    bxxk = f85719e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85718c);
                        f85719e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
