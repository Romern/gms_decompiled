package p000;

/* renamed from: bosg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bosg f134581e;

    /* renamed from: f */
    private static volatile bxxk f134582f;

    /* renamed from: a */
    public int f134583a;

    /* renamed from: b */
    public int f134584b;

    /* renamed from: c */
    public boolean f134585c;

    /* renamed from: d */
    public boolean f134586d;

    static {
        bosg bosg = new bosg();
        f134581e = bosg;
        bxvk.m124024a(bosg.class, bosg);
    }

    private bosg() {
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
            return bxvk.m124022a(f134581e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", bosf.f134580a, "c", "d"});
        } else if (i2 == 3) {
            return new bosg();
        } else {
            if (i2 == 4) {
                return new bxvd(f134581e);
            }
            if (i2 == 5) {
                return f134581e;
            }
            bxxk bxxk = f134582f;
            if (bxxk == null) {
                synchronized (bosg.class) {
                    bxxk = f134582f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134581e);
                        f134582f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
