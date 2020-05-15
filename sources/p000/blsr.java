package p000;

/* renamed from: blsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blsr f127614d;

    /* renamed from: f */
    private static volatile bxxk f127615f;

    /* renamed from: a */
    public bxtx f127616a = bxtx.f164797b;

    /* renamed from: b */
    public long f127617b;

    /* renamed from: c */
    public long f127618c;

    /* renamed from: e */
    private int f127619e;

    static {
        blsr blsr = new blsr();
        f127614d = blsr;
        bxvk.m124024a(blsr.class, blsr);
    }

    private blsr() {
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
            return bxvk.m124022a(f127614d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new blsr();
        } else {
            if (i2 == 4) {
                return new bxvd(f127614d);
            }
            if (i2 == 5) {
                return f127614d;
            }
            bxxk bxxk = f127615f;
            if (bxxk == null) {
                synchronized (blsr.class) {
                    bxxk = f127615f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127614d);
                        f127615f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
