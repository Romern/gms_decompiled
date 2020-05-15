package p000;

/* renamed from: bvfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvfy f155938d;

    /* renamed from: e */
    private static volatile bxxk f155939e;

    /* renamed from: a */
    public int f155940a;

    /* renamed from: b */
    public int f155941b;

    /* renamed from: c */
    public int f155942c;

    static {
        bvfy bvfy = new bvfy();
        f155938d = bvfy;
        bxvk.m124024a(bvfy.class, bvfy);
    }

    private bvfy() {
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
            return bxvk.m124022a(f155938d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bvjf.f156341a, "c", bvjf.f156341a});
        } else if (i2 == 3) {
            return new bvfy();
        } else {
            if (i2 == 4) {
                return new bxvd(f155938d);
            }
            if (i2 == 5) {
                return f155938d;
            }
            bxxk bxxk = f155939e;
            if (bxxk == null) {
                synchronized (bvfy.class) {
                    bxxk = f155939e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155938d);
                        f155939e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
