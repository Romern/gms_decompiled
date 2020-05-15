package p000;

/* renamed from: buuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buuc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bxvu f154921g = new butz();

    /* renamed from: j */
    public static final buuc f154922j;

    /* renamed from: k */
    private static volatile bxxk f154923k;

    /* renamed from: a */
    public int f154924a;

    /* renamed from: b */
    public String f154925b = "";

    /* renamed from: c */
    public String f154926c = "";

    /* renamed from: d */
    public bxtx f154927d = bxtx.f164797b;

    /* renamed from: e */
    public int f154928e;

    /* renamed from: f */
    public bxvt f154929f = bxvm.f164965b;

    /* renamed from: h */
    public bxtx f154930h = bxtx.f164797b;

    /* renamed from: i */
    public buug f154931i;

    static {
        buuc buuc = new buuc();
        f154922j = buuc;
        bxvk.m124024a(buuc.class, buuc);
    }

    private buuc() {
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
            return bxvk.m124022a(f154922j, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004င\u0003\u0005\u001e\u0006ည\u0004\u0007ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", buub.m120452b(), "h", "i"});
        } else if (i2 == 3) {
            return new buuc();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f154922j;
            }
            bxxk bxxk = f154923k;
            if (bxxk == null) {
                synchronized (buuc.class) {
                    bxxk = f154923k;
                    if (bxxk == null) {
                        bxxk = new bxve(f154922j);
                        f154923k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
