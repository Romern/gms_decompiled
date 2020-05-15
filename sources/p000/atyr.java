package p000;

/* renamed from: atyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyr extends GeneratedMessageLite implements bxxd {

    /* renamed from: x */
    public static final atyr f91150x;

    /* renamed from: y */
    private static volatile bxxk f91151y;

    /* renamed from: a */
    public String f91152a = "";

    /* renamed from: b */
    public ByteString f91153b = ByteString.f164797b;

    /* renamed from: c */
    public String f91154c = "";

    /* renamed from: d */
    public String f91155d = "";

    /* renamed from: e */
    public int f91156e;

    /* renamed from: f */
    public atzl f91157f;

    /* renamed from: g */
    public String f91158g = "";

    /* renamed from: h */
    public String f91159h = "";

    /* renamed from: i */
    public int f91160i;

    /* renamed from: j */
    public int f91161j;

    /* renamed from: k */
    public atzd f91162k;

    /* renamed from: l */
    public String f91163l = "";

    /* renamed from: m */
    public atzm f91164m;

    /* renamed from: n */
    public String f91165n = "";

    /* renamed from: o */
    public ByteString f91166o = ByteString.f164797b;

    /* renamed from: p */
    public int f91167p;

    /* renamed from: q */
    public boolean f91168q;

    /* renamed from: r */
    public bxwc f91169r = bxxn.f165040b;

    /* renamed from: s */
    public boolean f91170s;

    /* renamed from: t */
    public boolean f91171t;

    /* renamed from: u */
    public long f91172u;

    /* renamed from: v */
    public boolean f91173v;

    /* renamed from: w */
    public long f91174w;

    static {
        atyr atyr = new atyr();
        f91150x = atyr;
        GeneratedMessageLite.m124024a(atyr.class, atyr);
    }

    private atyr() {
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
            return GeneratedMessageLite.m124022a(f91150x, "\u0000\u0017\u0000\u0000\u0001\u001b\u0017\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\t\u0007Ȉ\bȈ\t\u0004\n\u0004\u000b\t\fȈ\u000e\t\u000fȈ\u0010\n\u0011\u0004\u0015\u0007\u0016\u001b\u0017\u0007\u0018\u0007\u0019\u0002\u001a\u0007\u001b\u0002", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", atyn.class, "s", "t", "u", "v", "w"});
        } else if (i2 == 3) {
            return new atyr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f91150x;
            }
            bxxk bxxk = f91151y;
            if (bxxk == null) {
                synchronized (atyr.class) {
                    bxxk = f91151y;
                    if (bxxk == null) {
                        bxxk = new bxve(f91150x);
                        f91151y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
