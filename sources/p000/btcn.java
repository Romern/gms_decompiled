package p000;

/* renamed from: btcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btcn f148291a;

    /* renamed from: b */
    private static volatile bxxk f148292b;

    static {
        btcn btcn = new btcn();
        f148291a = btcn;
        GeneratedMessageLite.m124024a(btcn.class, btcn);
    }

    private btcn() {
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
            return GeneratedMessageLite.m124022a(f148291a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btcn();
        }
        if (i2 == 4) {
            return new bxvd(f148291a);
        }
        if (i2 == 5) {
            return f148291a;
        }
        bxxk bxxk = f148292b;
        if (bxxk == null) {
            synchronized (btcn.class) {
                bxxk = f148292b;
                if (bxxk == null) {
                    bxxk = new bxve(f148291a);
                    f148292b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
