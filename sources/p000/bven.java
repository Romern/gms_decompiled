package p000;

/* renamed from: bven */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bven extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bven f155761h;

    /* renamed from: i */
    private static volatile bxxk f155762i;

    /* renamed from: a */
    public int f155763a;

    /* renamed from: b */
    public long f155764b;

    /* renamed from: c */
    public int f155765c;

    /* renamed from: d */
    public long f155766d;

    /* renamed from: e */
    public long f155767e;

    /* renamed from: f */
    public int f155768f;

    /* renamed from: g */
    public int f155769g;

    static {
        bven bven = new bven();
        f155761h = bven;
        bxvk.m124024a(bven.class, bven);
    }

    private bven() {
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
            return bxvk.m124022a(f155761h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", bvii.f156154a, "d", "e", "f", "g", bvih.m121141b()});
        } else if (i2 == 3) {
            return new bven();
        } else {
            if (i2 == 4) {
                return new bxvd(f155761h);
            }
            if (i2 == 5) {
                return f155761h;
            }
            bxxk bxxk = f155762i;
            if (bxxk == null) {
                synchronized (bven.class) {
                    bxxk = f155762i;
                    if (bxxk == null) {
                        bxxk = new bxve(f155761h);
                        f155762i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
