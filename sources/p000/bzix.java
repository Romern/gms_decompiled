package p000;

/* renamed from: bzix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzix extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzix f170252c;

    /* renamed from: d */
    private static volatile bxxk f170253d;

    /* renamed from: a */
    public int f170254a;

    /* renamed from: b */
    public bxtx f170255b = bxtx.f164797b;

    static {
        bzix bzix = new bzix();
        f170252c = bzix;
        bxvk.m124024a(bzix.class, bzix);
    }

    private bzix() {
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
            return bxvk.m124022a(f170252c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzix();
        } else {
            if (i2 == 4) {
                return new bxvd(f170252c);
            }
            if (i2 == 5) {
                return f170252c;
            }
            bxxk bxxk = f170253d;
            if (bxxk == null) {
                synchronized (bzix.class) {
                    bxxk = f170253d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170252c);
                        f170253d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
