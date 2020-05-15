package p000;

/* renamed from: bzux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzux extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzux f171482a;

    /* renamed from: b */
    private static volatile bxxk f171483b;

    static {
        bzux bzux = new bzux();
        f171482a = bzux;
        GeneratedMessageLite.m124024a(bzux.class, bzux);
    }

    private bzux() {
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
            return GeneratedMessageLite.m124022a(f171482a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzux();
        }
        if (i2 == 4) {
            return new bxvd(f171482a);
        }
        if (i2 == 5) {
            return f171482a;
        }
        bxxk bxxk = f171483b;
        if (bxxk == null) {
            synchronized (bzux.class) {
                bxxk = f171483b;
                if (bxxk == null) {
                    bxxk = new bxve(f171482a);
                    f171483b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
