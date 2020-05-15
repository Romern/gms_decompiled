package p000;

/* renamed from: calr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final calr f175172a;

    /* renamed from: b */
    private static volatile bxxk f175173b;

    static {
        calr calr = new calr();
        f175172a = calr;
        GeneratedMessageLite.m124024a(calr.class, calr);
    }

    private calr() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f175172a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new calr();
        }
        if (i2 == 4) {
            return new bxvd(f175172a);
        }
        if (i2 == 5) {
            return f175172a;
        }
        bxxk bxxk = f175173b;
        if (bxxk == null) {
            synchronized (calr.class) {
                bxxk = f175173b;
                if (bxxk == null) {
                    bxxk = new bxve(f175172a);
                    f175173b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
