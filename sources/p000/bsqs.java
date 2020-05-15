package p000;

/* renamed from: bsqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsqs f146679c;

    /* renamed from: d */
    private static volatile bxxk f146680d;

    /* renamed from: a */
    public int f146681a;

    /* renamed from: b */
    public int f146682b;

    static {
        bsqs bsqs = new bsqs();
        f146679c = bsqs;
        bxvk.m124024a(bsqs.class, bsqs);
    }

    private bsqs() {
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
            return bxvk.m124022a(f146679c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bsqr.f146678a});
        } else if (i2 == 3) {
            return new bsqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f146679c);
            }
            if (i2 == 5) {
                return f146679c;
            }
            bxxk bxxk = f146680d;
            if (bxxk == null) {
                synchronized (bsqs.class) {
                    bxxk = f146680d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146679c);
                        f146680d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
