package p000;

/* renamed from: sxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final sxj f45362c;

    /* renamed from: e */
    private static volatile bxxk f45363e;

    /* renamed from: a */
    public String f45364a = "";

    /* renamed from: b */
    public bxtx f45365b = bxtx.f164797b;

    /* renamed from: d */
    private int f45366d;

    static {
        sxj sxj = new sxj();
        f45362c = sxj;
        bxvk.m124024a(sxj.class, sxj);
    }

    private sxj() {
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
            return bxvk.m124022a(f45362c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new sxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f45362c);
            }
            if (i2 == 5) {
                return f45362c;
            }
            bxxk bxxk = f45363e;
            if (bxxk == null) {
                synchronized (sxj.class) {
                    bxxk = f45363e;
                    if (bxxk == null) {
                        bxxk = new bxve(f45362c);
                        f45363e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
