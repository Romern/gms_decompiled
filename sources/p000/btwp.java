package p000;

/* renamed from: btwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwp extends bxvk implements bxxd {

    /* renamed from: s */
    public static final btwp f152728s;

    /* renamed from: t */
    private static volatile bxxk f152729t;

    /* renamed from: a */
    public int f152730a;

    /* renamed from: b */
    public String f152731b = "";

    /* renamed from: c */
    public String f152732c = "";

    /* renamed from: d */
    public String f152733d = "";

    /* renamed from: e */
    public String f152734e = "";

    /* renamed from: f */
    public String f152735f = "";

    /* renamed from: g */
    public String f152736g = "";

    /* renamed from: h */
    public String f152737h = "";

    /* renamed from: i */
    public String f152738i = "";

    /* renamed from: j */
    public String f152739j = "";

    /* renamed from: k */
    public String f152740k = "";

    /* renamed from: l */
    public String f152741l = "";

    /* renamed from: m */
    public String f152742m = "";

    /* renamed from: n */
    public String f152743n = "";

    /* renamed from: o */
    public String f152744o = "";

    /* renamed from: p */
    public bxwc f152745p = bxxn.f165040b;

    /* renamed from: q */
    public String f152746q = "";

    /* renamed from: r */
    public String f152747r = "";

    static {
        btwp btwp = new btwp();
        f152728s = btwp;
        bxvk.m124024a(btwp.class, btwp);
    }

    private btwp() {
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
            return bxvk.m124022a(f152728s, "\u0001\u0011\u0000\u0001\u0001\u001e\u0011\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဈ\b\u000bဈ\t\fဈ\u000b\u000e\u001a\u000fဈ\u000f\u0010ဈ\u0010\u0011ဈ\u0007\u001aဈ\u0003\u001bဈ\u0011\u001cဈ\u0012\u001dဈ\r\u001eဈ\u000e", new Object[]{"a", "b", "c", "e", "f", "g", "i", "j", "k", "p", "n", "o", "h", "d", "q", "r", "l", "m"});
        } else if (i2 == 3) {
            return new btwp();
        } else {
            if (i2 == 4) {
                return new btwo();
            }
            if (i2 == 5) {
                return f152728s;
            }
            bxxk bxxk = f152729t;
            if (bxxk == null) {
                synchronized (btwp.class) {
                    bxxk = f152729t;
                    if (bxxk == null) {
                        bxxk = new bxve(f152728s);
                        f152729t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo72448a() {
        if (!this.f152745p.mo73666a()) {
            this.f152745p = bxvk.m124021a(this.f152745p);
        }
    }
}
