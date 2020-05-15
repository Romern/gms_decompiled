package p000;

/* renamed from: mse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mse extends bxvk implements bxxd {

    /* renamed from: e */
    public static final mse f34525e;

    /* renamed from: f */
    private static volatile bxxk f34526f;

    /* renamed from: a */
    public int f34527a;

    /* renamed from: b */
    public int f34528b;

    /* renamed from: c */
    public long f34529c;

    /* renamed from: d */
    public int f34530d;

    static {
        mse mse = new mse();
        f34525e = mse;
        bxvk.m124024a(mse.class, mse);
    }

    private mse() {
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
            return bxvk.m124022a(f34525e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", msd.f34524a, "c", "d", msc.f34523a});
        } else if (i2 == 3) {
            return new mse();
        } else {
            if (i2 == 4) {
                return new bxvd(f34525e);
            }
            if (i2 == 5) {
                return f34525e;
            }
            bxxk bxxk = f34526f;
            if (bxxk == null) {
                synchronized (mse.class) {
                    bxxk = f34526f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34525e);
                        f34526f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
