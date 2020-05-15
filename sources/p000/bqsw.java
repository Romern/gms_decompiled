package p000;

/* renamed from: bqsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqsw f141587d;

    /* renamed from: e */
    private static volatile bxxk f141588e;

    /* renamed from: a */
    public bqsx f141589a;

    /* renamed from: b */
    public int f141590b;

    /* renamed from: c */
    public bxtx f141591c = bxtx.f164797b;

    static {
        bqsw bqsw = new bqsw();
        f141587d = bqsw;
        bxvk.m124024a(bqsw.class, bqsw);
    }

    private bqsw() {
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
            return bxvk.m124022a(f141587d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f141587d);
            }
            if (i2 == 5) {
                return f141587d;
            }
            bxxk bxxk = f141588e;
            if (bxxk == null) {
                synchronized (bqsw.class) {
                    bxxk = f141588e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141587d);
                        f141588e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
