package p000;

/* renamed from: bvbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvbs f155560d;

    /* renamed from: e */
    private static volatile bxxk f155561e;

    /* renamed from: a */
    public int f155562a;

    /* renamed from: b */
    public int f155563b;

    /* renamed from: c */
    public bxtx f155564c = bxtx.f164797b;

    static {
        bvbs bvbs = new bvbs();
        f155560d = bvbs;
        bxvk.m124024a(bvbs.class, bvbs);
    }

    private bvbs() {
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
            return bxvk.m124022a(f155560d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", bvbt.f155565a, "c"});
        } else if (i2 == 3) {
            return new bvbs();
        } else {
            if (i2 == 4) {
                return new bxvd(f155560d);
            }
            if (i2 == 5) {
                return f155560d;
            }
            bxxk bxxk = f155561e;
            if (bxxk == null) {
                synchronized (bvbs.class) {
                    bxxk = f155561e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155560d);
                        f155561e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
