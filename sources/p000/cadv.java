package p000;

/* renamed from: cadv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cadv f172745b;

    /* renamed from: c */
    private static volatile bxxk f172746c;

    /* renamed from: a */
    public bxwc f172747a = bxxn.f165040b;

    static {
        cadv cadv = new cadv();
        f172745b = cadv;
        bxvk.m124024a(cadv.class, cadv);
    }

    private cadv() {
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
            return bxvk.m124022a(f172745b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", caaa.class});
        } else if (i2 == 3) {
            return new cadv();
        } else {
            if (i2 == 4) {
                return new bxvd(f172745b);
            }
            if (i2 == 5) {
                return f172745b;
            }
            bxxk bxxk = f172746c;
            if (bxxk == null) {
                synchronized (cadv.class) {
                    bxxk = f172746c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172745b);
                        f172746c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
