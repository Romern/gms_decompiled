package p000;

/* renamed from: cbil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbil extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cbil f177257h;

    /* renamed from: i */
    private static volatile bxxk f177258i;

    /* renamed from: a */
    public int f177259a = 0;

    /* renamed from: b */
    public Object f177260b;

    /* renamed from: c */
    public int f177261c;

    /* renamed from: d */
    public bxte f177262d;

    /* renamed from: e */
    public String f177263e;

    /* renamed from: f */
    public long f177264f;

    /* renamed from: g */
    public cbig f177265g;

    static {
        cbil cbil = new cbil();
        f177257h = cbil;
        bxvk.m124024a(cbil.class, cbil);
    }

    private cbil() {
        bxxn bxxn = bxxn.f165040b;
        this.f177263e = "";
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
            return bxvk.m124022a(f177257h, "\u0000\u000f\u0001\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007\t\b\f\tȈ\u000b<\u0000\f\u0002\r<\u0000\u000e\t\u000f<\u0000\u0010<\u0000", new Object[]{"b", "a", cbiv.class, cbin.class, cbmh.class, cbix.class, cbir.class, cbih.class, "d", "c", "e", cbmp.class, "f", cbiu.class, "g", cbiy.class, cbhw.class});
        } else if (i2 == 3) {
            return new cbil();
        } else {
            if (i2 == 4) {
                return new bxvd(f177257h);
            }
            if (i2 == 5) {
                return f177257h;
            }
            bxxk bxxk = f177258i;
            if (bxxk == null) {
                synchronized (cbil.class) {
                    bxxk = f177258i;
                    if (bxxk == null) {
                        bxxk = new bxve(f177257h);
                        f177258i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
