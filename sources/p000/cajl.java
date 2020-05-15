package p000;

/* renamed from: cajl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cajl f174833d;

    /* renamed from: e */
    private static volatile bxxk f174834e;

    /* renamed from: a */
    public int f174835a;

    /* renamed from: b */
    public int f174836b;

    /* renamed from: c */
    public int f174837c;

    static {
        cajl cajl = new cajl();
        f174833d = cajl;
        bxvk.m124024a(cajl.class, cajl);
    }

    private cajl() {
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
            return bxvk.m124022a(f174833d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", cajk.f174832a, "c"});
        } else if (i2 == 3) {
            return new cajl();
        } else {
            if (i2 == 4) {
                return new bxvd(f174833d);
            }
            if (i2 == 5) {
                return f174833d;
            }
            bxxk bxxk = f174834e;
            if (bxxk == null) {
                synchronized (cajl.class) {
                    bxxk = f174834e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174833d);
                        f174834e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
