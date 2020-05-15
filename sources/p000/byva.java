package p000;

/* renamed from: byva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byva extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byva f168407b;

    /* renamed from: c */
    private static volatile bxxk f168408c;

    /* renamed from: a */
    public bxwc f168409a = bxxn.f165040b;

    static {
        byva byva = new byva();
        f168407b = byva;
        bxvk.m124024a(byva.class, byva);
    }

    private byva() {
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
            return bxvk.m124022a(f168407b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byzy.class});
        } else if (i2 == 3) {
            return new byva();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f168407b;
            }
            bxxk bxxk = f168408c;
            if (bxxk == null) {
                synchronized (byva.class) {
                    bxxk = f168408c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168407b);
                        f168408c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
