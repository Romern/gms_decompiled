package p000;

/* renamed from: bxrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bxrz f164639h;

    /* renamed from: i */
    private static volatile bxxk f164640i;

    /* renamed from: a */
    public int f164641a;

    /* renamed from: b */
    public bxre f164642b;

    /* renamed from: c */
    public String f164643c = "";

    /* renamed from: d */
    public boolean f164644d;

    /* renamed from: e */
    public bxvt f164645e = bxvm.f164965b;

    /* renamed from: f */
    public bxss f164646f;

    /* renamed from: g */
    public bxwc f164647g = bxxn.f165040b;

    static {
        bxrz bxrz = new bxrz();
        f164639h = bxrz;
        bxvk.m124024a(bxrz.class, bxrz);
    }

    private bxrz() {
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
            return bxvk.m124022a(f164639h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002ဇ\u0002\u0003ဉ\u0000\u0004ဉ\u0003\u0005ဈ\u0001\u0006\u001b", new Object[]{"a", "e", "d", "b", "f", "c", "g", bxrq.class});
        } else if (i2 == 3) {
            return new bxrz();
        } else {
            if (i2 == 4) {
                return new bxry();
            }
            if (i2 == 5) {
                return f164639h;
            }
            bxxk bxxk = f164640i;
            if (bxxk == null) {
                synchronized (bxrz.class) {
                    bxxk = f164640i;
                    if (bxxk == null) {
                        bxxk = new bxve(f164639h);
                        f164640i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
