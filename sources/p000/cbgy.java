package p000;

/* renamed from: cbgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgy extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbgy f177101a;

    /* renamed from: b */
    private static volatile bxxk f177102b;

    static {
        cbgy cbgy = new cbgy();
        f177101a = cbgy;
        GeneratedMessageLite.m124024a(cbgy.class, cbgy);
    }

    private cbgy() {
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
            return GeneratedMessageLite.m124022a(f177101a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbgy();
        }
        if (i2 == 4) {
            return new bxvd(f177101a);
        }
        if (i2 == 5) {
            return f177101a;
        }
        bxxk bxxk = f177102b;
        if (bxxk == null) {
            synchronized (cbgy.class) {
                bxxk = f177102b;
                if (bxxk == null) {
                    bxxk = new bxve(f177101a);
                    f177102b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
