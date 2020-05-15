package p000;

/* renamed from: lap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lap extends bxvk implements bxxd {

    /* renamed from: g */
    public static final lap f25588g;

    /* renamed from: h */
    private static volatile bxxk f25589h;

    /* renamed from: a */
    public long f25590a;

    /* renamed from: b */
    public bxwc f25591b = bxxn.f165040b;

    /* renamed from: c */
    public int f25592c;

    /* renamed from: d */
    public int f25593d;

    /* renamed from: e */
    public kzz f25594e;

    /* renamed from: f */
    public bxwc f25595f = bxxn.f165040b;

    static {
        lap lap = new lap();
        f25588g = lap;
        bxvk.m124024a(lap.class, lap);
    }

    private lap() {
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
            return bxvk.m124022a(f25588g, "\u0000\u0006\u0000\u0000\u0003\t\u0006\u0000\u0002\u0000\u0003\u0002\u0004\u001b\u0006\u0004\u0007\f\b\t\t\u001b", new Object[]{"a", "b", lbf.class, "c", "d", "e", "f", lao.class});
        } else if (i2 == 3) {
            return new lap();
        } else {
            if (i2 == 4) {
                return new bxvd(f25588g);
            }
            if (i2 == 5) {
                return f25588g;
            }
            bxxk bxxk = f25589h;
            if (bxxk == null) {
                synchronized (lap.class) {
                    bxxk = f25589h;
                    if (bxxk == null) {
                        bxxk = new bxve(f25588g);
                        f25589h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
