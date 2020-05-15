package p000;

/* renamed from: bavt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavt extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bavt f101927g;

    /* renamed from: h */
    private static volatile bxxk f101928h;

    /* renamed from: a */
    public int f101929a;

    /* renamed from: b */
    public String f101930b = "";

    /* renamed from: c */
    public int f101931c;

    /* renamed from: d */
    public String f101932d = "";

    /* renamed from: e */
    public int f101933e;

    /* renamed from: f */
    public bzny f101934f;

    static {
        bavt bavt = new bavt();
        f101927g = bavt;
        bxvk.m124024a(bavt.class, bavt);
    }

    private bavt() {
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
            return bxvk.m124022a(f101927g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", bava.f101868a, "f"});
        } else if (i2 == 3) {
            return new bavt();
        } else {
            if (i2 == 4) {
                return new bxvd(f101927g);
            }
            if (i2 == 5) {
                return f101927g;
            }
            bxxk bxxk = f101928h;
            if (bxxk == null) {
                synchronized (bavt.class) {
                    bxxk = f101928h;
                    if (bxxk == null) {
                        bxxk = new bxve(f101927g);
                        f101928h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
