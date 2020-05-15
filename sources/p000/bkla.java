package p000;

/* renamed from: bkla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkla extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bkla f124682c;

    /* renamed from: d */
    private static volatile bxxk f124683d;

    /* renamed from: a */
    public int f124684a = 0;

    /* renamed from: b */
    public Object f124685b;

    static {
        bkla bkla = new bkla();
        f124682c = bkla;
        bxvk.m124024a(bkla.class, bkla);
    }

    private bkla() {
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
            return bxvk.m124022a(f124682c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", bybw.class});
        } else if (i2 == 3) {
            return new bkla();
        } else {
            if (i2 == 4) {
                return new bxvd(f124682c);
            }
            if (i2 == 5) {
                return f124682c;
            }
            bxxk bxxk = f124683d;
            if (bxxk == null) {
                synchronized (bkla.class) {
                    bxxk = f124683d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124682c);
                        f124683d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
