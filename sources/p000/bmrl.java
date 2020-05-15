package p000;

/* renamed from: bmrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrl extends GeneratedMessageLite implements bxxd {

    /* renamed from: u */
    public static final bmrl f130520u;

    /* renamed from: w */
    private static volatile bxxk f130521w;

    /* renamed from: a */
    public int f130522a;

    /* renamed from: b */
    public String f130523b = "";

    /* renamed from: c */
    public long f130524c;

    /* renamed from: d */
    public bmlz f130525d;

    /* renamed from: e */
    public String f130526e = "";

    /* renamed from: f */
    public bxwc f130527f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f130528g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f130529h = bxxn.f165040b;

    /* renamed from: i */
    public boolean f130530i;

    /* renamed from: j */
    public bxwc f130531j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f130532k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f130533l = bxxn.f165040b;

    /* renamed from: m */
    public bxwc f130534m = bxxn.f165040b;

    /* renamed from: n */
    public bxwc f130535n = bxxn.f165040b;

    /* renamed from: o */
    public bxwc f130536o = bxxn.f165040b;

    /* renamed from: p */
    public bmet f130537p;

    /* renamed from: q */
    public bmob f130538q;

    /* renamed from: r */
    public bxwc f130539r = bxxn.f165040b;

    /* renamed from: s */
    public bxwc f130540s = bxxn.f165040b;

    /* renamed from: t */
    public bmkw f130541t;

    /* renamed from: v */
    private byte f130542v = 2;

    static {
        bmrl bmrl = new bmrl();
        f130520u = bmrl;
        GeneratedMessageLite.m124024a(bmrl.class, bmrl);
    }

    private bmrl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130542v);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130542v = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130520u, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u000b\u0002\u0001ဈ\u0000\u0004ဉ\u0002\u0006Л\u0007\u001b\b\u001b\n\u001b\u000b\u001b\f\u001b\u000e\u001b\u000fဇ\u0004\u0010\u001b\u0012ဈ\u0003\u0013\u001b\u0014ဂ\u0001\u0015\u001b\u0016ဉ\u0006\u0017ဉ\u0005\u0018\u001b\u001aᐉ\u0007", new Object[]{"a", "b", "d", "j", bmeb.class, "k", bmfb.class, "g", bmnr.class, "m", bmkt.class, "n", bmof.class, "o", bmdb.class, "h", bmlv.class, "i", "r", bmnr.class, "e", "f", bmnr.class, "c", "s", bmno.class, "q", "p", "l", bmjf.class, "t"});
        } else if (i2 == 3) {
            return new bmrl();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f130520u;
            }
            bxxk bxxk = f130521w;
            if (bxxk == null) {
                synchronized (bmrl.class) {
                    bxxk = f130521w;
                    if (bxxk == null) {
                        bxxk = new bxve(f130520u);
                        f130521w = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
