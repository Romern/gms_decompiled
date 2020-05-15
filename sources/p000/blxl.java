package p000;

/* renamed from: blxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxl extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blxl f128074f;

    /* renamed from: g */
    private static volatile bxxk f128075g;

    /* renamed from: a */
    public int f128076a;

    /* renamed from: b */
    public int f128077b = 0;

    /* renamed from: c */
    public Object f128078c;

    /* renamed from: d */
    public int f128079d;

    /* renamed from: e */
    public bwiv f128080e;

    static {
        blxl blxl = new blxl();
        f128074f = blxl;
        bxvk.m124024a(blxl.class, blxl);
    }

    private blxl() {
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
            return bxvk.m124022a(f128074f, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ွ\u0000\u0003ွ\u0000\u0004ျ\u0000\u0007ဉ\u0006\bွ\u0000", new Object[]{"c", "b", "a", "d", blxj.f128073a, "e"});
        } else if (i2 == 3) {
            return new blxl();
        } else {
            if (i2 == 4) {
                return new bxvd(f128074f);
            }
            if (i2 == 5) {
                return f128074f;
            }
            bxxk bxxk = f128075g;
            if (bxxk == null) {
                synchronized (blxl.class) {
                    bxxk = f128075g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128074f);
                        f128075g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
