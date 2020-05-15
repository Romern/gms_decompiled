package p000;

/* renamed from: bvme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvme extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvme f156645d;

    /* renamed from: e */
    private static volatile bxxk f156646e;

    /* renamed from: a */
    public int f156647a;

    /* renamed from: b */
    public bzrv f156648b;

    /* renamed from: c */
    public bzrv f156649c;

    static {
        bvme bvme = new bvme();
        f156645d = bvme;
        bxvk.m124024a(bvme.class, bvme);
    }

    private bvme() {
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
            return bxvk.m124022a(f156645d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvme();
        } else {
            if (i2 == 4) {
                return new bxvd(f156645d);
            }
            if (i2 == 5) {
                return f156645d;
            }
            bxxk bxxk = f156646e;
            if (bxxk == null) {
                synchronized (bvme.class) {
                    bxxk = f156646e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156645d);
                        f156646e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
