package p000;

/* renamed from: bwgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgv extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bwgv f159275p;

    /* renamed from: q */
    private static volatile bxxk f159276q;

    /* renamed from: a */
    public int f159277a;

    /* renamed from: b */
    public bwgu f159278b;

    /* renamed from: c */
    public String f159279c = "";

    /* renamed from: d */
    public String f159280d = "";

    /* renamed from: e */
    public int f159281e;

    /* renamed from: f */
    public boolean f159282f;

    /* renamed from: g */
    public boolean f159283g;

    /* renamed from: h */
    public boolean f159284h;

    /* renamed from: i */
    public boolean f159285i;

    /* renamed from: j */
    public String f159286j = "";

    /* renamed from: k */
    public bxtx f159287k = bxtx.f164797b;

    /* renamed from: l */
    public bmks f159288l;

    /* renamed from: m */
    public boolean f159289m;

    /* renamed from: n */
    public boolean f159290n;

    /* renamed from: o */
    public boolean f159291o;

    static {
        bwgv bwgv = new bwgv();
        f159275p = bwgv;
        bxvk.m124024a(bwgv.class, bwgv);
    }

    private bwgv() {
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
            return bxvk.m124022a(f159275p, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0003\u0003ဇ\u0005\u0005ဇ\u0007\u0006ဈ\b\u0007ည\t\bဉ\n\nဇ\u0004\u000bဇ\u0006\fဈ\u0001\rဈ\u0002\u000eဇ\u000b\u000fဇ\f\u0011ဇ\u000e", new Object[]{"a", "b", "e", blzg.f128348a, "g", "i", "j", "k", "l", "f", "h", "c", "d", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bwgv();
        } else {
            if (i2 == 4) {
                return new bxvd(f159275p);
            }
            if (i2 == 5) {
                return f159275p;
            }
            bxxk bxxk = f159276q;
            if (bxxk == null) {
                synchronized (bwgv.class) {
                    bxxk = f159276q;
                    if (bxxk == null) {
                        bxxk = new bxve(f159275p);
                        f159276q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
