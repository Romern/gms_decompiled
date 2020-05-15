package p000;

/* renamed from: bqkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bqkp f141022g;

    /* renamed from: h */
    private static volatile bxxk f141023h;

    /* renamed from: a */
    public int f141024a;

    /* renamed from: b */
    public boolean f141025b;

    /* renamed from: c */
    public String f141026c = "";

    /* renamed from: d */
    public bxwc f141027d = bxxn.f165040b;

    /* renamed from: e */
    public String f141028e = "";

    /* renamed from: f */
    public bxtx f141029f = bxtx.f164797b;

    static {
        bqkp bqkp = new bqkp();
        f141022g = bqkp;
        bxvk.m124024a(bqkp.class, bqkp);
    }

    private bqkp() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f141022g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002ဇ\u0000\u0003ဈ\u0001\u0004\u001c\u0005ဈ\u0002\u0006ည\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bqkp();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f141022g;
            }
            bxxk bxxk = f141023h;
            if (bxxk == null) {
                synchronized (bqkp.class) {
                    bxxk = f141023h;
                    if (bxxk == null) {
                        bxxk = new bxve(f141022g);
                        f141023h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
