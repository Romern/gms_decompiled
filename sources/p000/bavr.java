package p000;

/* renamed from: bavr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavr extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bavr f101916f;

    /* renamed from: g */
    private static volatile bxxk f101917g;

    /* renamed from: a */
    public int f101918a;

    /* renamed from: b */
    public String f101919b = "";

    /* renamed from: c */
    public String f101920c = "";

    /* renamed from: d */
    public String f101921d = "";

    /* renamed from: e */
    public boolean f101922e;

    static {
        bavr bavr = new bavr();
        f101916f = bavr;
        bxvk.m124024a(bavr.class, bavr);
    }

    private bavr() {
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
            return bxvk.m124022a(f101916f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဈ\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bavr();
        } else {
            if (i2 == 4) {
                return new bxvd(f101916f);
            }
            if (i2 == 5) {
                return f101916f;
            }
            bxxk bxxk = f101917g;
            if (bxxk == null) {
                synchronized (bavr.class) {
                    bxxk = f101917g;
                    if (bxxk == null) {
                        bxxk = new bxve(f101916f);
                        f101917g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
