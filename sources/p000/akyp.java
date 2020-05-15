package p000;

/* renamed from: akyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akyp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final akyp f73128g;

    /* renamed from: h */
    private static volatile bxxk f73129h;

    /* renamed from: a */
    public String f73130a = "";

    /* renamed from: b */
    public String f73131b = "";

    /* renamed from: c */
    public int f73132c;

    /* renamed from: d */
    public int f73133d;

    /* renamed from: e */
    public int f73134e;

    /* renamed from: f */
    public String f73135f = "";

    static {
        akyp akyp = new akyp();
        f73128g = akyp;
        GeneratedMessageLite.m124024a(akyp.class, akyp);
    }

    private akyp() {
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
            return GeneratedMessageLite.m124022a(f73128g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new akyp();
        } else {
            if (i2 == 4) {
                return new bxvd(f73128g);
            }
            if (i2 == 5) {
                return f73128g;
            }
            bxxk bxxk = f73129h;
            if (bxxk == null) {
                synchronized (akyp.class) {
                    bxxk = f73129h;
                    if (bxxk == null) {
                        bxxk = new bxve(f73128g);
                        f73129h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
