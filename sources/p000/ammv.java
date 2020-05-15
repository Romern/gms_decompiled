package p000;

/* renamed from: ammv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ammv f75396e;

    /* renamed from: f */
    private static volatile bxxk f75397f;

    /* renamed from: a */
    public int f75398a;

    /* renamed from: b */
    public int f75399b;

    /* renamed from: c */
    public ammt f75400c;

    /* renamed from: d */
    public ammu f75401d;

    static {
        ammv ammv = new ammv();
        f75396e = ammv;
        bxvk.m124024a(ammv.class, ammv);
    }

    private ammv() {
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
            return bxvk.m124022a(f75396e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", amiy.f74975a, "c", "d"});
        } else if (i2 == 3) {
            return new ammv();
        } else {
            if (i2 == 4) {
                return new bxvd(f75396e);
            }
            if (i2 == 5) {
                return f75396e;
            }
            bxxk bxxk = f75397f;
            if (bxxk == null) {
                synchronized (ammv.class) {
                    bxxk = f75397f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75396e);
                        f75397f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
