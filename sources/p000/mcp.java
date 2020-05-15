package p000;

/* renamed from: mcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final mcp f33431g;

    /* renamed from: h */
    private static volatile bxxk f33432h;

    /* renamed from: a */
    public int f33433a;

    /* renamed from: b */
    public bxwc f33434b = bxxn.f165040b;

    /* renamed from: c */
    public int f33435c;

    /* renamed from: d */
    public int f33436d;

    /* renamed from: e */
    public String f33437e = "";

    /* renamed from: f */
    public bxtx f33438f = bxtx.f164797b;

    static {
        mcp mcp = new mcp();
        f33431g = mcp;
        bxvk.m124024a(mcp.class, mcp);
    }

    private mcp() {
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
            return bxvk.m124022a(f33431g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဈ\u0002\u0004ည\u0003\u0005ဌ\u0001", new Object[]{"a", "b", mco.class, "c", mcu.f33452a, "e", "f", "d", mcr.f33444a});
        } else if (i2 == 3) {
            return new mcp();
        } else {
            if (i2 == 4) {
                return new bxvd(f33431g);
            }
            if (i2 == 5) {
                return f33431g;
            }
            bxxk bxxk = f33432h;
            if (bxxk == null) {
                synchronized (mcp.class) {
                    bxxk = f33432h;
                    if (bxxk == null) {
                        bxxk = new bxve(f33431g);
                        f33432h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
