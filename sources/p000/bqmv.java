package p000;

/* renamed from: bqmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqmv f141267d;

    /* renamed from: e */
    private static volatile bxxk f141268e;

    /* renamed from: a */
    public int f141269a;

    /* renamed from: b */
    public bqnb f141270b;

    /* renamed from: c */
    public bxun f141271c;

    static {
        bqmv bqmv = new bqmv();
        f141267d = bqmv;
        bxvk.m124024a(bqmv.class, bqmv);
    }

    private bqmv() {
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
            return bxvk.m124022a(f141267d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqmv();
        } else {
            if (i2 == 4) {
                return new bxvd(f141267d);
            }
            if (i2 == 5) {
                return f141267d;
            }
            bxxk bxxk = f141268e;
            if (bxxk == null) {
                synchronized (bqmv.class) {
                    bxxk = f141268e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141267d);
                        f141268e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
