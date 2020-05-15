package p000;

/* renamed from: cagf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cagf f173089e;

    /* renamed from: f */
    private static volatile bxxk f173090f;

    /* renamed from: a */
    public int f173091a;

    /* renamed from: b */
    public long f173092b;

    /* renamed from: c */
    public long f173093c;

    /* renamed from: d */
    public String f173094d = "";

    static {
        cagf cagf = new cagf();
        f173089e = cagf;
        bxvk.m124024a(cagf.class, cagf);
    }

    private cagf() {
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
            return bxvk.m124022a(f173089e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cagf();
        } else {
            if (i2 == 4) {
                return new bxvd(f173089e);
            }
            if (i2 == 5) {
                return f173089e;
            }
            bxxk bxxk = f173090f;
            if (bxxk == null) {
                synchronized (cagf.class) {
                    bxxk = f173090f;
                    if (bxxk == null) {
                        bxxk = new bxve(f173089e);
                        f173090f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
