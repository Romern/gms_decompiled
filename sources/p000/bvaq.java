package p000;

/* renamed from: bvaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvaq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvaq f155504d;

    /* renamed from: e */
    private static volatile bxxk f155505e;

    /* renamed from: a */
    public int f155506a;

    /* renamed from: b */
    public int f155507b;

    /* renamed from: c */
    public String f155508c = "";

    static {
        bvaq bvaq = new bvaq();
        f155504d = bvaq;
        bxvk.m124024a(bvaq.class, bvaq);
    }

    private bvaq() {
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
            return bxvk.m124022a(f155504d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bvar.f155509a, "c"});
        } else if (i2 == 3) {
            return new bvaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f155504d);
            }
            if (i2 == 5) {
                return f155504d;
            }
            bxxk bxxk = f155505e;
            if (bxxk == null) {
                synchronized (bvaq.class) {
                    bxxk = f155505e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155504d);
                        f155505e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
