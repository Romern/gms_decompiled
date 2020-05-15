package p000;

/* renamed from: byig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byig extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byig f166561b;

    /* renamed from: c */
    private static volatile bxxk f166562c;

    /* renamed from: a */
    public bxwc f166563a = bxxn.f165040b;

    static {
        byig byig = new byig();
        f166561b = byig;
        bxvk.m124024a(byig.class, byig);
    }

    private byig() {
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
            return bxvk.m124022a(f166561b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", byir.class});
        } else if (i2 == 3) {
            return new byig();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f166561b;
            }
            bxxk bxxk = f166562c;
            if (bxxk == null) {
                synchronized (byig.class) {
                    bxxk = f166562c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166561b);
                        f166562c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
