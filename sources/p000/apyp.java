package p000;

/* renamed from: apyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final apyp f85168e;

    /* renamed from: f */
    private static volatile bxxk f85169f;

    /* renamed from: a */
    public int f85170a;

    /* renamed from: b */
    public long f85171b;

    /* renamed from: c */
    public String f85172c = "";

    /* renamed from: d */
    public bxtx f85173d = bxtx.f164797b;

    static {
        apyp apyp = new apyp();
        f85168e = apyp;
        bxvk.m124024a(apyp.class, apyp);
    }

    private apyp() {
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
            return bxvk.m124022a(f85168e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new apyp();
        } else {
            if (i2 == 4) {
                return new bxvd(f85168e);
            }
            if (i2 == 5) {
                return f85168e;
            }
            bxxk bxxk = f85169f;
            if (bxxk == null) {
                synchronized (apyp.class) {
                    bxxk = f85169f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85168e);
                        f85169f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
