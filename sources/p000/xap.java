package p000;

/* renamed from: xap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xap extends bxvk implements bxxd {

    /* renamed from: g */
    public static final xap f51804g;

    /* renamed from: h */
    private static volatile bxxk f51805h;

    /* renamed from: a */
    public int f51806a;

    /* renamed from: b */
    public String f51807b = "";

    /* renamed from: c */
    public bxwc f51808c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f51809d = bxvm.f164965b;

    /* renamed from: e */
    public int f51810e;

    /* renamed from: f */
    public String f51811f = "";

    static {
        xap xap = new xap();
        f51804g = xap;
        bxvk.m124024a(xap.class, xap);
    }

    private xap() {
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
            return bxvk.m124022a(f51804g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001e\u0004င\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "c", xao.class, "d", xan.m42568b(), "e", "f"});
        } else if (i2 == 3) {
            return new xap();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f51804g;
            }
            bxxk bxxk = f51805h;
            if (bxxk == null) {
                synchronized (xap.class) {
                    bxxk = f51805h;
                    if (bxxk == null) {
                        bxxk = new bxve(f51804g);
                        f51805h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
