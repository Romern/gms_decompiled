package p000;

/* renamed from: cbku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbku extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbku f177447a;

    /* renamed from: b */
    private static volatile bxxk f177448b;

    static {
        cbku cbku = new cbku();
        f177447a = cbku;
        GeneratedMessageLite.m124024a(cbku.class, cbku);
    }

    private cbku() {
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
            return GeneratedMessageLite.m124022a(f177447a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbku();
        }
        if (i2 == 4) {
            return new bxvd(f177447a);
        }
        if (i2 == 5) {
            return f177447a;
        }
        bxxk bxxk = f177448b;
        if (bxxk == null) {
            synchronized (cbku.class) {
                bxxk = f177448b;
                if (bxxk == null) {
                    bxxk = new bxve(f177447a);
                    f177448b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
