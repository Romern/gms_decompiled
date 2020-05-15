package p000;

/* renamed from: bxty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxty extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxty f164799b;

    /* renamed from: c */
    private static volatile bxxk f164800c;

    /* renamed from: a */
    public bxtx f164801a = bxtx.f164797b;

    static {
        bxty bxty = new bxty();
        f164799b = bxty;
        bxvk.m124024a(bxty.class, bxty);
    }

    private bxty() {
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
            return bxvk.m124022a(f164799b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxty();
        } else {
            if (i2 == 4) {
                return new bxvd(f164799b);
            }
            if (i2 == 5) {
                return f164799b;
            }
            bxxk bxxk = f164800c;
            if (bxxk == null) {
                synchronized (bxty.class) {
                    bxxk = f164800c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164799b);
                        f164800c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
