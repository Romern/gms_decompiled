package p000;

/* renamed from: bywa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bywa f168547c;

    /* renamed from: d */
    private static volatile bxxk f168548d;

    /* renamed from: a */
    public int f168549a;

    /* renamed from: b */
    public bywz f168550b;

    static {
        bywa bywa = new bywa();
        f168547c = bywa;
        bxvk.m124024a(bywa.class, bywa);
    }

    private bywa() {
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
            return bxvk.m124022a(f168547c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bywa();
        } else {
            if (i2 == 4) {
                return new bxvd(f168547c);
            }
            if (i2 == 5) {
                return f168547c;
            }
            bxxk bxxk = f168548d;
            if (bxxk == null) {
                synchronized (bywa.class) {
                    bxxk = f168548d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168547c);
                        f168548d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
