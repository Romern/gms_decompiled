package p000;

/* renamed from: blcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blcw f125993b;

    /* renamed from: d */
    private static volatile bxxk f125994d;

    /* renamed from: a */
    public String f125995a = "";

    /* renamed from: c */
    private int f125996c;

    static {
        blcw blcw = new blcw();
        f125993b = blcw;
        bxvk.m124024a(blcw.class, blcw);
    }

    private blcw() {
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
            return bxvk.m124022a(f125993b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f125993b);
            }
            if (i2 == 5) {
                return f125993b;
            }
            bxxk bxxk = f125994d;
            if (bxxk == null) {
                synchronized (blcw.class) {
                    bxxk = f125994d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125993b);
                        f125994d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
