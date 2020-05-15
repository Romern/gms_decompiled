package p000;

/* renamed from: bufe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufe extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bufe f153679f;

    /* renamed from: g */
    private static volatile bxxk f153680g;

    /* renamed from: a */
    public int f153681a;

    /* renamed from: b */
    public int f153682b;

    /* renamed from: c */
    public int f153683c;

    /* renamed from: d */
    public int f153684d;

    /* renamed from: e */
    public boolean f153685e;

    static {
        bufe bufe = new bufe();
        f153679f = bufe;
        bxvk.m124024a(bufe.class, bufe);
    }

    private bufe() {
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
            return bxvk.m124022a(f153679f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဋ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", bufc.f153678a, "c", bufa.f153677a, "d", "e"});
        } else if (i2 == 3) {
            return new bufe();
        } else {
            if (i2 == 4) {
                return new bxvd(f153679f);
            }
            if (i2 == 5) {
                return f153679f;
            }
            bxxk bxxk = f153680g;
            if (bxxk == null) {
                synchronized (bufe.class) {
                    bxxk = f153680g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153679f);
                        f153680g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
