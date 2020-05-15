package p000;

/* renamed from: borm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borm extends bxvk implements bxxd {

    /* renamed from: t */
    public static final borm f134436t;

    /* renamed from: u */
    private static volatile bxxk f134437u;

    /* renamed from: a */
    public int f134438a;

    /* renamed from: b */
    public borl f134439b;

    /* renamed from: c */
    public boro f134440c;

    /* renamed from: d */
    public borp f134441d;

    /* renamed from: e */
    public bors f134442e;

    /* renamed from: f */
    public borq f134443f;

    /* renamed from: g */
    public int f134444g;

    /* renamed from: h */
    public boolean f134445h;

    /* renamed from: i */
    public boolean f134446i;

    /* renamed from: j */
    public borr f134447j;

    /* renamed from: k */
    public borr f134448k;

    /* renamed from: l */
    public boolean f134449l = true;

    /* renamed from: m */
    public int f134450m = -1;

    /* renamed from: n */
    public born f134451n;

    /* renamed from: o */
    public String f134452o = "";

    /* renamed from: p */
    public String f134453p = "";

    /* renamed from: q */
    public int f134454q;

    /* renamed from: r */
    public boolean f134455r;

    /* renamed from: s */
    public int f134456s;

    static {
        borm borm = new borm();
        f134436t = borm;
        bxvk.m124024a(borm.class, borm);
    }

    private borm() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f134436t, "\u0001\u0012\u0000\u0001\u0001\u0017\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0005\u0006ဇ\u0007\u0007ဇ\b\bဉ\t\tဇ\u000b\nင\f\u000bဉ\n\fဉ\r\rဈ\u000e\u000eဈ\u000f\u0014ဇ\u0011\u0015င\u0012\u0016ဉ\u0004\u0017င\u0010", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "j", "l", "m", "k", "n", "o", "p", "r", "s", "f", "q"});
        } else if (i2 == 3) {
            return new borm();
        } else {
            if (i2 == 4) {
                return new bxvd(f134436t);
            }
            if (i2 == 5) {
                return f134436t;
            }
            bxxk bxxk = f134437u;
            if (bxxk == null) {
                synchronized (borm.class) {
                    bxxk = f134437u;
                    if (bxxk == null) {
                        bxxk = new bxve(f134436t);
                        f134437u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
