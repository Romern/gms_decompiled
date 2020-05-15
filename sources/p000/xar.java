package p000;

/* renamed from: xar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xar extends bxvk implements bxxd {

    /* renamed from: d */
    public static final xar f51817d;

    /* renamed from: e */
    private static volatile bxxk f51818e;

    /* renamed from: a */
    public int f51819a;

    /* renamed from: b */
    public int f51820b;

    /* renamed from: c */
    public int f51821c;

    static {
        xar xar = new xar();
        f51817d = xar;
        bxvk.m124024a(xar.class, xar);
    }

    private xar() {
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
            return bxvk.m124022a(f51817d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", xan.m42568b()});
        } else if (i2 == 3) {
            return new xar();
        } else {
            if (i2 == 4) {
                return new bxvd(f51817d);
            }
            if (i2 == 5) {
                return f51817d;
            }
            bxxk bxxk = f51818e;
            if (bxxk == null) {
                synchronized (xar.class) {
                    bxxk = f51818e;
                    if (bxxk == null) {
                        bxxk = new bxve(f51817d);
                        f51818e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
