package p000;

/* renamed from: bves */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bves extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bves f155787c;

    /* renamed from: d */
    private static volatile bxxk f155788d;

    /* renamed from: a */
    public int f155789a;

    /* renamed from: b */
    public int f155790b;

    static {
        bves bves = new bves();
        f155787c = bves;
        bxvk.m124024a(bves.class, bves);
    }

    private bves() {
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
            return bxvk.m124022a(f155787c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bviu.f156295a});
        } else if (i2 == 3) {
            return new bves();
        } else {
            if (i2 == 4) {
                return new bxvd(f155787c);
            }
            if (i2 == 5) {
                return f155787c;
            }
            bxxk bxxk = f155788d;
            if (bxxk == null) {
                synchronized (bves.class) {
                    bxxk = f155788d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155787c);
                        f155788d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
