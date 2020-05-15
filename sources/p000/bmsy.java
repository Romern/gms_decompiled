package p000;

/* renamed from: bmsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmsy f130790d;

    /* renamed from: e */
    private static volatile bxxk f130791e;

    /* renamed from: a */
    public bmst f130792a;

    /* renamed from: b */
    public bmsw f130793b;

    /* renamed from: c */
    public bmsx f130794c;

    static {
        bmsy bmsy = new bmsy();
        f130790d = bmsy;
        bxvk.m124024a(bmsy.class, bmsy);
    }

    private bmsy() {
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
            return bxvk.m124022a(f130790d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmsy();
        } else {
            if (i2 == 4) {
                return new bxvd(f130790d);
            }
            if (i2 == 5) {
                return f130790d;
            }
            bxxk bxxk = f130791e;
            if (bxxk == null) {
                synchronized (bmsy.class) {
                    bxxk = f130791e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130790d);
                        f130791e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
