package p000;

/* renamed from: cboe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cboe f177806c;

    /* renamed from: d */
    private static volatile bxxk f177807d;

    /* renamed from: a */
    public int f177808a = 0;

    /* renamed from: b */
    public Object f177809b;

    static {
        cboe cboe = new cboe();
        f177806c = cboe;
        bxvk.m124024a(cboe.class, cboe);
    }

    private cboe() {
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
            return bxvk.m124022a(f177806c, "\u0000\u0005\u0001\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", cboo.class, cbny.class, cbol.class, cbou.class, cboj.class});
        } else if (i2 == 3) {
            return new cboe();
        } else {
            if (i2 == 4) {
                return new bxvd(f177806c);
            }
            if (i2 == 5) {
                return f177806c;
            }
            bxxk bxxk = f177807d;
            if (bxxk == null) {
                synchronized (cboe.class) {
                    bxxk = f177807d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177806c);
                        f177807d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
