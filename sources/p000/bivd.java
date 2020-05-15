package p000;

/* renamed from: bivd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivd extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bivd f121947o;

    /* renamed from: r */
    private static volatile bxxk f121948r;

    /* renamed from: a */
    public bxwc f121949a = bxxn.f165040b;

    /* renamed from: b */
    public String f121950b = "";

    /* renamed from: c */
    public String f121951c = "";

    /* renamed from: d */
    public String f121952d = "";

    /* renamed from: e */
    public String f121953e = "";

    /* renamed from: f */
    public int f121954f;

    /* renamed from: g */
    public String f121955g = "";

    /* renamed from: h */
    public String f121956h = "";

    /* renamed from: i */
    public String f121957i = "";

    /* renamed from: j */
    public String f121958j = "";

    /* renamed from: k */
    public boolean f121959k;

    /* renamed from: l */
    public int f121960l;

    /* renamed from: m */
    public String f121961m = "";

    /* renamed from: n */
    public boolean f121962n;

    /* renamed from: p */
    private int f121963p;

    /* renamed from: q */
    private byte f121964q = 2;

    static {
        bivd bivd = new bivd();
        f121947o = bivd;
        bxvk.m124024a(bivd.class, bivd);
    }

    private bivd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121964q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121964q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121947o, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဇ\t\rင\n\u000eဈ\u000b\u000fဇ\f", new Object[]{"p", "a", bivb.class, "b", "c", "d", "e", "f", biqa.f121248a, "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new bivd();
        } else {
            if (i2 == 4) {
                return new bxvd(f121947o);
            }
            if (i2 == 5) {
                return f121947o;
            }
            bxxk bxxk = f121948r;
            if (bxxk == null) {
                synchronized (bivd.class) {
                    bxxk = f121948r;
                    if (bxxk == null) {
                        bxxk = new bxve(f121947o);
                        f121948r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
