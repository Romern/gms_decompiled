package p000;

/* renamed from: bosr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosr extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bosr f134643f;

    /* renamed from: g */
    private static volatile bxxk f134644g;

    /* renamed from: a */
    public int f134645a;

    /* renamed from: b */
    public boolean f134646b;

    /* renamed from: c */
    public boolean f134647c;

    /* renamed from: d */
    public boolean f134648d;

    /* renamed from: e */
    public bosq f134649e;

    static {
        bosr bosr = new bosr();
        f134643f = bosr;
        bxvk.m124024a(bosr.class, bosr);
    }

    private bosr() {
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
            return bxvk.m124022a(f134643f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bosr();
        } else {
            if (i2 == 4) {
                return new bxvd(f134643f);
            }
            if (i2 == 5) {
                return f134643f;
            }
            bxxk bxxk = f134644g;
            if (bxxk == null) {
                synchronized (bosr.class) {
                    bxxk = f134644g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134643f);
                        f134644g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
