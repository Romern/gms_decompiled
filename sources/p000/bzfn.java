package p000;

/* renamed from: bzfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfn extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzfn f169836g;

    /* renamed from: h */
    private static volatile bxxk f169837h;

    /* renamed from: a */
    public int f169838a;

    /* renamed from: b */
    public String f169839b = "";

    /* renamed from: c */
    public String f169840c = "";

    /* renamed from: d */
    public String f169841d = "";

    /* renamed from: e */
    public long f169842e;

    /* renamed from: f */
    public bxwc f169843f = bxxn.f165040b;

    static {
        bzfn bzfn = new bzfn();
        f169836g = bzfn;
        GeneratedMessageLite.m124024a(bzfn.class, bzfn);
    }

    private bzfn() {
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
            return GeneratedMessageLite.m124022a(f169836g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bzfl.class});
        } else if (i2 == 3) {
            return new bzfn();
        } else {
            if (i2 == 4) {
                return new bxvd(f169836g);
            }
            if (i2 == 5) {
                return f169836g;
            }
            bxxk bxxk = f169837h;
            if (bxxk == null) {
                synchronized (bzfn.class) {
                    bxxk = f169837h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169836g);
                        f169837h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
