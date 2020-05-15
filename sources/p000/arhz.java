package p000;

/* renamed from: arhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final arhz f87765d;

    /* renamed from: e */
    private static volatile bxxk f87766e;

    /* renamed from: a */
    public int f87767a;

    /* renamed from: b */
    public bxtx f87768b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f87769c = bxtx.f164797b;

    static {
        arhz arhz = new arhz();
        f87765d = arhz;
        bxvk.m124024a(arhz.class, arhz);
    }

    private arhz() {
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
            return bxvk.m124022a(f87765d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arhz();
        } else {
            if (i2 == 4) {
                return new bxvd(f87765d);
            }
            if (i2 == 5) {
                return f87765d;
            }
            bxxk bxxk = f87766e;
            if (bxxk == null) {
                synchronized (arhz.class) {
                    bxxk = f87766e;
                    if (bxxk == null) {
                        bxxk = new bxve(f87765d);
                        f87766e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
