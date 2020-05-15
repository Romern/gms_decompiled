package p000;

/* renamed from: bmhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhy extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final bxvu f129500o = new bmhv();

    /* renamed from: q */
    public static final bxvu f129501q = new bmhw();

    /* renamed from: s */
    public static final bxvu f129502s = new bmhx();

    /* renamed from: u */
    public static final bmhy f129503u;

    /* renamed from: v */
    private static volatile bxxk f129504v;

    /* renamed from: a */
    public int f129505a;

    /* renamed from: b */
    public bmdn f129506b;

    /* renamed from: c */
    public bxwc f129507c = bxxn.f165040b;

    /* renamed from: d */
    public String f129508d = "";

    /* renamed from: e */
    public String f129509e = "";

    /* renamed from: f */
    public bxwc f129510f = bxxn.f165040b;

    /* renamed from: g */
    public bmbr f129511g;

    /* renamed from: h */
    public bmia f129512h;

    /* renamed from: i */
    public bmjh f129513i;

    /* renamed from: j */
    public int f129514j;

    /* renamed from: k */
    public int f129515k;

    /* renamed from: l */
    public int f129516l;

    /* renamed from: m */
    public int f129517m;

    /* renamed from: n */
    public bxvt f129518n = bxvm.f164965b;

    /* renamed from: p */
    public bxvt f129519p = bxvm.f164965b;

    /* renamed from: r */
    public bxvt f129520r = bxvm.f164965b;

    /* renamed from: t */
    public bxwc f129521t = bxxn.f165040b;

    static {
        bmhy bmhy = new bmhy();
        f129503u = bmhy;
        GeneratedMessageLite.m124024a(bmhy.class, bmhy);
    }

    private bmhy() {
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
            return GeneratedMessageLite.m124022a(f129503u, "\u0001\u0010\u0000\u0001\u0002\u0017\u0010\u0000\u0006\u0000\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0006\u001b\u0007\u001b\bင\u0006\tင\u0007\nင\b\u000bင\t\u000f\u001e\u0010\u001e\u0012ဉ\u0000\u0013ဈ\u0001\u0014ဈ\u0002\u0015,\u0017\u001b", new Object[]{"a", "g", "h", "i", "c", bmhu.class, "f", bmhs.class, "j", "k", "l", "m", "n", bmld.m108139b(), "p", bmnz.m108218b(), "b", "d", "e", "r", bmlx.m108161b(), "t", bwhj.class});
        } else if (i2 == 3) {
            return new bmhy();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f129503u;
            }
            bxxk bxxk = f129504v;
            if (bxxk == null) {
                synchronized (bmhy.class) {
                    bxxk = f129504v;
                    if (bxxk == null) {
                        bxxk = new bxve(f129503u);
                        f129504v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
