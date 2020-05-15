package p000;

/* renamed from: bzxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxo extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bzxo f171782h;

    /* renamed from: j */
    private static volatile bxxk f171783j;

    /* renamed from: a */
    public String f171784a = "";

    /* renamed from: b */
    public String f171785b = "";

    /* renamed from: c */
    public boolean f171786c;

    /* renamed from: d */
    public boolean f171787d;

    /* renamed from: e */
    public String f171788e = "";

    /* renamed from: f */
    public String f171789f = "";

    /* renamed from: g */
    public String f171790g = "";

    /* renamed from: i */
    private int f171791i;

    static {
        bzxo bzxo = new bzxo();
        f171782h = bzxo;
        bxvk.m124024a(bzxo.class, bzxo);
    }

    private bzxo() {
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
            return bxvk.m124022a(f171782h, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f171782h);
            }
            if (i2 == 5) {
                return f171782h;
            }
            bxxk bxxk = f171783j;
            if (bxxk == null) {
                synchronized (bzxo.class) {
                    bxxk = f171783j;
                    if (bxxk == null) {
                        bxxk = new bxve(f171782h);
                        f171783j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
