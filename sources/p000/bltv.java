package p000;

/* renamed from: bltv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bltv f127746f;

    /* renamed from: g */
    private static volatile bxxk f127747g;

    /* renamed from: a */
    public int f127748a;

    /* renamed from: b */
    public String f127749b = "";

    /* renamed from: c */
    public String f127750c = "";

    /* renamed from: d */
    public String f127751d = "";

    /* renamed from: e */
    public String f127752e = "";

    static {
        bltv bltv = new bltv();
        f127746f = bltv;
        bxvk.m124024a(bltv.class, bltv);
    }

    private bltv() {
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
            return bxvk.m124022a(f127746f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bltv();
        } else {
            if (i2 == 4) {
                return new bxvd(f127746f);
            }
            if (i2 == 5) {
                return f127746f;
            }
            bxxk bxxk = f127747g;
            if (bxxk == null) {
                synchronized (bltv.class) {
                    bxxk = f127747g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127746f);
                        f127747g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
