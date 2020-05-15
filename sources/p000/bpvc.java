package p000;

/* renamed from: bpvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvc extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final bpvc f139295q;

    /* renamed from: r */
    private static volatile bxxk f139296r;

    /* renamed from: a */
    public int f139297a;

    /* renamed from: b */
    public String f139298b = "";

    /* renamed from: c */
    public long f139299c;

    /* renamed from: d */
    public int f139300d;

    /* renamed from: e */
    public int f139301e;

    /* renamed from: f */
    public int f139302f;

    /* renamed from: g */
    public bpvq f139303g;

    /* renamed from: h */
    public int f139304h;

    /* renamed from: i */
    public int f139305i;

    /* renamed from: j */
    public int f139306j;

    /* renamed from: k */
    public int f139307k;

    /* renamed from: l */
    public long f139308l;

    /* renamed from: m */
    public boolean f139309m;

    /* renamed from: n */
    public String f139310n = "";

    /* renamed from: o */
    public String f139311o = "";

    /* renamed from: p */
    public String f139312p = "";

    static {
        bpvc bpvc = new bpvc();
        f139295q = bpvc;
        GeneratedMessageLite.m124024a(bpvc.class, bpvc);
    }

    private bpvc() {
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
            return GeneratedMessageLite.m124022a(f139295q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007င\u0006\bဌ\u0007\tင\b\nဌ\t\u000eဂ\r\u000fဇ\u000e\u0012ဈ\u0011\u0013ဈ\u0012\u0014ဈ\u0013", new Object[]{"a", "b", "c", "d", bpuu.f139290a, "e", bpva.f139294a, "f", bpux.f139292a, "g", "h", "i", bpuz.f139293a, "j", "k", bpuw.f139291a, "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new bpvc();
        } else {
            if (i2 == 4) {
                return new bxvd(f139295q);
            }
            if (i2 == 5) {
                return f139295q;
            }
            bxxk bxxk = f139296r;
            if (bxxk == null) {
                synchronized (bpvc.class) {
                    bxxk = f139296r;
                    if (bxxk == null) {
                        bxxk = new bxve(f139295q);
                        f139296r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
