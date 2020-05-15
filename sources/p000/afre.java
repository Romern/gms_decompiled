package p000;

/* renamed from: afre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afre extends bxvk implements bxxd {

    /* renamed from: e */
    public static final afre f64610e;

    /* renamed from: f */
    private static volatile bxxk f64611f;

    /* renamed from: a */
    public int f64612a;

    /* renamed from: b */
    public int f64613b = 0;

    /* renamed from: c */
    public Object f64614c;

    /* renamed from: d */
    public int f64615d;

    static {
        afre afre = new afre();
        f64610e = afre;
        bxvk.m124024a(afre.class, afre);
    }

    private afre() {
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
            return bxvk.m124022a(f64610e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", afuh.f64818a, afrc.class, afrd.class});
        } else if (i2 == 3) {
            return new afre();
        } else {
            if (i2 == 4) {
                return new bxvd(f64610e);
            }
            if (i2 == 5) {
                return f64610e;
            }
            bxxk bxxk = f64611f;
            if (bxxk == null) {
                synchronized (afre.class) {
                    bxxk = f64611f;
                    if (bxxk == null) {
                        bxxk = new bxve(f64610e);
                        f64611f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
