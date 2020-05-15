package p000;

/* renamed from: byfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byfy f166081b;

    /* renamed from: c */
    private static volatile bxxk f166082c;

    /* renamed from: a */
    public bxww f166083a = bxww.f165013b;

    static {
        byfy byfy = new byfy();
        f166081b = byfy;
        bxvk.m124024a(byfy.class, byfy);
    }

    private byfy() {
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
            return bxvk.m124022a(f166081b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", byfx.f166080a});
        } else if (i2 == 3) {
            return new byfy();
        } else {
            if (i2 == 4) {
                return new bxvd(f166081b);
            }
            if (i2 == 5) {
                return f166081b;
            }
            bxxk bxxk = f166082c;
            if (bxxk == null) {
                synchronized (byfy.class) {
                    bxxk = f166082c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166081b);
                        f166082c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
