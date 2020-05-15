package p000;

/* renamed from: apyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final apyf f85126d;

    /* renamed from: e */
    private static volatile bxxk f85127e;

    /* renamed from: a */
    public int f85128a;

    /* renamed from: b */
    public String f85129b = "";

    /* renamed from: c */
    public bxtx f85130c = bxtx.f164797b;

    static {
        apyf apyf = new apyf();
        f85126d = apyf;
        bxvk.m124024a(apyf.class, apyf);
    }

    private apyf() {
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
            return bxvk.m124022a(f85126d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apyf();
        } else {
            if (i2 == 4) {
                return new bxvd(f85126d);
            }
            if (i2 == 5) {
                return f85126d;
            }
            bxxk bxxk = f85127e;
            if (bxxk == null) {
                synchronized (apyf.class) {
                    bxxk = f85127e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85126d);
                        f85127e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
