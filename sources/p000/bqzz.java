package p000;

/* renamed from: bqzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqzz f142114e;

    /* renamed from: f */
    private static volatile bxxk f142115f;

    /* renamed from: a */
    public int f142116a;

    /* renamed from: b */
    public braj f142117b;

    /* renamed from: c */
    public bxtx f142118c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f142119d = bxtx.f164797b;

    static {
        bqzz bqzz = new bqzz();
        f142114e = bqzz;
        bxvk.m124024a(bqzz.class, bqzz);
    }

    private bqzz() {
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
            return bxvk.m124022a(f142114e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f142114e);
            }
            if (i2 == 5) {
                return f142114e;
            }
            bxxk bxxk = f142115f;
            if (bxxk == null) {
                synchronized (bqzz.class) {
                    bxxk = f142115f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142114e);
                        f142115f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
