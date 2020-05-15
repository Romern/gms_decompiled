package p000;

/* renamed from: bzkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzkv f170476g;

    /* renamed from: h */
    private static volatile bxxk f170477h;

    /* renamed from: a */
    public int f170478a;

    /* renamed from: b */
    public bzkq f170479b;

    /* renamed from: c */
    public String f170480c = "";

    /* renamed from: d */
    public bzkp f170481d;

    /* renamed from: e */
    public String f170482e = "";

    /* renamed from: f */
    public int f170483f = 1;

    static {
        bzkv bzkv = new bzkv();
        f170476g = bzkv;
        bxvk.m124024a(bzkv.class, bzkv);
    }

    private bzkv() {
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
            return bxvk.m124022a(f170476g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ဉ\u0001\u0005ဈ\u0004\u0006ဌ\u0005", new Object[]{"a", "c", "d", "b", "e", "f", bzkt.f170475a});
        } else if (i2 == 3) {
            return new bzkv();
        } else {
            if (i2 == 4) {
                return new bxvd(f170476g);
            }
            if (i2 == 5) {
                return f170476g;
            }
            bxxk bxxk = f170477h;
            if (bxxk == null) {
                synchronized (bzkv.class) {
                    bxxk = f170477h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170476g);
                        f170477h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
