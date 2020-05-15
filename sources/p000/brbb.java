package p000;

/* renamed from: brbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxvu f142220d = new brba();

    /* renamed from: g */
    public static final brbb f142221g;

    /* renamed from: i */
    private static volatile bxxk f142222i;

    /* renamed from: a */
    public bral f142223a;

    /* renamed from: b */
    public boolean f142224b;

    /* renamed from: c */
    public bxvt f142225c = bxvm.f164965b;

    /* renamed from: e */
    public bree f142226e;

    /* renamed from: f */
    public bxtx f142227f = bxtx.f164797b;

    /* renamed from: h */
    private int f142228h;

    static {
        brbb brbb = new brbb();
        f142221g = brbb;
        bxvk.m124024a(brbb.class, brbb);
    }

    private brbb() {
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
            return bxvk.m124022a(f142221g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001e\u0004ဉ\u0002\u0005ည\u0003", new Object[]{"h", "a", "b", "c", brej.m113931b(), "e", "f"});
        } else if (i2 == 3) {
            return new brbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f142221g);
            }
            if (i2 == 5) {
                return f142221g;
            }
            bxxk bxxk = f142222i;
            if (bxxk == null) {
                synchronized (brbb.class) {
                    bxxk = f142222i;
                    if (bxxk == null) {
                        bxxk = new bxve(f142221g);
                        f142222i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
