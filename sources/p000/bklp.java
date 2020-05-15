package p000;

/* renamed from: bklp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklp extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bklp f124819l;

    /* renamed from: n */
    private static volatile bxxk f124820n;

    /* renamed from: a */
    public String f124821a = "";

    /* renamed from: b */
    public String f124822b = "";

    /* renamed from: c */
    public String f124823c = "";

    /* renamed from: d */
    public String f124824d;

    /* renamed from: e */
    public boolean f124825e;

    /* renamed from: f */
    public bxwc f124826f;

    /* renamed from: g */
    public long f124827g;

    /* renamed from: h */
    public long f124828h;

    /* renamed from: i */
    public String f124829i;

    /* renamed from: j */
    public String f124830j;

    /* renamed from: k */
    public bxwc f124831k;

    /* renamed from: m */
    private int f124832m;

    static {
        bklp bklp = new bklp();
        f124819l = bklp;
        bxvk.m124024a(bklp.class, bklp);
    }

    private bklp() {
        bxxn bxxn = bxxn.f165040b;
        this.f124824d = "";
        bxtx bxtx = bxtx.f164797b;
        this.f124826f = bxxn.f165040b;
        this.f124829i = "";
        this.f124830j = "";
        this.f124831k = bxxn.f165040b;
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
            return bxvk.m124022a(f124819l, "\u0001\u000b\u0000\u0001\u0001\u001a\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0004\fဇ\n\u000e\u001b\u0011ဂ\u000e\u0012ဂ\u000f\u0015ဈ\u0012\u0016ဈ\u0013\u001a\u001b", new Object[]{"m", "a", "b", "c", "d", "e", "f", bklm.class, "g", "h", "i", "j", "k", bkll.class});
        } else if (i2 == 3) {
            return new bklp();
        } else {
            if (i2 == 4) {
                return new bxvd(f124819l);
            }
            if (i2 == 5) {
                return f124819l;
            }
            bxxk bxxk = f124820n;
            if (bxxk == null) {
                synchronized (bklp.class) {
                    bxxk = f124820n;
                    if (bxxk == null) {
                        bxxk = new bxve(f124819l);
                        f124820n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
