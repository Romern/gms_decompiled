package p000;

/* renamed from: bvfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvfz f155943d;

    /* renamed from: e */
    private static volatile bxxk f155944e;

    /* renamed from: a */
    public int f155945a;

    /* renamed from: b */
    public int f155946b;

    /* renamed from: c */
    public int f155947c;

    static {
        bvfz bvfz = new bvfz();
        f155943d = bvfz;
        bxvk.m124024a(bvfz.class, bvfz);
    }

    private bvfz() {
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
            return bxvk.m124022a(f155943d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bvjs.f156353a, "c", bvjs.f156353a});
        } else if (i2 == 3) {
            return new bvfz();
        } else {
            if (i2 == 4) {
                return new bxvd(f155943d);
            }
            if (i2 == 5) {
                return f155943d;
            }
            bxxk bxxk = f155944e;
            if (bxxk == null) {
                synchronized (bvfz.class) {
                    bxxk = f155944e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155943d);
                        f155944e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
