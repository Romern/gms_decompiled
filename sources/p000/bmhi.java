package p000;

/* renamed from: bmhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhi extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bxvu f129407i = new bmhe();

    /* renamed from: k */
    public static final bxvu f129408k = new bmhf();

    /* renamed from: r */
    public static final bmhi f129409r;

    /* renamed from: s */
    private static volatile bxxk f129410s;

    /* renamed from: a */
    public int f129411a;

    /* renamed from: b */
    public bmdn f129412b;

    /* renamed from: c */
    public bmhj f129413c;

    /* renamed from: d */
    public bxwc f129414d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129415e = bxxn.f165040b;

    /* renamed from: f */
    public int f129416f = -1;

    /* renamed from: g */
    public int f129417g;

    /* renamed from: h */
    public bxvt f129418h = bxvm.f164965b;

    /* renamed from: j */
    public bxvt f129419j = bxvm.f164965b;

    /* renamed from: l */
    public long f129420l;

    /* renamed from: m */
    public bxwc f129421m = bxxn.f165040b;

    /* renamed from: n */
    public String f129422n = "";

    /* renamed from: o */
    public String f129423o = "";

    /* renamed from: p */
    public bxwc f129424p = bxxn.f165040b;

    /* renamed from: q */
    public bxwc f129425q = bxxn.f165040b;

    static {
        bmhi bmhi = new bmhi();
        f129409r = bmhi;
        GeneratedMessageLite.m124024a(bmhi.class, bmhi);
    }

    private bmhi() {
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
            return GeneratedMessageLite.m124022a(f129409r, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0007\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0006\u001e\u0007\u001b\bဈ\u0006\t\u001b\nဂ\u0004\u000b\u001e\rဌ\u0003\u000eဈ\u0005\u000fင\u0002\u0013\u001b", new Object[]{"a", "b", "c", "d", bmhk.class, "e", bmno.class, "h", bmld.m108139b(), "m", bmhq.class, "o", "p", bmhm.class, "l", "j", bmnz.m108218b(), "g", bmhg.f129406a, "n", "f", "q", bwhj.class});
        } else if (i2 == 3) {
            return new bmhi();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f129409r;
            }
            bxxk bxxk = f129410s;
            if (bxxk == null) {
                synchronized (bmhi.class) {
                    bxxk = f129410s;
                    if (bxxk == null) {
                        bxxk = new bxve(f129409r);
                        f129410s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
