package p000;

/* renamed from: aqcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aqcv f85714c;

    /* renamed from: d */
    private static volatile bxxk f85715d;

    /* renamed from: a */
    public int f85716a;

    /* renamed from: b */
    public bxtx f85717b = bxtx.f164797b;

    static {
        aqcv aqcv = new aqcv();
        f85714c = aqcv;
        bxvk.m124024a(aqcv.class, aqcv);
    }

    private aqcv() {
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
            return bxvk.m124022a(f85714c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f85714c);
            }
            if (i2 == 5) {
                return f85714c;
            }
            bxxk bxxk = f85715d;
            if (bxxk == null) {
                synchronized (aqcv.class) {
                    bxxk = f85715d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85714c);
                        f85715d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
