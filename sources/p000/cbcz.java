package p000;

/* renamed from: cbcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbcz f176713c;

    /* renamed from: d */
    private static volatile bxxk f176714d;

    /* renamed from: a */
    public int f176715a;

    /* renamed from: b */
    public bxte f176716b;

    static {
        cbcz cbcz = new cbcz();
        f176713c = cbcz;
        bxvk.m124024a(cbcz.class, cbcz);
    }

    private cbcz() {
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
            return bxvk.m124022a(f176713c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbcz();
        } else {
            if (i2 == 4) {
                return new bxvd(f176713c);
            }
            if (i2 == 5) {
                return f176713c;
            }
            bxxk bxxk = f176714d;
            if (bxxk == null) {
                synchronized (cbcz.class) {
                    bxxk = f176714d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176713c);
                        f176714d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
