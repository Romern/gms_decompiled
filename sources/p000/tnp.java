package p000;

/* renamed from: tnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnp extends bxvk implements bxxd {

    /* renamed from: j */
    public static final tnp f46311j;

    /* renamed from: k */
    private static volatile bxxk f46312k;

    /* renamed from: a */
    public int f46313a;

    /* renamed from: b */
    public String f46314b = "";

    /* renamed from: c */
    public String f46315c = "";

    /* renamed from: d */
    public String f46316d = "";

    /* renamed from: e */
    public String f46317e = "";

    /* renamed from: f */
    public String f46318f = "";

    /* renamed from: g */
    public bxcm f46319g;

    /* renamed from: h */
    public long f46320h;

    /* renamed from: i */
    public boolean f46321i;

    static {
        tnp tnp = new tnp();
        f46311j = tnp;
        bxvk.m124024a(tnp.class, tnp);
    }

    private tnp() {
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
            return bxvk.m124022a(f46311j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new tnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f46311j);
            }
            if (i2 == 5) {
                return f46311j;
            }
            bxxk bxxk = f46312k;
            if (bxxk == null) {
                synchronized (tnp.class) {
                    bxxk = f46312k;
                    if (bxxk == null) {
                        bxxk = new bxve(f46311j);
                        f46312k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
