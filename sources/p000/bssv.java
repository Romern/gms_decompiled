package p000;

/* renamed from: bssv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bssv f146921b;

    /* renamed from: c */
    private static volatile bxxk f146922c;

    /* renamed from: a */
    public bxwc f146923a = bxxn.f165040b;

    static {
        bssv bssv = new bssv();
        f146921b = bssv;
        bxvk.m124024a(bssv.class, bssv);
    }

    private bssv() {
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
            return bxvk.m124022a(f146921b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bstf.class});
        } else if (i2 == 3) {
            return new bssv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f146921b;
            }
            bxxk bxxk = f146922c;
            if (bxxk == null) {
                synchronized (bssv.class) {
                    bxxk = f146922c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146921b);
                        f146922c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
