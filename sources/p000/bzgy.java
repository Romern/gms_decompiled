package p000;

/* renamed from: bzgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzgy f170003b;

    /* renamed from: d */
    private static volatile bxxk f170004d;

    /* renamed from: a */
    public String f170005a = "";

    /* renamed from: c */
    private int f170006c;

    static {
        bzgy bzgy = new bzgy();
        f170003b = bzgy;
        bxvk.m124024a(bzgy.class, bzgy);
    }

    private bzgy() {
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
            return bxvk.m124022a(f170003b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzgy();
        } else {
            if (i2 == 4) {
                return new bxvd(f170003b);
            }
            if (i2 == 5) {
                return f170003b;
            }
            bxxk bxxk = f170004d;
            if (bxxk == null) {
                synchronized (bzgy.class) {
                    bxxk = f170004d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170003b);
                        f170004d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
