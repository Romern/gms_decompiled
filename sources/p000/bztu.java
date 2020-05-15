package p000;

/* renamed from: bztu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztu extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bztu f171373a;

    /* renamed from: b */
    private static volatile bxxk f171374b;

    static {
        bztu bztu = new bztu();
        f171373a = bztu;
        GeneratedMessageLite.m124024a(bztu.class, bztu);
    }

    private bztu() {
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
            return GeneratedMessageLite.m124022a(f171373a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bztu();
        }
        if (i2 == 4) {
            return new bxvd(f171373a);
        }
        if (i2 == 5) {
            return f171373a;
        }
        bxxk bxxk = f171374b;
        if (bxxk == null) {
            synchronized (bztu.class) {
                bxxk = f171374b;
                if (bxxk == null) {
                    bxxk = new bxve(f171373a);
                    f171374b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
