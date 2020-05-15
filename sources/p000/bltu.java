package p000;

/* renamed from: bltu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bltu f127741d;

    /* renamed from: e */
    private static volatile bxxk f127742e;

    /* renamed from: a */
    public int f127743a;

    /* renamed from: b */
    public String f127744b = "";

    /* renamed from: c */
    public String f127745c = "";

    static {
        bltu bltu = new bltu();
        f127741d = bltu;
        bxvk.m124024a(bltu.class, bltu);
    }

    private bltu() {
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
            return bxvk.m124022a(f127741d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bltu();
        } else {
            if (i2 == 4) {
                return new bxvd(f127741d);
            }
            if (i2 == 5) {
                return f127741d;
            }
            bxxk bxxk = f127742e;
            if (bxxk == null) {
                synchronized (bltu.class) {
                    bxxk = f127742e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127741d);
                        f127742e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
