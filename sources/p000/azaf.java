package p000;

/* renamed from: azaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azaf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final azaf f98826b;

    /* renamed from: d */
    private static volatile bxxk f98827d;

    /* renamed from: a */
    public String f98828a = "";

    /* renamed from: c */
    private int f98829c;

    static {
        azaf azaf = new azaf();
        f98826b = azaf;
        bxvk.m124024a(azaf.class, azaf);
    }

    private azaf() {
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
            return bxvk.m124022a(f98826b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new azaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f98826b);
            }
            if (i2 == 5) {
                return f98826b;
            }
            bxxk bxxk = f98827d;
            if (bxxk == null) {
                synchronized (azaf.class) {
                    bxxk = f98827d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98826b);
                        f98827d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
