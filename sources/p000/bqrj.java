package p000;

/* renamed from: bqrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqrj f141438d;

    /* renamed from: e */
    private static volatile bxxk f141439e;

    /* renamed from: a */
    public int f141440a;

    /* renamed from: b */
    public int f141441b;

    /* renamed from: c */
    public int f141442c;

    static {
        bqrj bqrj = new bqrj();
        f141438d = bqrj;
        bxvk.m124024a(bqrj.class, bqrj);
    }

    private bqrj() {
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
            return bxvk.m124022a(f141438d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f141438d);
            }
            if (i2 == 5) {
                return f141438d;
            }
            bxxk bxxk = f141439e;
            if (bxxk == null) {
                synchronized (bqrj.class) {
                    bxxk = f141439e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141438d);
                        f141439e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
