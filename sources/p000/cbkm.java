package p000;

/* renamed from: cbkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbkm f177424b;

    /* renamed from: c */
    private static volatile bxxk f177425c;

    /* renamed from: a */
    public cbmo f177426a;

    static {
        cbkm cbkm = new cbkm();
        f177424b = cbkm;
        bxvk.m124024a(cbkm.class, cbkm);
    }

    private cbkm() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f177424b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbkm();
        } else {
            if (i2 == 4) {
                return new bxvd(f177424b);
            }
            if (i2 == 5) {
                return f177424b;
            }
            bxxk bxxk = f177425c;
            if (bxxk == null) {
                synchronized (cbkm.class) {
                    bxxk = f177425c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177424b);
                        f177425c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
