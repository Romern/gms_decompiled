package p000;

/* renamed from: bmtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmtd f130817d;

    /* renamed from: e */
    private static volatile bxxk f130818e;

    /* renamed from: a */
    public bxyk f130819a;

    /* renamed from: b */
    public bxyk f130820b;

    /* renamed from: c */
    public int f130821c;

    static {
        bmtd bmtd = new bmtd();
        f130817d = bmtd;
        bxvk.m124024a(bmtd.class, bmtd);
    }

    private bmtd() {
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
            return bxvk.m124022a(f130817d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmtd();
        } else {
            if (i2 == 4) {
                return new bxvd(f130817d);
            }
            if (i2 == 5) {
                return f130817d;
            }
            bxxk bxxk = f130818e;
            if (bxxk == null) {
                synchronized (bmtd.class) {
                    bxxk = f130818e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130817d);
                        f130818e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
