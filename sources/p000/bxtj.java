package p000;

/* renamed from: bxtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxtj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxtj f164776b;

    /* renamed from: c */
    private static volatile bxxk f164777c;

    /* renamed from: a */
    public boolean f164778a;

    static {
        bxtj bxtj = new bxtj();
        f164776b = bxtj;
        bxvk.m124024a(bxtj.class, bxtj);
    }

    private bxtj() {
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
            return bxvk.m124022a(f164776b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxtj();
        } else {
            if (i2 == 4) {
                return new bxvd(f164776b);
            }
            if (i2 == 5) {
                return f164776b;
            }
            bxxk bxxk = f164777c;
            if (bxxk == null) {
                synchronized (bxtj.class) {
                    bxxk = f164777c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164776b);
                        f164777c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
