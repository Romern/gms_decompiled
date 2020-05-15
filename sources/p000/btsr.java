package p000;

/* renamed from: btsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btsr f150257e;

    /* renamed from: f */
    private static volatile bxxk f150258f;

    /* renamed from: a */
    public int f150259a;

    /* renamed from: b */
    public bzvu f150260b;

    /* renamed from: c */
    public String f150261c = "";

    /* renamed from: d */
    public String f150262d = "";

    static {
        btsr btsr = new btsr();
        f150257e = btsr;
        bxvk.m124024a(btsr.class, btsr);
    }

    private btsr() {
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
            return bxvk.m124022a(f150257e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btsr();
        } else {
            if (i2 == 4) {
                return new bxvd(f150257e);
            }
            if (i2 == 5) {
                return f150257e;
            }
            bxxk bxxk = f150258f;
            if (bxxk == null) {
                synchronized (btsr.class) {
                    bxxk = f150258f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150257e);
                        f150258f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
