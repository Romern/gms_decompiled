package p000;

/* renamed from: sgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final sgh f44177b;

    /* renamed from: c */
    private static volatile bxxk f44178c;

    /* renamed from: a */
    public bxwc f44179a = bxxn.f165040b;

    static {
        sgh sgh = new sgh();
        f44177b = sgh;
        bxvk.m124024a(sgh.class, sgh);
    }

    private sgh() {
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
            return bxvk.m124022a(f44177b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", sgl.class});
        } else if (i2 == 3) {
            return new sgh();
        } else {
            if (i2 == 4) {
                return new bxvd(f44177b);
            }
            if (i2 == 5) {
                return f44177b;
            }
            bxxk bxxk = f44178c;
            if (bxxk == null) {
                synchronized (sgh.class) {
                    bxxk = f44178c;
                    if (bxxk == null) {
                        bxxk = new bxve(f44177b);
                        f44178c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
