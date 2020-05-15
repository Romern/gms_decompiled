package p000;

/* renamed from: bzdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdh extends bxvk implements bxxd {

    /* renamed from: A */
    public static final bzdh f169466A;

    /* renamed from: C */
    private static volatile bxxk f169467C;

    /* renamed from: B */
    private boolean f169468B = true;

    /* renamed from: a */
    public int f169469a;

    /* renamed from: b */
    public String f169470b = "";

    /* renamed from: c */
    public String f169471c = "";

    /* renamed from: d */
    public String f169472d = "";

    /* renamed from: e */
    public String f169473e = "";

    /* renamed from: f */
    public String f169474f = "";

    /* renamed from: g */
    public boolean f169475g;

    /* renamed from: h */
    public boolean f169476h;

    /* renamed from: i */
    public long f169477i;

    /* renamed from: j */
    public long f169478j;

    /* renamed from: k */
    public long f169479k;

    /* renamed from: l */
    public boolean f169480l;

    /* renamed from: m */
    public double f169481m;

    /* renamed from: n */
    public long f169482n;

    /* renamed from: o */
    public int f169483o;

    /* renamed from: p */
    public int f169484p;

    /* renamed from: q */
    public bxwc f169485q = bxxn.f165040b;

    /* renamed from: r */
    public boolean f169486r;

    /* renamed from: s */
    public int f169487s;

    /* renamed from: t */
    public int f169488t;

    /* renamed from: u */
    public boolean f169489u;

    /* renamed from: v */
    public long f169490v;

    /* renamed from: w */
    public String f169491w = "";

    /* renamed from: x */
    public String f169492x = "";

    /* renamed from: y */
    public String f169493y = "";

    /* renamed from: z */
    public int f169494z;

    static {
        bzdh bzdh = new bzdh();
        f169466A = bzdh;
        bxvk.m124024a(bzdh.class, bzdh);
    }

    private bzdh() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125687a(bzdh bzdh) {
        bzdh.f169469a |= 32;
        bzdh.f169468B = true;
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
            return bxvk.m124022a(f169466A, "\u0001\u001a\u0000\u0001\u0001\u001f\u001a\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\nဂ\t\u000bဂ\n\fဂ\u000b\rဇ\f\u000eက\r\u000fဂ\u0010\u0010ဌ\u0011\u0012င\u0013\u0015\u001b\u0017ဇ\u0014\u0018ဌ\u0015\u0019ဌ\u0016\u001aဇ\u0017\u001bဂ\u0018\u001cဈ\u0019\u001dဈ\u001a\u001eဈ\u001b\u001fဌ\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "B", "g", "h", "i", "j", "k", "l", "m", "n", "o", bzdf.f169465a, "p", "q", bzdk.class, "r", "s", bzdd.f169464a, "t", bzdd.f169464a, "u", "v", "w", "x", "y", "z", bzdc.f169463a});
        } else if (i2 == 3) {
            return new bzdh();
        } else {
            if (i2 == 4) {
                return new bzdb();
            }
            if (i2 == 5) {
                return f169466A;
            }
            bxxk bxxk = f169467C;
            if (bxxk == null) {
                synchronized (bzdh.class) {
                    bxxk = f169467C;
                    if (bxxk == null) {
                        bxxk = new bxve(f169466A);
                        f169467C = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
