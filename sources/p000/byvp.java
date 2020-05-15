package p000;

/* renamed from: byvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvp extends bxvk implements bxxd {

    /* renamed from: n */
    public static final byvp f168473n;

    /* renamed from: o */
    private static volatile bxxk f168474o;

    /* renamed from: a */
    public int f168475a;

    /* renamed from: b */
    public String f168476b = "";

    /* renamed from: c */
    public int f168477c;

    /* renamed from: d */
    public String f168478d = "";

    /* renamed from: e */
    public int f168479e;

    /* renamed from: f */
    public int f168480f;

    /* renamed from: g */
    public int f168481g;

    /* renamed from: h */
    public String f168482h = "";

    /* renamed from: i */
    public int f168483i;

    /* renamed from: j */
    public double f168484j;

    /* renamed from: k */
    public long f168485k;

    /* renamed from: l */
    public String f168486l = "";

    /* renamed from: m */
    public int f168487m;

    static {
        byvp byvp = new byvp();
        f168473n = byvp;
        bxvk.m124024a(byvp.class, byvp);
    }

    private byvp() {
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
            return bxvk.m124022a(f168473n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဈ\u0003\u0006ဌ\u0004\u0007င\u0005\bင\u0006\tဈ\u0007\nဌ\b\u000bက\t\fဂ\n\rဈ\u000b\u000eဌ\f", new Object[]{"a", "b", "c", bzbk.m125616b(), "d", "e", bvil.f156161a, "f", "g", "h", "i", bzar.m125590b(), "j", "k", "l", "m", bvja.f156300a});
        } else if (i2 == 3) {
            return new byvp();
        } else {
            if (i2 == 4) {
                return new bxvd(f168473n);
            }
            if (i2 == 5) {
                return f168473n;
            }
            bxxk bxxk = f168474o;
            if (bxxk == null) {
                synchronized (byvp.class) {
                    bxxk = f168474o;
                    if (bxxk == null) {
                        bxxk = new bxve(f168473n);
                        f168474o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
