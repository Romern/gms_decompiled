package p000;

/* renamed from: bgvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvg extends GeneratedMessageLite implements bxxd {

    /* renamed from: x */
    public static final bgvg f117634x;

    /* renamed from: y */
    private static volatile bxxk f117635y;

    /* renamed from: a */
    public int f117636a;

    /* renamed from: b */
    public String f117637b = "";

    /* renamed from: c */
    public String f117638c = "";

    /* renamed from: d */
    public boolean f117639d;

    /* renamed from: e */
    public long f117640e;

    /* renamed from: f */
    public boolean f117641f;

    /* renamed from: g */
    public boolean f117642g;

    /* renamed from: h */
    public boolean f117643h;

    /* renamed from: i */
    public boolean f117644i;

    /* renamed from: j */
    public long f117645j;

    /* renamed from: k */
    public int f117646k;

    /* renamed from: l */
    public boolean f117647l;

    /* renamed from: m */
    public boolean f117648m;

    /* renamed from: n */
    public bgvk f117649n;

    /* renamed from: o */
    public int f117650o;

    /* renamed from: p */
    public boolean f117651p = true;

    /* renamed from: q */
    public String f117652q = "";

    /* renamed from: r */
    public long f117653r;

    /* renamed from: s */
    public String f117654s = "";

    /* renamed from: t */
    public String f117655t = "";

    /* renamed from: u */
    public long f117656u;

    /* renamed from: v */
    public boolean f117657v;

    /* renamed from: w */
    public int f117658w;

    static {
        bgvg bgvg = new bgvg();
        f117634x = bgvg;
        GeneratedMessageLite.m124024a(bgvg.class, bgvg);
    }

    private bgvg() {
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
            return GeneratedMessageLite.m124022a(f117634x, "\u0001\u0016\u0000\u0001\u0001\u0018\u0016\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဂ\b\nင\t\u000bဇ\n\fဇ\u000b\rဉ\f\u000eင\r\u000fဇ\u000e\u0011ဈ\u000f\u0012ဂ\u0010\u0014ဈ\u0012\u0015ဈ\u0013\u0016ဂ\u0014\u0017ဇ\u0015\u0018င\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
        } else if (i2 == 3) {
            return new bgvg();
        } else {
            if (i2 == 4) {
                return new bxvd(f117634x);
            }
            if (i2 == 5) {
                return f117634x;
            }
            bxxk bxxk = f117635y;
            if (bxxk == null) {
                synchronized (bgvg.class) {
                    bxxk = f117635y;
                    if (bxxk == null) {
                        bxxk = new bxve(f117634x);
                        f117635y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
