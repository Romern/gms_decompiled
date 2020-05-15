package p000;

/* renamed from: amlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final amlo f75197d;

    /* renamed from: e */
    private static volatile bxxk f75198e;

    /* renamed from: a */
    public int f75199a;

    /* renamed from: b */
    public int f75200b;

    /* renamed from: c */
    public boolean f75201c;

    static {
        amlo amlo = new amlo();
        f75197d = amlo;
        bxvk.m124024a(amlo.class, amlo);
    }

    private amlo() {
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
            return bxvk.m124022a(f75197d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new amlo();
        } else {
            if (i2 == 4) {
                return new bxvd(f75197d);
            }
            if (i2 == 5) {
                return f75197d;
            }
            bxxk bxxk = f75198e;
            if (bxxk == null) {
                synchronized (amlo.class) {
                    bxxk = f75198e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75197d);
                        f75198e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
