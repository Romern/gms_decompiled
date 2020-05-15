package p000;

/* renamed from: aydt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydt extends bxvk implements bxxd {

    /* renamed from: g */
    public static final aydt f97252g;

    /* renamed from: h */
    private static volatile bxxk f97253h;

    /* renamed from: a */
    public int f97254a;

    /* renamed from: b */
    public String f97255b = "";

    /* renamed from: c */
    public String f97256c = "";

    /* renamed from: d */
    public String f97257d = "";

    /* renamed from: e */
    public long f97258e;

    /* renamed from: f */
    public boolean f97259f;

    static {
        aydt aydt = new aydt();
        f97252g = aydt;
        bxvk.m124024a(aydt.class, aydt);
    }

    private aydt() {
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
            return bxvk.m124022a(f97252g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004စ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aydt();
        } else {
            if (i2 == 4) {
                return new bxvd(f97252g);
            }
            if (i2 == 5) {
                return f97252g;
            }
            bxxk bxxk = f97253h;
            if (bxxk == null) {
                synchronized (aydt.class) {
                    bxxk = f97253h;
                    if (bxxk == null) {
                        bxxk = new bxve(f97252g);
                        f97253h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
