package p000;

/* renamed from: bolz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolz extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bolz f133605g;

    /* renamed from: h */
    private static volatile bxxk f133606h;

    /* renamed from: a */
    public int f133607a;

    /* renamed from: b */
    public long f133608b;

    /* renamed from: c */
    public boma f133609c;

    /* renamed from: d */
    public bomb f133610d;

    /* renamed from: e */
    public bome f133611e;

    /* renamed from: f */
    public boly f133612f;

    static {
        bolz bolz = new bolz();
        f133605g = bolz;
        GeneratedMessageLite.m124024a(bolz.class, bolz);
    }

    private bolz() {
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
            return GeneratedMessageLite.m124022a(f133605g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0002\u0004\t\u0005\t\u0007\t", new Object[]{"d", "a", "b", "c", "e", "f"});
        } else if (i2 == 3) {
            return new bolz();
        } else {
            if (i2 == 4) {
                return new bxvd(f133605g);
            }
            if (i2 == 5) {
                return f133605g;
            }
            bxxk bxxk = f133606h;
            if (bxxk == null) {
                synchronized (bolz.class) {
                    bxxk = f133606h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133605g);
                        f133606h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
