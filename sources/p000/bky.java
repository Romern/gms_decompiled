package p000;

/* renamed from: bky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bky extends GeneratedMessageLite implements bxxd {

    /* renamed from: v */
    public static final bky f5051v;

    /* renamed from: w */
    private static volatile bxxk f5052w;

    /* renamed from: a */
    public int f5053a;

    /* renamed from: b */
    public long f5054b;

    /* renamed from: c */
    public int f5055c;

    /* renamed from: d */
    public bxwc f5056d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f5057e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f5058f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f5059g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f5060h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f5061i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f5062j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f5063k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f5064l = bxxn.f165040b;

    /* renamed from: m */
    public bxwc f5065m = bxxn.f165040b;

    /* renamed from: n */
    public bxwc f5066n = bxxn.f165040b;

    /* renamed from: o */
    public bxvw f5067o = bxwq.f165002b;

    /* renamed from: p */
    public bxwc f5068p = bxxn.f165040b;

    /* renamed from: q */
    public boolean f5069q = true;

    /* renamed from: r */
    public bxwc f5070r = bxxn.f165040b;

    /* renamed from: s */
    public boolean f5071s;

    /* renamed from: t */
    public bxwc f5072t = bxxn.f165040b;

    /* renamed from: u */
    public bxwc f5073u = bxxn.f165040b;

    static {
        bky bky = new bky();
        f5051v = bky;
        GeneratedMessageLite.m124024a(bky.class, bky);
    }

    private bky() {
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
            return GeneratedMessageLite.m124022a(f5051v, "\u0001\u0014\u0000\u0001\u0001Ϩ\u0014\u0000\u0010\u0000\u0001ဂ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001a\r\u0014\u000e\u001b\u0010ဇ\u0003\u0011\u001b\u0014ဇ\u0006\u0016\u001a\u0017\u001bϨင\u0001", new Object[]{"a", "b", "d", bkl.class, "e", bki.class, "f", blc.class, "g", bko.class, "h", bkj.class, "i", bkf.class, "j", bks.class, "k", bkd.class, "l", bkc.class, "m", blb.class, "n", "o", "p", bkx.class, "q", "r", bkp.class, "s", "t", "u", bkt.class, "c"});
        } else if (i2 == 3) {
            return new bky();
        } else {
            if (i2 == 4) {
                return new bxvd(f5051v);
            }
            if (i2 == 5) {
                return f5051v;
            }
            bxxk bxxk = f5052w;
            if (bxxk == null) {
                synchronized (bky.class) {
                    bxxk = f5052w;
                    if (bxxk == null) {
                        bxxk = new bxve(f5051v);
                        f5052w = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
