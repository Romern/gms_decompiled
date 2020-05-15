package p000;

/* renamed from: baum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baum extends bxvk implements bxxd {

    /* renamed from: b */
    public static final baum f101784b;

    /* renamed from: d */
    private static volatile bxxk f101785d;

    /* renamed from: a */
    public String f101786a = "";

    /* renamed from: c */
    private int f101787c;

    static {
        baum baum = new baum();
        f101784b = baum;
        bxvk.m124024a(baum.class, baum);
    }

    private baum() {
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
            return bxvk.m124022a(f101784b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new baum();
        } else {
            if (i2 == 4) {
                return new bxvd(f101784b);
            }
            if (i2 == 5) {
                return f101784b;
            }
            bxxk bxxk = f101785d;
            if (bxxk == null) {
                synchronized (baum.class) {
                    bxxk = f101785d;
                    if (bxxk == null) {
                        bxxk = new bxve(f101784b);
                        f101785d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
