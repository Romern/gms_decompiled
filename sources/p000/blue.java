package p000;

/* renamed from: blue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blue extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blue f127791c;

    /* renamed from: d */
    private static volatile bxxk f127792d;

    /* renamed from: a */
    public int f127793a;

    /* renamed from: b */
    public String f127794b = "";

    static {
        blue blue = new blue();
        f127791c = blue;
        bxvk.m124024a(blue.class, blue);
    }

    private blue() {
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
            return bxvk.m124022a(f127791c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blue();
        } else {
            if (i2 == 4) {
                return new bxvd(f127791c);
            }
            if (i2 == 5) {
                return f127791c;
            }
            bxxk bxxk = f127792d;
            if (bxxk == null) {
                synchronized (blue.class) {
                    bxxk = f127792d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127791c);
                        f127792d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
