package p000;

/* renamed from: bzny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzny extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzny f170777b;

    /* renamed from: c */
    private static volatile bxxk f170778c;

    /* renamed from: a */
    public bxwc f170779a = bxxn.f165040b;

    static {
        bzny bzny = new bzny();
        f170777b = bzny;
        bxvk.m124024a(bzny.class, bzny);
    }

    private bzny() {
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
            return bxvk.m124022a(f170777b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bznx.class});
        } else if (i2 == 3) {
            return new bzny();
        } else {
            if (i2 == 4) {
                return new bxvd(f170777b);
            }
            if (i2 == 5) {
                return f170777b;
            }
            bxxk bxxk = f170778c;
            if (bxxk == null) {
                synchronized (bzny.class) {
                    bxxk = f170778c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170777b);
                        f170778c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
