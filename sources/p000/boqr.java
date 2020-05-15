package p000;

/* renamed from: boqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boqr f134308c;

    /* renamed from: d */
    private static volatile bxxk f134309d;

    /* renamed from: a */
    public int f134310a;

    /* renamed from: b */
    public int f134311b;

    static {
        boqr boqr = new boqr();
        f134308c = boqr;
        GeneratedMessageLite.m124024a(boqr.class, boqr);
    }

    private boqr() {
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
            return GeneratedMessageLite.m124022a(f134308c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", boqq.f134307a});
        } else if (i2 == 3) {
            return new boqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f134308c);
            }
            if (i2 == 5) {
                return f134308c;
            }
            bxxk bxxk = f134309d;
            if (bxxk == null) {
                synchronized (boqr.class) {
                    bxxk = f134309d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134308c);
                        f134309d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
