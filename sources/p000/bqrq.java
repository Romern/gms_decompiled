package p000;

/* renamed from: bqrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqrq f141465d;

    /* renamed from: e */
    private static volatile bxxk f141466e;

    /* renamed from: a */
    public int f141467a;

    /* renamed from: b */
    public bqrr f141468b;

    /* renamed from: c */
    public bxtx f141469c = bxtx.f164797b;

    static {
        bqrq bqrq = new bqrq();
        f141465d = bqrq;
        bxvk.m124024a(bqrq.class, bqrq);
    }

    private bqrq() {
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
            return bxvk.m124022a(f141465d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqrq();
        } else {
            if (i2 == 4) {
                return new bxvd(f141465d);
            }
            if (i2 == 5) {
                return f141465d;
            }
            bxxk bxxk = f141466e;
            if (bxxk == null) {
                synchronized (bqrq.class) {
                    bxxk = f141466e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141465d);
                        f141466e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
