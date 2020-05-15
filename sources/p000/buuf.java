package p000;

/* renamed from: buuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buuf extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final buuf f154939a;

    /* renamed from: b */
    private static volatile bxxk f154940b;

    static {
        buuf buuf = new buuf();
        f154939a = buuf;
        GeneratedMessageLite.m124024a(buuf.class, buuf);
    }

    private buuf() {
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
            return GeneratedMessageLite.m124022a(f154939a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new buuf();
        }
        if (i2 == 4) {
            return new bxvd(f154939a);
        }
        if (i2 == 5) {
            return f154939a;
        }
        bxxk bxxk = f154940b;
        if (bxxk == null) {
            synchronized (buuf.class) {
                bxxk = f154940b;
                if (bxxk == null) {
                    bxxk = new bxve(f154939a);
                    f154940b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
