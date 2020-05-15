package p000;

/* renamed from: bqzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqzb f142013c;

    /* renamed from: d */
    private static volatile bxxk f142014d;

    /* renamed from: a */
    public int f142015a;

    /* renamed from: b */
    public int f142016b;

    static {
        bqzb bqzb = new bqzb();
        f142013c = bqzb;
        bxvk.m124024a(bqzb.class, bqzb);
    }

    private bqzb() {
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
            return bxvk.m124022a(f142013c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqzb();
        } else {
            if (i2 == 4) {
                return new bxvd(f142013c);
            }
            if (i2 == 5) {
                return f142013c;
            }
            bxxk bxxk = f142014d;
            if (bxxk == null) {
                synchronized (bqzb.class) {
                    bxxk = f142014d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142013c);
                        f142014d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
