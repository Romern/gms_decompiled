package p000;

/* renamed from: bxgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxgp f163279d;

    /* renamed from: e */
    private static volatile bxxk f163280e;

    /* renamed from: a */
    public int f163281a;

    /* renamed from: b */
    public bxgo f163282b;

    /* renamed from: c */
    public int f163283c;

    static {
        bxgp bxgp = new bxgp();
        f163279d = bxgp;
        bxvk.m124024a(bxgp.class, bxgp);
    }

    private bxgp() {
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
            return bxvk.m124022a(f163279d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxgp();
        } else {
            if (i2 == 4) {
                return new bxvd(f163279d);
            }
            if (i2 == 5) {
                return f163279d;
            }
            bxxk bxxk = f163280e;
            if (bxxk == null) {
                synchronized (bxgp.class) {
                    bxxk = f163280e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163279d);
                        f163280e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
