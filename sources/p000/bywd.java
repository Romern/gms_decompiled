package p000;

/* renamed from: bywd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bywd f168555d;

    /* renamed from: e */
    private static volatile bxxk f168556e;

    /* renamed from: a */
    public int f168557a;

    /* renamed from: b */
    public bywz f168558b;

    /* renamed from: c */
    public bxwc f168559c = bxxn.f165040b;

    static {
        bywd bywd = new bywd();
        f168555d = bywd;
        bxvk.m124024a(bywd.class, bywd);
    }

    private bywd() {
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
            return bxvk.m124022a(f168555d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bywd();
        } else {
            if (i2 == 4) {
                return new bywc();
            }
            if (i2 == 5) {
                return f168555d;
            }
            bxxk bxxk = f168556e;
            if (bxxk == null) {
                synchronized (bywd.class) {
                    bxxk = f168556e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168555d);
                        f168556e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
