package p000;

/* renamed from: bvfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvfp f155898c;

    /* renamed from: d */
    private static volatile bxxk f155899d;

    /* renamed from: a */
    public int f155900a;

    /* renamed from: b */
    public long f155901b;

    static {
        bvfp bvfp = new bvfp();
        f155898c = bvfp;
        bxvk.m124024a(bvfp.class, bvfp);
    }

    private bvfp() {
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
            return bxvk.m124022a(f155898c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvfp();
        } else {
            if (i2 == 4) {
                return new bxvd(f155898c);
            }
            if (i2 == 5) {
                return f155898c;
            }
            bxxk bxxk = f155899d;
            if (bxxk == null) {
                synchronized (bvfp.class) {
                    bxxk = f155899d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155898c);
                        f155899d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
