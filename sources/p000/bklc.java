package p000;

/* renamed from: bklc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklc extends GeneratedMessageLite implements bxxd {

    /* renamed from: t */
    public static final bklc f124698t;

    /* renamed from: w */
    private static volatile bxxk f124699w;

    /* renamed from: a */
    public String f124700a = "";

    /* renamed from: b */
    public String f124701b = "";

    /* renamed from: c */
    public String f124702c = "";

    /* renamed from: d */
    public String f124703d = "";

    /* renamed from: e */
    public String f124704e = "";

    /* renamed from: f */
    public String f124705f = "";

    /* renamed from: g */
    public boolean f124706g;

    /* renamed from: h */
    public String f124707h;

    /* renamed from: i */
    public String f124708i;

    /* renamed from: j */
    public String f124709j;

    /* renamed from: k */
    public long f124710k;

    /* renamed from: l */
    public String f124711l;

    /* renamed from: m */
    public String f124712m;

    /* renamed from: n */
    public String f124713n;

    /* renamed from: o */
    public boolean f124714o;

    /* renamed from: p */
    public String f124715p;

    /* renamed from: q */
    public String f124716q;

    /* renamed from: r */
    public String f124717r;

    /* renamed from: s */
    public bxwc f124718s;

    /* renamed from: u */
    private int f124719u;

    /* renamed from: v */
    private int f124720v;

    static {
        bklc bklc = new bklc();
        f124698t = bklc;
        GeneratedMessageLite.m124024a(bklc.class, bklc);
    }

    private bklc() {
        bxxn bxxn = bxxn.f165040b;
        this.f124707h = "";
        this.f124708i = "";
        this.f124709j = "";
        this.f124711l = "";
        this.f124712m = "";
        this.f124713n = "";
        this.f124715p = "";
        this.f124716q = "";
        this.f124717r = "";
        this.f124718s = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f124698t, "\u0001\u0013\u0000\u0002\u0002-\u0013\u0000\u0001\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u000bဈ\n\u0011ဈ\u0010\u0013ဈ\u0012\u0014ဈ\u0013\u0019ဇ\u0016\u001cဈ\u0018!ဈ\u001d\"ဈ\u001e#ဂ\u001f$ဈ &ဈ\"'ဈ#(ဇ$*ဈ%+ဈ&,ဈ'-\u001b", new Object[]{"u", "v", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", bkll.class});
        } else if (i2 == 3) {
            return new bklc();
        } else {
            if (i2 == 4) {
                return new bxvd(f124698t);
            }
            if (i2 == 5) {
                return f124698t;
            }
            bxxk bxxk = f124699w;
            if (bxxk == null) {
                synchronized (bklc.class) {
                    bxxk = f124699w;
                    if (bxxk == null) {
                        bxxk = new bxve(f124698t);
                        f124699w = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
