package p000;

/* renamed from: apzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzx extends bxvk implements bxxd {

    /* renamed from: m */
    public static final apzx f85326m;

    /* renamed from: n */
    private static volatile bxxk f85327n;

    /* renamed from: a */
    public int f85328a;

    /* renamed from: b */
    public String f85329b = "";

    /* renamed from: c */
    public boolean f85330c;

    /* renamed from: d */
    public bxtx f85331d = bxtx.f164797b;

    /* renamed from: e */
    public long f85332e;

    /* renamed from: f */
    public int f85333f;

    /* renamed from: g */
    public int f85334g;

    /* renamed from: h */
    public int f85335h;

    /* renamed from: i */
    public String f85336i = "";

    /* renamed from: j */
    public boolean f85337j;

    /* renamed from: k */
    public boolean f85338k;

    /* renamed from: l */
    public String f85339l = "";

    static {
        apzx apzx = new apzx();
        f85326m = apzx;
        bxvk.m124024a(apzx.class, apzx);
    }

    private apzx() {
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
            return bxvk.m124022a(f85326m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဈ\u0007\tဇ\b\nဇ\t\u000bဈ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new apzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f85326m);
            }
            if (i2 == 5) {
                return f85326m;
            }
            bxxk bxxk = f85327n;
            if (bxxk == null) {
                synchronized (apzx.class) {
                    bxxk = f85327n;
                    if (bxxk == null) {
                        bxxk = new bxve(f85326m);
                        f85327n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
