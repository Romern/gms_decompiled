package p000;

/* renamed from: bziu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bziu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bziu f170240b;

    /* renamed from: d */
    private static volatile bxxk f170241d;

    /* renamed from: a */
    public String f170242a = "";

    /* renamed from: c */
    private int f170243c;

    static {
        bziu bziu = new bziu();
        f170240b = bziu;
        bxvk.m124024a(bziu.class, bziu);
    }

    private bziu() {
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
            return bxvk.m124022a(f170240b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bziu();
        } else {
            if (i2 == 4) {
                return new bxvd(f170240b);
            }
            if (i2 == 5) {
                return f170240b;
            }
            bxxk bxxk = f170241d;
            if (bxxk == null) {
                synchronized (bziu.class) {
                    bxxk = f170241d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170240b);
                        f170241d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
