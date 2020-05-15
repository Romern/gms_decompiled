package p000;

/* renamed from: abdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abdy f57154d;

    /* renamed from: e */
    private static volatile bxxk f57155e;

    /* renamed from: a */
    public int f57156a;

    /* renamed from: b */
    public String f57157b = "";

    /* renamed from: c */
    public int f57158c;

    static {
        abdy abdy = new abdy();
        f57154d = abdy;
        bxvk.m124024a(abdy.class, abdy);
    }

    private abdy() {
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
            return bxvk.m124022a(f57154d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", abdx.m47562b()});
        } else if (i2 == 3) {
            return new abdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f57154d);
            }
            if (i2 == 5) {
                return f57154d;
            }
            bxxk bxxk = f57155e;
            if (bxxk == null) {
                synchronized (abdy.class) {
                    bxxk = f57155e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57154d);
                        f57155e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
