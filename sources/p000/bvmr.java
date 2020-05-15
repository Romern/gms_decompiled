package p000;

/* renamed from: bvmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvmr f156779b;

    /* renamed from: c */
    private static volatile bxxk f156780c;

    /* renamed from: a */
    public bxwc f156781a = bxxn.f165040b;

    static {
        bvmr bvmr = new bvmr();
        f156779b = bvmr;
        bxvk.m124024a(bvmr.class, bvmr);
    }

    private bvmr() {
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
            return bxvk.m124022a(f156779b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvmp.class});
        } else if (i2 == 3) {
            return new bvmr();
        } else {
            if (i2 == 4) {
                return new bxvd(f156779b);
            }
            if (i2 == 5) {
                return f156779b;
            }
            bxxk bxxk = f156780c;
            if (bxxk == null) {
                synchronized (bvmr.class) {
                    bxxk = f156780c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156779b);
                        f156780c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
