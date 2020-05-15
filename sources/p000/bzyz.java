package p000;

/* renamed from: bzyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzyz f171945e;

    /* renamed from: f */
    private static volatile bxxk f171946f;

    /* renamed from: a */
    public int f171947a;

    /* renamed from: b */
    public bzyw f171948b;

    /* renamed from: c */
    public bzyx f171949c;

    /* renamed from: d */
    public bzzd f171950d;

    static {
        bzyz bzyz = new bzyz();
        f171945e = bzyz;
        bxvk.m124024a(bzyz.class, bzyz);
    }

    private bzyz() {
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
            return bxvk.m124022a(f171945e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzyz();
        } else {
            if (i2 == 4) {
                return new bxvd(f171945e);
            }
            if (i2 == 5) {
                return f171945e;
            }
            bxxk bxxk = f171946f;
            if (bxxk == null) {
                synchronized (bzyz.class) {
                    bxxk = f171946f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171945e);
                        f171946f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
