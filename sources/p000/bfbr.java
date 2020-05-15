package p000;

/* renamed from: bfbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bfbr f113335d;

    /* renamed from: e */
    private static volatile bxxk f113336e;

    /* renamed from: a */
    public bxtx f113337a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f113338b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f113339c = bxtx.f164797b;

    static {
        bfbr bfbr = new bfbr();
        f113335d = bfbr;
        bxvk.m124024a(bfbr.class, bfbr);
    }

    private bfbr() {
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
            return bxvk.m124022a(f113335d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bfbr();
        } else {
            if (i2 == 4) {
                return new bxvd(f113335d);
            }
            if (i2 == 5) {
                return f113335d;
            }
            bxxk bxxk = f113336e;
            if (bxxk == null) {
                synchronized (bfbr.class) {
                    bxxk = f113336e;
                    if (bxxk == null) {
                        bxxk = new bxve(f113335d);
                        f113336e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
