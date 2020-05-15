package p000;

/* renamed from: cbix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbix extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbix f177310a;

    /* renamed from: b */
    private static volatile bxxk f177311b;

    static {
        cbix cbix = new cbix();
        f177310a = cbix;
        GeneratedMessageLite.m124024a(cbix.class, cbix);
    }

    private cbix() {
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
            return GeneratedMessageLite.m124022a(f177310a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbix();
        }
        if (i2 == 4) {
            return new bxvd(f177310a);
        }
        if (i2 == 5) {
            return f177310a;
        }
        bxxk bxxk = f177311b;
        if (bxxk == null) {
            synchronized (cbix.class) {
                bxxk = f177311b;
                if (bxxk == null) {
                    bxxk = new bxve(f177310a);
                    f177311b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
