package p000;

/* renamed from: bzop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzop extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzop f170851e;

    /* renamed from: f */
    private static volatile bxxk f170852f;

    /* renamed from: a */
    public bzoa f170853a;

    /* renamed from: b */
    public String f170854b = "";

    /* renamed from: c */
    public bzos f170855c;

    /* renamed from: d */
    public long f170856d;

    static {
        bzop bzop = new bzop();
        f170851e = bzop;
        GeneratedMessageLite.m124024a(bzop.class, bzop);
    }

    private bzop() {
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
            return GeneratedMessageLite.m124022a(f170851e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzop();
        } else {
            if (i2 == 4) {
                return new bxvd(f170851e);
            }
            if (i2 == 5) {
                return f170851e;
            }
            bxxk bxxk = f170852f;
            if (bxxk == null) {
                synchronized (bzop.class) {
                    bxxk = f170852f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170851e);
                        f170852f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
