package p000;

/* renamed from: bped */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bped extends GeneratedMessageLite implements bxxd {

    /* renamed from: x */
    public static final bped f137237x;

    /* renamed from: y */
    private static volatile bxxk f137238y;

    /* renamed from: a */
    public int f137239a;

    /* renamed from: b */
    public int f137240b;

    /* renamed from: c */
    public int f137241c;

    /* renamed from: d */
    public long f137242d;

    /* renamed from: e */
    public String f137243e = "";

    /* renamed from: f */
    public int f137244f;

    /* renamed from: g */
    public int f137245g;

    /* renamed from: h */
    public int f137246h;

    /* renamed from: i */
    public bpdg f137247i;

    /* renamed from: j */
    public String f137248j = "";

    /* renamed from: k */
    public int f137249k = -1;

    /* renamed from: l */
    public int f137250l;

    /* renamed from: m */
    public int f137251m;

    /* renamed from: n */
    public String f137252n = "";

    /* renamed from: o */
    public int f137253o;

    /* renamed from: p */
    public String f137254p = "";

    /* renamed from: q */
    public int f137255q = 1;

    /* renamed from: r */
    public int f137256r;

    /* renamed from: s */
    public bxwc f137257s = bxxn.f165040b;

    /* renamed from: t */
    public bpdl f137258t;

    /* renamed from: u */
    public bpdm f137259u;

    /* renamed from: v */
    public bpdk f137260v;

    /* renamed from: w */
    public bxwc f137261w = bxxn.f165040b;

    static {
        bped bped = new bped();
        f137237x = bped;
        GeneratedMessageLite.m124024a(bped.class, bped);
    }

    private bped() {
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
            return GeneratedMessageLite.m124022a(f137237x, "\u0001\u0016\u0000\u0001\u0001\u001e\u0016\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u000fင\u0006\u0010ဉ\u0007\u0011ဈ\b\u0012င\t\u0013င\n\u0014င\u000b\u0015ဈ\f\u0016င\r\u0017ဈ\u000e\u0018င\u000f\u0019င\u0010\u001a\u001a\u001bဉ\u0011\u001cဉ\u0012\u001dဉ\u0013\u001e\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
        } else if (i2 == 3) {
            return new bped();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f137237x;
            }
            bxxk bxxk = f137238y;
            if (bxxk == null) {
                synchronized (bped.class) {
                    bxxk = f137238y;
                    if (bxxk == null) {
                        bxxk = new bxve(f137237x);
                        f137238y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
