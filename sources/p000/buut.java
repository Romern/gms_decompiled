package p000;

/* renamed from: buut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buut extends bxvk implements bxxd {

    /* renamed from: e */
    public static final buut f154979e;

    /* renamed from: f */
    private static volatile bxxk f154980f;

    /* renamed from: a */
    public int f154981a;

    /* renamed from: b */
    public long f154982b;

    /* renamed from: c */
    public int f154983c;

    /* renamed from: d */
    public long f154984d;

    static {
        buut buut = new buut();
        f154979e = buut;
        bxvk.m124024a(buut.class, buut);
    }

    private buut() {
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
            return bxvk.m124022a(f154979e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", buur.f154978a, "d"});
        } else if (i2 == 3) {
            return new buut();
        } else {
            if (i2 == 4) {
                return new bxvd(f154979e);
            }
            if (i2 == 5) {
                return f154979e;
            }
            bxxk bxxk = f154980f;
            if (bxxk == null) {
                synchronized (buut.class) {
                    bxxk = f154980f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154979e);
                        f154980f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
