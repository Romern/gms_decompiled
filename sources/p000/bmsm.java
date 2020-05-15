package p000;

/* renamed from: bmsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmsm f130709d;

    /* renamed from: e */
    private static volatile bxxk f130710e;

    /* renamed from: a */
    public int f130711a;

    /* renamed from: b */
    public bxwc f130712b = bxxn.f165040b;

    /* renamed from: c */
    public bmsh f130713c;

    static {
        bmsm bmsm = new bmsm();
        f130709d = bmsm;
        bxvk.m124024a(bmsm.class, bmsm);
    }

    private bmsm() {
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
            return bxvk.m124022a(f130709d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", bmfr.class, "c"});
        } else if (i2 == 3) {
            return new bmsm();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f130709d;
            }
            bxxk bxxk = f130710e;
            if (bxxk == null) {
                synchronized (bmsm.class) {
                    bxxk = f130710e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130709d);
                        f130710e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
