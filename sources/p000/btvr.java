package p000;

/* renamed from: btvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btvr f152636a;

    /* renamed from: b */
    private static volatile bxxk f152637b;

    static {
        btvr btvr = new btvr();
        f152636a = btvr;
        GeneratedMessageLite.m124024a(btvr.class, btvr);
    }

    private btvr() {
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
            return GeneratedMessageLite.m124022a(f152636a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvr();
        }
        if (i2 == 4) {
            return new bxvd(f152636a);
        }
        if (i2 == 5) {
            return f152636a;
        }
        bxxk bxxk = f152637b;
        if (bxxk == null) {
            synchronized (btvr.class) {
                bxxk = f152637b;
                if (bxxk == null) {
                    bxxk = new bxve(f152636a);
                    f152637b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
