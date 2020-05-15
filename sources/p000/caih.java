package p000;

/* renamed from: caih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caih extends bxvk implements bxxd {

    /* renamed from: f */
    public static final caih f174693f;

    /* renamed from: g */
    private static volatile bxxk f174694g;

    /* renamed from: a */
    public int f174695a;

    /* renamed from: b */
    public String f174696b = "";

    /* renamed from: c */
    public String f174697c = "";

    /* renamed from: d */
    public String f174698d = "";

    /* renamed from: e */
    public String f174699e = "";

    static {
        caih caih = new caih();
        f174693f = caih;
        bxvk.m124024a(caih.class, caih);
    }

    private caih() {
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
            return bxvk.m124022a(f174693f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new caih();
        } else {
            if (i2 == 4) {
                return new bxvd(f174693f);
            }
            if (i2 == 5) {
                return f174693f;
            }
            bxxk bxxk = f174694g;
            if (bxxk == null) {
                synchronized (caih.class) {
                    bxxk = f174694g;
                    if (bxxk == null) {
                        bxxk = new bxve(f174693f);
                        f174694g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
