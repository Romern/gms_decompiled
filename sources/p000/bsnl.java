package p000;

/* renamed from: bsnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnl extends bxvk implements bxxd {

    /* renamed from: C */
    public static final bsnl f146266C;

    /* renamed from: D */
    private static volatile bxxk f146267D;

    /* renamed from: A */
    public boolean f146268A;

    /* renamed from: B */
    public String f146269B = "";

    /* renamed from: a */
    public bxwc f146270a = bxxn.f165040b;

    /* renamed from: b */
    public String f146271b = "";

    /* renamed from: c */
    public String f146272c = "";

    /* renamed from: d */
    public long f146273d;

    /* renamed from: e */
    public String f146274e = "";

    /* renamed from: f */
    public String f146275f = "";

    /* renamed from: g */
    public long f146276g;

    /* renamed from: h */
    public String f146277h = "";

    /* renamed from: i */
    public String f146278i = "";

    /* renamed from: j */
    public int f146279j;

    /* renamed from: k */
    public String f146280k = "";

    /* renamed from: l */
    public String f146281l = "";

    /* renamed from: m */
    public int f146282m;

    /* renamed from: n */
    public boolean f146283n;

    /* renamed from: o */
    public boolean f146284o;

    /* renamed from: p */
    public boolean f146285p;

    /* renamed from: q */
    public boolean f146286q;

    /* renamed from: r */
    public boolean f146287r;

    /* renamed from: s */
    public boolean f146288s;

    /* renamed from: t */
    public boolean f146289t;

    /* renamed from: u */
    public boolean f146290u;

    /* renamed from: v */
    public bxwc f146291v = bxxn.f165040b;

    /* renamed from: w */
    public boolean f146292w;

    /* renamed from: x */
    public boolean f146293x;

    /* renamed from: y */
    public boolean f146294y;

    /* renamed from: z */
    public boolean f146295z;

    static {
        bsnl bsnl = new bsnl();
        f146266C = bsnl;
        bxvk.m124024a(bsnl.class, bsnl);
    }

    private bsnl() {
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
            return bxvk.m124022a(f146266C, "\u0000\u001c\u0000\u0000\u0001 \u001c\u0000\u0002\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004\u0005\u0006Ȉ\u0007Ȉ\b\u0002\tȈ\nȈ\u000b\u0004\fȈ\rȈ\u000e\f\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0007\u0015\u0007\u0016\u0007\u0017\u001b\u0019\u0007\u001a\u0007\u001b\u0007\u001e\u0007\u001fȈ \u0007", new Object[]{"a", bsnk.class, "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", bsnn.class, "w", "x", "y", "A", "B", "z"});
        } else if (i2 == 3) {
            return new bsnl();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f146266C;
            }
            bxxk bxxk = f146267D;
            if (bxxk == null) {
                synchronized (bsnl.class) {
                    bxxk = f146267D;
                    if (bxxk == null) {
                        bxxk = new bxve(f146266C);
                        f146267D = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
