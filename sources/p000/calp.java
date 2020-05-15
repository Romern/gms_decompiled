package p000;

/* renamed from: calp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final calp f175168a;

    /* renamed from: b */
    private static volatile bxxk f175169b;

    static {
        calp calp = new calp();
        f175168a = calp;
        GeneratedMessageLite.m124024a(calp.class, calp);
    }

    private calp() {
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
            return GeneratedMessageLite.m124022a(f175168a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new calp();
        }
        if (i2 == 4) {
            return new bxvd(f175168a);
        }
        if (i2 == 5) {
            return f175168a;
        }
        bxxk bxxk = f175169b;
        if (bxxk == null) {
            synchronized (calp.class) {
                bxxk = f175169b;
                if (bxxk == null) {
                    bxxk = new bxve(f175168a);
                    f175169b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
