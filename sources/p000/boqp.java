package p000;

/* renamed from: boqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boqp f134302d;

    /* renamed from: e */
    private static volatile bxxk f134303e;

    /* renamed from: a */
    public int f134304a;

    /* renamed from: b */
    public int f134305b;

    /* renamed from: c */
    public long f134306c;

    static {
        boqp boqp = new boqp();
        f134302d = boqp;
        GeneratedMessageLite.m124024a(boqp.class, boqp);
    }

    private boqp() {
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
            return GeneratedMessageLite.m124022a(f134302d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bopw.m111435b(), "c"});
        } else if (i2 == 3) {
            return new boqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f134302d);
            }
            if (i2 == 5) {
                return f134302d;
            }
            bxxk bxxk = f134303e;
            if (bxxk == null) {
                synchronized (boqp.class) {
                    bxxk = f134303e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134302d);
                        f134303e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
