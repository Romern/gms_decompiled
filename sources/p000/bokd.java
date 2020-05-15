package p000;

/* renamed from: bokd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bokd f133386e;

    /* renamed from: f */
    private static volatile bxxk f133387f;

    /* renamed from: a */
    public int f133388a;

    /* renamed from: b */
    public int f133389b;

    /* renamed from: c */
    public boka f133390c;

    /* renamed from: d */
    public bokg f133391d;

    static {
        bokd bokd = new bokd();
        f133386e = bokd;
        bxvk.m124024a(bokd.class, bokd);
    }

    private bokd() {
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
            return bxvk.m124022a(f133386e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bokb.f133385a, "c", "d"});
        } else if (i2 == 3) {
            return new bokd();
        } else {
            if (i2 == 4) {
                return new bxvd(f133386e);
            }
            if (i2 == 5) {
                return f133386e;
            }
            bxxk bxxk = f133387f;
            if (bxxk == null) {
                synchronized (bokd.class) {
                    bxxk = f133387f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133386e);
                        f133387f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
