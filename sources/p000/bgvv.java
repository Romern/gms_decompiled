package p000;

/* renamed from: bgvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bgvv f117752d;

    /* renamed from: e */
    private static volatile bxxk f117753e;

    /* renamed from: a */
    public int f117754a;

    /* renamed from: b */
    public bxwc f117755b = bxxn.f165040b;

    /* renamed from: c */
    public bgvk f117756c;

    static {
        bgvv bgvv = new bgvv();
        f117752d = bgvv;
        bxvk.m124024a(bgvv.class, bgvv);
    }

    private bgvv() {
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
            return bxvk.m124022a(f117752d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", bgvg.class, "c"});
        } else if (i2 == 3) {
            return new bgvv();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f117752d;
            }
            bxxk bxxk = f117753e;
            if (bxxk == null) {
                synchronized (bgvv.class) {
                    bxxk = f117753e;
                    if (bxxk == null) {
                        bxxk = new bxve(f117752d);
                        f117753e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
