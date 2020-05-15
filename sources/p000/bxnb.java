package p000;

/* renamed from: bxnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxnb f164005c;

    /* renamed from: d */
    public static final bxvj f164006d;

    /* renamed from: e */
    private static volatile bxxk f164007e;

    /* renamed from: a */
    public int f164008a;

    /* renamed from: b */
    public int f164009b;

    static {
        bxnb bxnb = new bxnb();
        f164005c = bxnb;
        bxvk.m124024a(bxnb.class, bxnb);
        bxcf bxcf = bxcf.f162779a;
        bxnb bxnb2 = f164005c;
        f164006d = bxvk.m124006a(bxcf, bxnb2, bxnb2, 198117910, bxzf.MESSAGE);
    }

    private bxnb() {
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
            return bxvk.m124022a(f164005c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxna.f164004a});
        } else if (i2 == 3) {
            return new bxnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f164005c);
            }
            if (i2 == 5) {
                return f164005c;
            }
            bxxk bxxk = f164007e;
            if (bxxk == null) {
                synchronized (bxnb.class) {
                    bxxk = f164007e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164005c);
                        f164007e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
