package p000;

/* renamed from: bkxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkxp f125396e;

    /* renamed from: f */
    private static volatile bxxk f125397f;

    /* renamed from: a */
    public int f125398a;

    /* renamed from: b */
    public bkxm f125399b;

    /* renamed from: c */
    public bkxl f125400c;

    /* renamed from: d */
    public int f125401d;

    static {
        bkxp bkxp = new bkxp();
        f125396e = bkxp;
        bxvk.m124024a(bkxp.class, bkxp);
    }

    private bkxp() {
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
            return bxvk.m124022a(f125396e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bkxn.f125395a});
        } else if (i2 == 3) {
            return new bkxp();
        } else {
            if (i2 == 4) {
                return new bxvd(f125396e);
            }
            if (i2 == 5) {
                return f125396e;
            }
            bxxk bxxk = f125397f;
            if (bxxk == null) {
                synchronized (bkxp.class) {
                    bxxk = f125397f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125396e);
                        f125397f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
