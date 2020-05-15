package p000;

/* renamed from: cagr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cagr f174494c;

    /* renamed from: e */
    private static volatile bxxk f174495e;

    /* renamed from: a */
    public int f174496a;

    /* renamed from: b */
    public int f174497b;

    /* renamed from: d */
    private int f174498d;

    static {
        cagr cagr = new cagr();
        f174494c = cagr;
        bxvk.m124024a(cagr.class, cagr);
    }

    private cagr() {
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
            return bxvk.m124022a(f174494c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", cagp.f174493a});
        } else if (i2 == 3) {
            return new cagr();
        } else {
            if (i2 == 4) {
                return new bxvd(f174494c);
            }
            if (i2 == 5) {
                return f174494c;
            }
            bxxk bxxk = f174495e;
            if (bxxk == null) {
                synchronized (cagr.class) {
                    bxxk = f174495e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174494c);
                        f174495e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
