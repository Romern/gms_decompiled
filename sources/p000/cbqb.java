package p000;

/* renamed from: cbqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqb extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final cbqb f177986o;

    /* renamed from: p */
    private static volatile bxxk f177987p;

    /* renamed from: a */
    public String f177988a = "";

    /* renamed from: b */
    public cbqd f177989b;

    /* renamed from: c */
    public cbqd f177990c;

    /* renamed from: d */
    public cbqd f177991d;

    /* renamed from: e */
    public boolean f177992e;

    /* renamed from: f */
    public String f177993f = "";

    /* renamed from: g */
    public String f177994g = "";

    /* renamed from: h */
    public cbqd f177995h;

    /* renamed from: i */
    public cbqd f177996i;

    /* renamed from: j */
    public cbqd f177997j;

    /* renamed from: k */
    public cbqd f177998k;

    /* renamed from: l */
    public String f177999l = "";

    /* renamed from: m */
    public String f178000m = "";

    /* renamed from: n */
    public String f178001n = "";

    static {
        cbqb cbqb = new cbqb();
        f177986o = cbqb;
        GeneratedMessageLite.m124024a(cbqb.class, cbqb);
    }

    private cbqb() {
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
            return GeneratedMessageLite.m124022a(f177986o, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\t\u0005Ȉ\u0006\t\u0007\t\b\t\t\t\nȈ\u000bȈ\f\u0007\rȈ\u000eȈ", new Object[]{"a", "b", "c", "d", "f", "h", "i", "j", "k", "m", "n", "e", "l", "g"});
        } else if (i2 == 3) {
            return new cbqb();
        } else {
            if (i2 == 4) {
                return new bxvd(f177986o);
            }
            if (i2 == 5) {
                return f177986o;
            }
            bxxk bxxk = f177987p;
            if (bxxk == null) {
                synchronized (cbqb.class) {
                    bxxk = f177987p;
                    if (bxxk == null) {
                        bxxk = new bxve(f177986o);
                        f177987p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
