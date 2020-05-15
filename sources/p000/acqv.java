package p000;

/* renamed from: acqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final acqv f60548d;

    /* renamed from: e */
    private static volatile bxxk f60549e;

    /* renamed from: a */
    public int f60550a;

    /* renamed from: b */
    public acqt f60551b;

    /* renamed from: c */
    public acqu f60552c;

    static {
        acqv acqv = new acqv();
        f60548d = acqv;
        bxvk.m124024a(acqv.class, acqv);
    }

    private acqv() {
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
            return bxvk.m124022a(f60548d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new acqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f60548d);
            }
            if (i2 == 5) {
                return f60548d;
            }
            bxxk bxxk = f60549e;
            if (bxxk == null) {
                synchronized (acqv.class) {
                    bxxk = f60549e;
                    if (bxxk == null) {
                        bxxk = new bxve(f60548d);
                        f60549e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
