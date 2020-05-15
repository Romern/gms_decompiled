package p000;

/* renamed from: cane */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cane extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final cane f175337q;

    /* renamed from: r */
    private static volatile bxxk f175338r;

    /* renamed from: a */
    public int f175339a;

    /* renamed from: b */
    public int f175340b;

    /* renamed from: c */
    public String f175341c = "";

    /* renamed from: d */
    public String f175342d = "";

    /* renamed from: e */
    public String f175343e = "";

    /* renamed from: f */
    public boolean f175344f;

    /* renamed from: g */
    public String f175345g = "";

    /* renamed from: h */
    public String f175346h = "";

    /* renamed from: i */
    public String f175347i = "";

    /* renamed from: j */
    public int f175348j = 1;

    /* renamed from: k */
    public String f175349k;

    /* renamed from: l */
    public boolean f175350l;

    /* renamed from: m */
    public String f175351m;

    /* renamed from: n */
    public String f175352n;

    /* renamed from: o */
    public boolean f175353o;

    /* renamed from: p */
    public boolean f175354p;

    static {
        cane cane = new cane();
        f175337q = cane;
        GeneratedMessageLite.m124024a(cane.class, cane);
    }

    private cane() {
        bxvm bxvm = bxvm.f164965b;
        bxxn bxxn = bxxn.f165040b;
        this.f175349k = "";
        this.f175351m = "";
        this.f175352n = "";
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
            return GeneratedMessageLite.m124022a(f175337q, "\u0001\u000e\u0000\u0002\u0001-\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဇ\u0006\u0005ဈ\b\u0006ဈ\u0001\tဈ\u0003\u0012ဈ\r\u0013ဈ\u000e\u0016ဌ\u0012\u001bဈ\u0016\u001dဇ\u0018'ဈ\"(ဈ#*ဇ*-ဇ-", new Object[]{"a", "b", "c", "f", "g", "d", "e", "h", "i", "j", cand.f175336a, "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new cane();
        } else {
            if (i2 == 4) {
                return new bxvd(f175337q);
            }
            if (i2 == 5) {
                return f175337q;
            }
            bxxk bxxk = f175338r;
            if (bxxk == null) {
                synchronized (cane.class) {
                    bxxk = f175338r;
                    if (bxxk == null) {
                        bxxk = new bxve(f175337q);
                        f175338r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
