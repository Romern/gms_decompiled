package p000;

/* renamed from: blxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blxf f128047c;

    /* renamed from: e */
    private static volatile bxxk f128048e;

    /* renamed from: a */
    public String f128049a = "";

    /* renamed from: b */
    public bxwc f128050b = bxxn.f165040b;

    /* renamed from: d */
    private int f128051d;

    static {
        blxf blxf = new blxf();
        f128047c = blxf;
        bxvk.m124024a(blxf.class, blxf);
    }

    private blxf() {
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
            return bxvk.m124022a(f128047c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0001\u0002\u001b", new Object[]{"d", "a", "b", blxg.class});
        } else if (i2 == 3) {
            return new blxf();
        } else {
            if (i2 == 4) {
                return new bxvd(f128047c);
            }
            if (i2 == 5) {
                return f128047c;
            }
            bxxk bxxk = f128048e;
            if (bxxk == null) {
                synchronized (blxf.class) {
                    bxxk = f128048e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128047c);
                        f128048e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
