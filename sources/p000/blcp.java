package p000;

/* renamed from: blcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blcp f125957g;

    /* renamed from: h */
    private static volatile bxxk f125958h;

    /* renamed from: a */
    public int f125959a;

    /* renamed from: b */
    public String f125960b = "";

    /* renamed from: c */
    public String f125961c = "";

    /* renamed from: d */
    public int f125962d;

    /* renamed from: e */
    public bxwc f125963e = bxxn.f165040b;

    /* renamed from: f */
    public int f125964f;

    static {
        blcp blcp = new blcp();
        f125957g = blcp;
        GeneratedMessageLite.m124024a(blcp.class, blcp);
    }

    private blcp() {
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
            return GeneratedMessageLite.m124022a(f125957g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004\u001b\u0005င\u0003", new Object[]{"a", "b", "c", "d", blct.f125987a, "e", blcr.class, "f"});
        } else if (i2 == 3) {
            return new blcp();
        } else {
            if (i2 == 4) {
                return new bxvd(f125957g);
            }
            if (i2 == 5) {
                return f125957g;
            }
            bxxk bxxk = f125958h;
            if (bxxk == null) {
                synchronized (blcp.class) {
                    bxxk = f125958h;
                    if (bxxk == null) {
                        bxxk = new bxve(f125957g);
                        f125958h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
