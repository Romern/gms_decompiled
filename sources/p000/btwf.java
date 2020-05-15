package p000;

/* renamed from: btwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btwf f152696d;

    /* renamed from: e */
    private static volatile bxxk f152697e;

    /* renamed from: a */
    public double f152698a;

    /* renamed from: b */
    public double f152699b;

    /* renamed from: c */
    public double f152700c;

    static {
        btwf btwf = new btwf();
        f152696d = btwf;
        bxvk.m124024a(btwf.class, btwf);
    }

    private btwf() {
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
            return bxvk.m124022a(f152696d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btwf();
        } else {
            if (i2 == 4) {
                return new bxvd(f152696d);
            }
            if (i2 == 5) {
                return f152696d;
            }
            bxxk bxxk = f152697e;
            if (bxxk == null) {
                synchronized (btwf.class) {
                    bxxk = f152697e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152696d);
                        f152697e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
