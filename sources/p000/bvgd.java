package p000;

/* renamed from: bvgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgd extends GeneratedMessageLite implements bxxd {

    /* renamed from: B */
    public static final bvgd f155960B;

    /* renamed from: D */
    private static volatile bxxk f155961D;

    /* renamed from: A */
    public String f155962A = "";

    /* renamed from: C */
    private byte f155963C = 2;

    /* renamed from: a */
    public int f155964a;

    /* renamed from: b */
    public int f155965b;

    /* renamed from: c */
    public bvfa f155966c;

    /* renamed from: d */
    public bvfh f155967d;

    /* renamed from: e */
    public bvfz f155968e;

    /* renamed from: f */
    public bvff f155969f;

    /* renamed from: g */
    public bvfs f155970g;

    /* renamed from: h */
    public bvfr f155971h;

    /* renamed from: i */
    public bvfd f155972i;

    /* renamed from: j */
    public bvfc f155973j;

    /* renamed from: k */
    public bvfv f155974k;

    /* renamed from: l */
    public bvfo f155975l;

    /* renamed from: m */
    public bvfg f155976m;

    /* renamed from: n */
    public bvfw f155977n;

    /* renamed from: o */
    public bvfp f155978o;

    /* renamed from: p */
    public bvfq f155979p;

    /* renamed from: q */
    public bvfu f155980q;

    /* renamed from: r */
    public bvft f155981r;

    /* renamed from: s */
    public bvfn f155982s;

    /* renamed from: t */
    public bvfm f155983t;

    /* renamed from: u */
    public bvfl f155984u;

    /* renamed from: v */
    public int f155985v;

    /* renamed from: w */
    public bvfi f155986w;

    /* renamed from: x */
    public bvfx f155987x;

    /* renamed from: y */
    public bvfb f155988y;

    /* renamed from: z */
    public bvfy f155989z;

    static {
        bvgd bvgd = new bvgd();
        f155960B = bvgd;
        GeneratedMessageLite.m124024a(bvgd.class, bvgd);
    }

    private bvgd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155963C);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155963C = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155960B, "\u0001\u001a\u0000\u0001\u0001 \u001a\u0000\u0000\u0001\u0001ᔌ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0017ဉ\u0016\u001bဌ\u001a\u001cဉ\u001b\u001dဉ\u001c\u001eဉ\u001d\u001fဉ\u001e ဈ\u001f", new Object[]{"a", "b", bvji.f156344a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", bvjk.f156345a, "w", "x", "y", "z", "A"});
        } else if (i2 == 3) {
            return new bvgd();
        } else {
            if (i2 == 4) {
                return new bxvd(f155960B);
            }
            if (i2 == 5) {
                return f155960B;
            }
            bxxk bxxk = f155961D;
            if (bxxk == null) {
                synchronized (bvgd.class) {
                    bxxk = f155961D;
                    if (bxxk == null) {
                        bxxk = new bxve(f155960B);
                        f155961D = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
