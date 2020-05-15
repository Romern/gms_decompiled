package p000;

/* renamed from: bstc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstc extends GeneratedMessageLite implements bxxd {

    /* renamed from: u */
    public static final bstc f146969u;

    /* renamed from: v */
    private static volatile bxxk f146970v;

    /* renamed from: a */
    public String f146971a = "";

    /* renamed from: b */
    public bxwc f146972b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f146973c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f146974d = bxxn.f165040b;

    /* renamed from: e */
    public String f146975e = "";

    /* renamed from: f */
    public int f146976f;

    /* renamed from: g */
    public long f146977g;

    /* renamed from: h */
    public String f146978h = "";

    /* renamed from: i */
    public long f146979i;

    /* renamed from: j */
    public long f146980j;

    /* renamed from: k */
    public String f146981k = "";

    /* renamed from: l */
    public ByteString f146982l = ByteString.f164797b;

    /* renamed from: m */
    public ByteString f146983m = ByteString.f164797b;

    /* renamed from: n */
    public bssy f146984n;

    /* renamed from: o */
    public boolean f146985o;

    /* renamed from: p */
    public bxwc f146986p = bxxn.f165040b;

    /* renamed from: q */
    public bssz f146987q;

    /* renamed from: r */
    public bxwc f146988r = bxxn.f165040b;

    /* renamed from: s */
    public bxwc f146989s = bxxn.f165040b;

    /* renamed from: t */
    public String f146990t = "";

    static {
        bstc bstc = new bstc();
        f146969u = bstc;
        GeneratedMessageLite.m124024a(bstc.class, bstc);
    }

    private bstc() {
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
            return GeneratedMessageLite.m124022a(f146969u, "\u0000\u0014\u0000\u0000\u0001\u0017\u0014\u0000\u0006\u0000\u0001Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006Ȉ\u0007\u0004\b\u0003\nȈ\u000bȈ\f\n\r\n\u000e\t\u000f\u0007\u0010\u001b\u0011\t\u0012\u001b\u0013\u001b\u0014\u0002\u0015Ȉ\u0017\u0002", new Object[]{"a", "b", bssw.class, "c", bsta.class, "d", bstb.class, "e", "f", "g", "h", "k", "l", "m", "n", "o", "p", bstg.class, "q", "r", bssx.class, "s", bstd.class, "i", "t", "j"});
        } else if (i2 == 3) {
            return new bstc();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f146969u;
            }
            bxxk bxxk = f146970v;
            if (bxxk == null) {
                synchronized (bstc.class) {
                    bxxk = f146970v;
                    if (bxxk == null) {
                        bxxk = new bxve(f146969u);
                        f146970v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
