package p000;

/* renamed from: btkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btkp f149287b;

    /* renamed from: c */
    private static volatile bxxk f149288c;

    /* renamed from: a */
    public bxtx f149289a = bxtx.f164797b;

    static {
        btkp btkp = new btkp();
        f149287b = btkp;
        bxvk.m124024a(btkp.class, btkp);
    }

    private btkp() {
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
            return bxvk.m124022a(f149287b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f149287b);
            }
            if (i2 == 5) {
                return f149287b;
            }
            bxxk bxxk = f149288c;
            if (bxxk == null) {
                synchronized (btkp.class) {
                    bxxk = f149288c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149287b);
                        f149288c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
