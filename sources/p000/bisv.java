package p000;

/* renamed from: bisv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisv extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bisv f121600h;

    /* renamed from: j */
    private static volatile bxxk f121601j;

    /* renamed from: a */
    public int f121602a;

    /* renamed from: b */
    public String f121603b = "";

    /* renamed from: c */
    public int f121604c = 1;

    /* renamed from: d */
    public int f121605d;

    /* renamed from: e */
    public bxtx f121606e = bxtx.f164797b;

    /* renamed from: f */
    public int f121607f;

    /* renamed from: g */
    public int f121608g;

    /* renamed from: i */
    private byte f121609i = 2;

    static {
        bisv bisv = new bisv();
        f121600h = bisv;
        bxvk.m124024a(bisv.class, bisv);
    }

    private bisv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121609i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121609i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121600h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", bist.f121599a, "d", bisr.f121598a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bisv();
        } else {
            if (i2 == 4) {
                return new bxvd(f121600h);
            }
            if (i2 == 5) {
                return f121600h;
            }
            bxxk bxxk = f121601j;
            if (bxxk == null) {
                synchronized (bisv.class) {
                    bxxk = f121601j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121600h);
                        f121601j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
