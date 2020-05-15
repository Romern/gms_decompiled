package p000;

/* renamed from: bsrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsrz f146816d;

    /* renamed from: e */
    private static volatile bxxk f146817e;

    /* renamed from: a */
    public int f146818a;

    /* renamed from: b */
    public int f146819b;

    /* renamed from: c */
    public String f146820c = "";

    static {
        bsrz bsrz = new bsrz();
        f146816d = bsrz;
        bxvk.m124024a(bsrz.class, bsrz);
    }

    private bsrz() {
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
            return bxvk.m124022a(f146816d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsrz();
        } else {
            if (i2 == 4) {
                return new bxvd(f146816d);
            }
            if (i2 == 5) {
                return f146816d;
            }
            bxxk bxxk = f146817e;
            if (bxxk == null) {
                synchronized (bsrz.class) {
                    bxxk = f146817e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146816d);
                        f146817e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
