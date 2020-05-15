package p000;

/* renamed from: breb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class breb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final breb f142583d;

    /* renamed from: f */
    private static volatile bxxk f142584f;

    /* renamed from: a */
    public String f142585a = "";

    /* renamed from: b */
    public String f142586b = "";

    /* renamed from: c */
    public String f142587c = "";

    /* renamed from: e */
    private int f142588e;

    static {
        breb breb = new breb();
        f142583d = breb;
        bxvk.m124024a(breb.class, breb);
    }

    private breb() {
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
            return bxvk.m124022a(f142583d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new breb();
        } else {
            if (i2 == 4) {
                return new bxvd(f142583d);
            }
            if (i2 == 5) {
                return f142583d;
            }
            bxxk bxxk = f142584f;
            if (bxxk == null) {
                synchronized (breb.class) {
                    bxxk = f142584f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142583d);
                        f142584f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
