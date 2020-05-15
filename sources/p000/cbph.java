package p000;

/* renamed from: cbph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbph extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final cbph f177913p;

    /* renamed from: q */
    private static volatile bxxk f177914q;

    /* renamed from: a */
    public cbpq f177915a;

    /* renamed from: b */
    public cbps f177916b;

    /* renamed from: c */
    public ByteString f177917c = ByteString.f164797b;

    /* renamed from: d */
    public String f177918d = "";

    /* renamed from: e */
    public cbpo f177919e;

    /* renamed from: f */
    public int f177920f;

    /* renamed from: g */
    public String f177921g = "";

    /* renamed from: h */
    public int f177922h;

    /* renamed from: i */
    public String f177923i = "";

    /* renamed from: j */
    public String f177924j = "";

    /* renamed from: k */
    public bxwc f177925k = bxxn.f165040b;

    /* renamed from: l */
    public int f177926l;

    /* renamed from: m */
    public bxwc f177927m = bxxn.f165040b;

    /* renamed from: n */
    public bxwc f177928n = bxxn.f165040b;

    /* renamed from: o */
    public bxwc f177929o = bxxn.f165040b;

    static {
        cbph cbph = new cbph();
        f177913p = cbph;
        GeneratedMessageLite.m124024a(cbph.class, cbph);
    }

    private cbph() {
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
            return GeneratedMessageLite.m124022a(f177913p, "\u0000\u000f\u0000\u0000\u0001\u0011\u000f\u0000\u0004\u0000\u0001\t\u0002\n\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006\u0004\b\t\t\u001b\u000b\f\f\u001b\r\t\u000e\u001b\u000fȈ\u0010Ȉ\u0011\u001b", new Object[]{"a", "c", "d", "f", "g", "h", "b", "k", cbpu.class, "l", "m", cbpw.class, "e", "n", cbpl.class, "i", "j", "o", cbqf.class});
        } else if (i2 == 3) {
            return new cbph();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177913p;
            }
            bxxk bxxk = f177914q;
            if (bxxk == null) {
                synchronized (cbph.class) {
                    bxxk = f177914q;
                    if (bxxk == null) {
                        bxxk = new bxve(f177913p);
                        f177914q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
