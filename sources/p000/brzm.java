package p000;

/* renamed from: brzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brzm f143756d;

    /* renamed from: e */
    private static volatile bxxk f143757e;

    /* renamed from: a */
    public int f143758a;

    /* renamed from: b */
    public bxwc f143759b = bxxn.f165040b;

    /* renamed from: c */
    public brzl f143760c;

    static {
        brzm brzm = new brzm();
        f143756d = brzm;
        bxvk.m124024a(brzm.class, brzm);
    }

    private brzm() {
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
            return bxvk.m124022a(f143756d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", brzk.class, "c"});
        } else if (i2 == 3) {
            return new brzm();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f143756d;
            }
            bxxk bxxk = f143757e;
            if (bxxk == null) {
                synchronized (brzm.class) {
                    bxxk = f143757e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143756d);
                        f143757e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
