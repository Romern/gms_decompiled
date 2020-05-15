package p000;

/* renamed from: bxpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxpi f164270c;

    /* renamed from: d */
    private static volatile bxxk f164271d;

    /* renamed from: a */
    public int f164272a = 0;

    /* renamed from: b */
    public Object f164273b;

    static {
        bxpi bxpi = new bxpi();
        f164270c = bxpi;
        bxvk.m124024a(bxpi.class, bxpi);
    }

    private bxpi() {
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
            return bxvk.m124022a(f164270c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bxuo.class, bxph.class});
        } else if (i2 == 3) {
            return new bxpi();
        } else {
            if (i2 == 4) {
                return new bxvd(f164270c);
            }
            if (i2 == 5) {
                return f164270c;
            }
            bxxk bxxk = f164271d;
            if (bxxk == null) {
                synchronized (bxpi.class) {
                    bxxk = f164271d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164270c);
                        f164271d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
