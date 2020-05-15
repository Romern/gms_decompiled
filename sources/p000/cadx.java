package p000;

/* renamed from: cadx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadx extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cadx f172757h;

    /* renamed from: j */
    private static volatile bxxk f172758j;

    /* renamed from: a */
    public int f172759a;

    /* renamed from: b */
    public String f172760b = "";

    /* renamed from: c */
    public String f172761c = "";

    /* renamed from: d */
    public String f172762d = "";

    /* renamed from: e */
    public boolean f172763e;

    /* renamed from: f */
    public String f172764f = "";

    /* renamed from: g */
    public bxvt f172765g = bxvm.f164965b;

    /* renamed from: i */
    private byte f172766i = 2;

    static {
        cadx cadx = new cadx();
        f172757h = cadx;
        GeneratedMessageLite.m124024a(cadx.class, cadx);
    }

    private cadx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172766i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172766i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172757h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဈ\u0004\u0007\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cadx();
        } else {
            if (i2 == 4) {
                return new bxvd(f172757h);
            }
            if (i2 == 5) {
                return f172757h;
            }
            bxxk bxxk = f172758j;
            if (bxxk == null) {
                synchronized (cadx.class) {
                    bxxk = f172758j;
                    if (bxxk == null) {
                        bxxk = new bxve(f172757h);
                        f172758j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
