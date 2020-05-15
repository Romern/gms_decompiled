package p000;

/* renamed from: boqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boqa f134223d;

    /* renamed from: e */
    private static volatile bxxk f134224e;

    /* renamed from: a */
    public int f134225a;

    /* renamed from: b */
    public bqhu f134226b;

    /* renamed from: c */
    public bqhu f134227c;

    static {
        boqa boqa = new boqa();
        f134223d = boqa;
        GeneratedMessageLite.m124024a(boqa.class, boqa);
    }

    private boqa() {
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
            return GeneratedMessageLite.m124022a(f134223d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boqa();
        } else {
            if (i2 == 4) {
                return new bxvd(f134223d);
            }
            if (i2 == 5) {
                return f134223d;
            }
            bxxk bxxk = f134224e;
            if (bxxk == null) {
                synchronized (boqa.class) {
                    bxxk = f134224e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134223d);
                        f134224e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
