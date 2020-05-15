package p000;

/* renamed from: cbrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbrd f178108e;

    /* renamed from: f */
    private static volatile bxxk f178109f;

    /* renamed from: a */
    public String f178110a = "";

    /* renamed from: b */
    public String f178111b = "";

    /* renamed from: c */
    public String f178112c = "";

    /* renamed from: d */
    public int f178113d;

    static {
        cbrd cbrd = new cbrd();
        f178108e = cbrd;
        GeneratedMessageLite.m124024a(cbrd.class, cbrd);
    }

    private cbrd() {
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
            return GeneratedMessageLite.m124022a(f178108e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbrd();
        } else {
            if (i2 == 4) {
                return new bxvd(f178108e);
            }
            if (i2 == 5) {
                return f178108e;
            }
            bxxk bxxk = f178109f;
            if (bxxk == null) {
                synchronized (cbrd.class) {
                    bxxk = f178109f;
                    if (bxxk == null) {
                        bxxk = new bxve(f178108e);
                        f178109f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
