package p000;

/* renamed from: byih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byih extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byih f166564a;

    /* renamed from: b */
    private static volatile bxxk f166565b;

    static {
        byih byih = new byih();
        f166564a = byih;
        GeneratedMessageLite.m124024a(byih.class, byih);
    }

    private byih() {
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
            return GeneratedMessageLite.m124022a(f166564a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byih();
        }
        if (i2 == 4) {
            return new bxvd(f166564a);
        }
        if (i2 == 5) {
            return f166564a;
        }
        bxxk bxxk = f166565b;
        if (bxxk == null) {
            synchronized (byih.class) {
                bxxk = f166565b;
                if (bxxk == null) {
                    bxxk = new bxve(f166564a);
                    f166565b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
