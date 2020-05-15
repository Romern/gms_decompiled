package p000;

/* renamed from: btsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btsg f150200e;

    /* renamed from: f */
    private static volatile bxxk f150201f;

    /* renamed from: a */
    public int f150202a;

    /* renamed from: b */
    public long f150203b;

    /* renamed from: c */
    public long f150204c;

    /* renamed from: d */
    public bxtx f150205d = bxtx.f164797b;

    static {
        btsg btsg = new btsg();
        f150200e = btsg;
        bxvk.m124024a(btsg.class, btsg);
    }

    private btsg() {
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
            return bxvk.m124022a(f150200e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ည\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btsg();
        } else {
            if (i2 == 4) {
                return new bxvd(f150200e);
            }
            if (i2 == 5) {
                return f150200e;
            }
            bxxk bxxk = f150201f;
            if (bxxk == null) {
                synchronized (btsg.class) {
                    bxxk = f150201f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150200e);
                        f150201f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
