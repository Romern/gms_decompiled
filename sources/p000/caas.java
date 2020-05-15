package p000;

/* renamed from: caas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caas extends bxvk implements bxxd {

    /* renamed from: b */
    public static final caas f172369b;

    /* renamed from: d */
    private static volatile bxxk f172370d;

    /* renamed from: a */
    public long f172371a;

    /* renamed from: c */
    private int f172372c;

    static {
        caas caas = new caas();
        f172369b = caas;
        bxvk.m124024a(caas.class, caas);
    }

    private caas() {
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
            return bxvk.m124022a(f172369b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new caas();
        } else {
            if (i2 == 4) {
                return new bxvd(f172369b);
            }
            if (i2 == 5) {
                return f172369b;
            }
            bxxk bxxk = f172370d;
            if (bxxk == null) {
                synchronized (caas.class) {
                    bxxk = f172370d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172369b);
                        f172370d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
