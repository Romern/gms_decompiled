package p000;

/* renamed from: cinl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinl extends bxvk implements bxxd {

    /* renamed from: w */
    public static final cinl f190943w;

    /* renamed from: y */
    private static volatile bxxk f190944y;

    /* renamed from: a */
    public int f190945a;

    /* renamed from: b */
    public String f190946b = "";

    /* renamed from: c */
    public String f190947c = "";

    /* renamed from: d */
    public String f190948d = "";

    /* renamed from: e */
    public int f190949e;

    /* renamed from: f */
    public int f190950f;

    /* renamed from: g */
    public int f190951g;

    /* renamed from: h */
    public int f190952h;

    /* renamed from: i */
    public int f190953i;

    /* renamed from: j */
    public int f190954j;

    /* renamed from: k */
    public cioa f190955k;

    /* renamed from: l */
    public int f190956l;

    /* renamed from: m */
    public cini f190957m;

    /* renamed from: n */
    public long f190958n;

    /* renamed from: o */
    public int f190959o;

    /* renamed from: p */
    public int f190960p;

    /* renamed from: q */
    public int f190961q;

    /* renamed from: r */
    public int f190962r;

    /* renamed from: s */
    public String f190963s;

    /* renamed from: t */
    public bxvw f190964t;

    /* renamed from: u */
    public String f190965u;

    /* renamed from: v */
    public cinf f190966v;

    /* renamed from: x */
    private byte f190967x = 2;

    static {
        cinl cinl = new cinl();
        f190943w = cinl;
        bxvk.m124024a(cinl.class, cinl);
    }

    private cinl() {
        bxxn bxxn = bxxn.f165040b;
        this.f190963s = "";
        this.f190964t = bxwq.f165002b;
        this.f190965u = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190967x);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190967x = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190943w, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဌ\b\nဉ\t\u000bဉ\u000b\rဂ\r\u000eဌ\u000e\u000fဌ\u000f\u0010င\u0011\u0011ဈ\u0012\u0013င\u0010\u0014ဈ\u0014\u0015(\u0018ဌ\n\u0019ဈ\u0002\u001aဉ\u0016", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", cinp.f190973a, "k", "m", "n", "o", cinq.f190974a, "p", cinn.f190972a, "r", "s", "q", "u", "t", "l", cink.m150635b(), "d", "v"});
        } else if (i2 == 3) {
            return new cinl();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f190943w;
            }
            bxxk bxxk = f190944y;
            if (bxxk == null) {
                synchronized (cinl.class) {
                    bxxk = f190944y;
                    if (bxxk == null) {
                        bxxk = new bxve(f190943w);
                        f190944y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
