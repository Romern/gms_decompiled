package p000;

/* renamed from: bvmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvmt f156788d;

    /* renamed from: e */
    private static volatile bxxk f156789e;

    /* renamed from: a */
    public int f156790a;

    /* renamed from: b */
    public bvov f156791b;

    /* renamed from: c */
    public bxwc f156792c = bxxn.f165040b;

    static {
        bvmt bvmt = new bvmt();
        f156788d = bvmt;
        bxvk.m124024a(bvmt.class, bvmt);
    }

    private bvmt() {
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
            return bxvk.m124022a(f156788d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvmt();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f156788d;
            }
            bxxk bxxk = f156789e;
            if (bxxk == null) {
                synchronized (bvmt.class) {
                    bxxk = f156789e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156788d);
                        f156789e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
