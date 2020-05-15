package p000;

/* renamed from: caax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caax extends bxvk implements bxxd {

    /* renamed from: b */
    public static final caax f172389b;

    /* renamed from: d */
    private static volatile bxxk f172390d;

    /* renamed from: a */
    public boolean f172391a;

    /* renamed from: c */
    private int f172392c;

    static {
        caax caax = new caax();
        f172389b = caax;
        bxvk.m124024a(caax.class, caax);
    }

    private caax() {
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
            return bxvk.m124022a(f172389b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new caax();
        } else {
            if (i2 == 4) {
                return new bxvd(f172389b);
            }
            if (i2 == 5) {
                return f172389b;
            }
            bxxk bxxk = f172390d;
            if (bxxk == null) {
                synchronized (caax.class) {
                    bxxk = f172390d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172389b);
                        f172390d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
