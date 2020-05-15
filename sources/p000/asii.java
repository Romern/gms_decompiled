package p000;

/* renamed from: asii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asii extends bxvk implements bxxd {

    /* renamed from: c */
    public static final asii f89035c;

    /* renamed from: d */
    private static volatile bxxk f89036d;

    /* renamed from: a */
    public int f89037a;

    /* renamed from: b */
    public int f89038b;

    static {
        asii asii = new asii();
        f89035c = asii;
        bxvk.m124024a(asii.class, asii);
    }

    private asii() {
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
            return bxvk.m124022a(f89035c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new asii();
        } else {
            if (i2 == 4) {
                return new bxvd(f89035c);
            }
            if (i2 == 5) {
                return f89035c;
            }
            bxxk bxxk = f89036d;
            if (bxxk == null) {
                synchronized (asii.class) {
                    bxxk = f89036d;
                    if (bxxk == null) {
                        bxxk = new bxve(f89035c);
                        f89036d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
