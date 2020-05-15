package p000;

/* renamed from: mco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mco extends bxvk implements bxxd {

    /* renamed from: d */
    public static final mco f33426d;

    /* renamed from: e */
    private static volatile bxxk f33427e;

    /* renamed from: a */
    public int f33428a;

    /* renamed from: b */
    public bxtx f33429b = bxtx.f164797b;

    /* renamed from: c */
    public int f33430c;

    static {
        mco mco = new mco();
        f33426d = mco;
        bxvk.m124024a(mco.class, mco);
    }

    private mco() {
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
            return bxvk.m124022a(f33426d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mco();
        } else {
            if (i2 == 4) {
                return new bxvd(f33426d);
            }
            if (i2 == 5) {
                return f33426d;
            }
            bxxk bxxk = f33427e;
            if (bxxk == null) {
                synchronized (mco.class) {
                    bxxk = f33427e;
                    if (bxxk == null) {
                        bxxk = new bxve(f33426d);
                        f33427e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
