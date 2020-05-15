package p000;

/* renamed from: bmqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqe extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxvu f130350i = new bmpo();

    /* renamed from: s */
    public static final bmqe f130351s;

    /* renamed from: t */
    private static volatile bxxk f130352t;

    /* renamed from: a */
    public int f130353a;

    /* renamed from: b */
    public int f130354b = 0;

    /* renamed from: c */
    public Object f130355c;

    /* renamed from: d */
    public int f130356d;

    /* renamed from: e */
    public int f130357e;

    /* renamed from: f */
    public String f130358f = "";

    /* renamed from: g */
    public int f130359g;

    /* renamed from: h */
    public bxvt f130360h = bxvm.f164965b;

    /* renamed from: j */
    public bxwc f130361j = bxxn.f165040b;

    /* renamed from: k */
    public String f130362k = "";

    /* renamed from: l */
    public int f130363l;

    /* renamed from: m */
    public boolean f130364m;

    /* renamed from: n */
    public String f130365n = "";

    /* renamed from: o */
    public boolean f130366o;

    /* renamed from: p */
    public int f130367p;

    /* renamed from: q */
    public int f130368q;

    /* renamed from: r */
    public int f130369r;

    static {
        bmqe bmqe = new bmqe();
        f130351s = bmqe;
        bxvk.m124024a(bmqe.class, bmqe);
    }

    private bmqe() {
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
            return bxvk.m124022a(f130351s, "\u0001\u0010\u0001\u0001\u0001\u001d\u0010\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005\u001b\u0006ဈ\u0004\u0007ဌ\u0005\bဇ\b\rြ\u0000\u000eြ\u0000\u000f,\u0010ဈ\u0007\u0011ဇ\u0006\u0014ဌ\t\u001bဌ\r\u001dဌ\n", new Object[]{"c", "b", "a", "d", "e", "f", "g", bmpt.f130325a, "j", bmqb.class, "k", "l", bmpz.f130341a, "o", bmnl.class, bmnn.class, "h", bmpw.m108269b(), "n", "m", "p", bmpx.f130340a, "r", bmpr.f130324a, "q", bmqc.f130349a});
        } else if (i2 == 3) {
            return new bmqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f130351s);
            }
            if (i2 == 5) {
                return f130351s;
            }
            bxxk bxxk = f130352t;
            if (bxxk == null) {
                synchronized (bmqe.class) {
                    bxxk = f130352t;
                    if (bxxk == null) {
                        bxxk = new bxve(f130351s);
                        f130352t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
