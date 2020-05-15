package p000;

/* renamed from: iey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iey extends bxvk implements bxxd {

    /* renamed from: b */
    public static final iey f20835b;

    /* renamed from: c */
    private static volatile bxxk f20836c;

    /* renamed from: a */
    public bxww f20837a = bxww.f165013b;

    static {
        iey iey = new iey();
        f20835b = iey;
        bxvk.m124024a(iey.class, iey);
    }

    private iey() {
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
            return bxvk.m124022a(f20835b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", iex.f20834a});
        } else if (i2 == 3) {
            return new iey();
        } else {
            if (i2 == 4) {
                return new bxvd(f20835b);
            }
            if (i2 == 5) {
                return f20835b;
            }
            bxxk bxxk = f20836c;
            if (bxxk == null) {
                synchronized (iey.class) {
                    bxxk = f20836c;
                    if (bxxk == null) {
                        bxxk = new bxve(f20835b);
                        f20836c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
