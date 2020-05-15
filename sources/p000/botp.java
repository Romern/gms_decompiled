package p000;

/* renamed from: botp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final botp f134853c;

    /* renamed from: d */
    private static volatile bxxk f134854d;

    /* renamed from: a */
    public int f134855a = 0;

    /* renamed from: b */
    public Object f134856b;

    static {
        botp botp = new botp();
        f134853c = botp;
        bxvk.m124024a(botp.class, botp);
    }

    private botp() {
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
            return bxvk.m124022a(f134853c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", botn.class, botj.class, botl.class, boto.class});
        } else if (i2 == 3) {
            return new botp();
        } else {
            if (i2 == 4) {
                return new bxvd(f134853c);
            }
            if (i2 == 5) {
                return f134853c;
            }
            bxxk bxxk = f134854d;
            if (bxxk == null) {
                synchronized (botp.class) {
                    bxxk = f134854d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134853c);
                        f134854d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
