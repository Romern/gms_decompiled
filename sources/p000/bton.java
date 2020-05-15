package p000;

/* renamed from: bton */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bton extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bton f149778b;

    /* renamed from: c */
    private static volatile bxxk f149779c;

    /* renamed from: a */
    public int f149780a;

    static {
        bton bton = new bton();
        f149778b = bton;
        bxvk.m124024a(bton.class, bton);
    }

    private bton() {
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
            return bxvk.m124022a(f149778b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bton();
        } else {
            if (i2 == 4) {
                return new bxvd(f149778b);
            }
            if (i2 == 5) {
                return f149778b;
            }
            bxxk bxxk = f149779c;
            if (bxxk == null) {
                synchronized (bton.class) {
                    bxxk = f149779c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149778b);
                        f149779c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
