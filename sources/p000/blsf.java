package p000;

/* renamed from: blsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blsf f127574d;

    /* renamed from: e */
    private static volatile bxxk f127575e;

    /* renamed from: a */
    public int f127576a;

    /* renamed from: b */
    public bxtx f127577b = bxtx.f164797b;

    /* renamed from: c */
    public int f127578c;

    static {
        blsf blsf = new blsf();
        f127574d = blsf;
        bxvk.m124024a(blsf.class, blsf);
    }

    private blsf() {
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
            return bxvk.m124022a(f127574d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", blsl.f127603a});
        } else if (i2 == 3) {
            return new blsf();
        } else {
            if (i2 == 4) {
                return new bxvd(f127574d);
            }
            if (i2 == 5) {
                return f127574d;
            }
            bxxk bxxk = f127575e;
            if (bxxk == null) {
                synchronized (blsf.class) {
                    bxxk = f127575e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127574d);
                        f127575e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
