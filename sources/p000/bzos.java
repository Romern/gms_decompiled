package p000;

/* renamed from: bzos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzos extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzos f170860b;

    /* renamed from: c */
    private static volatile bxxk f170861c;

    /* renamed from: a */
    public int f170862a;

    static {
        bzos bzos = new bzos();
        f170860b = bzos;
        bxvk.m124024a(bzos.class, bzos);
    }

    private bzos() {
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
            return bxvk.m124022a(f170860b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzos();
        } else {
            if (i2 == 4) {
                return new bxvd(f170860b);
            }
            if (i2 == 5) {
                return f170860b;
            }
            bxxk bxxk = f170861c;
            if (bxxk == null) {
                synchronized (bzos.class) {
                    bxxk = f170861c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170860b);
                        f170861c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
