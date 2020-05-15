package p000;

/* renamed from: bzwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzwr f171665e;

    /* renamed from: f */
    private static volatile bxxk f171666f;

    /* renamed from: a */
    public int f171667a;

    /* renamed from: b */
    public bxtx f171668b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f171669c = bxtx.f164797b;

    /* renamed from: d */
    public float f171670d;

    static {
        bzwr bzwr = new bzwr();
        f171665e = bzwr;
        bxvk.m124024a(bzwr.class, bzwr);
    }

    private bzwr() {
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
            return bxvk.m124022a(f171665e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzwr();
        } else {
            if (i2 == 4) {
                return new bzwq();
            }
            if (i2 == 5) {
                return f171665e;
            }
            bxxk bxxk = f171666f;
            if (bxxk == null) {
                synchronized (bzwr.class) {
                    bxxk = f171666f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171665e);
                        f171666f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
