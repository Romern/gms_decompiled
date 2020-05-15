package p000;

/* renamed from: bqzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzd extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bqzd f142018h;

    /* renamed from: j */
    private static volatile bxxk f142019j;

    /* renamed from: a */
    public int f142020a;

    /* renamed from: b */
    public bqyu f142021b;

    /* renamed from: c */
    public bxwc f142022c = bxxn.f165040b;

    /* renamed from: d */
    public bxtx f142023d = bxtx.f164797b;

    /* renamed from: e */
    public int f142024e;

    /* renamed from: f */
    public String f142025f = "";

    /* renamed from: g */
    public int f142026g;

    /* renamed from: i */
    private byte f142027i = 2;

    static {
        bqzd bqzd = new bqzd();
        f142018h = bqzd;
        bxvk.m124024a(bqzd.class, bqzd);
    }

    private bqzd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142027i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142027i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142018h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဌ\u0002\u0005င\u0004\u0007ဈ\u0003", new Object[]{"a", "b", "c", bqys.class, "d", "e", bqyn.f141966a, "g", "f"});
        } else if (i2 == 3) {
            return new bqzd();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f142018h;
            }
            bxxk bxxk = f142019j;
            if (bxxk == null) {
                synchronized (bqzd.class) {
                    bxxk = f142019j;
                    if (bxxk == null) {
                        bxxk = new bxve(f142018h);
                        f142019j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
