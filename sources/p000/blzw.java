package p000;

/* renamed from: blzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzw extends bxvk implements bxxd {

    /* renamed from: k */
    public static final blzw f128403k;

    /* renamed from: l */
    private static volatile bxxk f128404l;

    /* renamed from: a */
    public int f128405a;

    /* renamed from: b */
    public blzk f128406b;

    /* renamed from: c */
    public blzu f128407c;

    /* renamed from: d */
    public blzr f128408d;

    /* renamed from: e */
    public blzx f128409e;

    /* renamed from: f */
    public boolean f128410f;

    /* renamed from: g */
    public String f128411g = "";

    /* renamed from: h */
    public bxtx f128412h = bxtx.f164797b;

    /* renamed from: i */
    public String f128413i = "";

    /* renamed from: j */
    public bxwc f128414j = bxxn.f165040b;

    static {
        blzw blzw = new blzw();
        f128403k = blzw;
        bxvk.m124024a(blzw.class, blzw);
    }

    private blzw() {
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
            return bxvk.m124022a(f128403k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဇ\u0004\u0005ဉ\u0000\u0006ဈ\u0005\u0007ည\u0006\bဈ\u0007\t\u001b", new Object[]{"a", "c", "d", "e", "f", "b", "g", "h", "i", "j", blzv.class});
        } else if (i2 == 3) {
            return new blzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f128403k);
            }
            if (i2 == 5) {
                return f128403k;
            }
            bxxk bxxk = f128404l;
            if (bxxk == null) {
                synchronized (blzw.class) {
                    bxxk = f128404l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128403k);
                        f128404l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
