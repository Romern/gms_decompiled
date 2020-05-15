package p000;

/* renamed from: btcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btcl f148285a;

    /* renamed from: b */
    private static volatile bxxk f148286b;

    static {
        btcl btcl = new btcl();
        f148285a = btcl;
        GeneratedMessageLite.m124024a(btcl.class, btcl);
    }

    private btcl() {
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
            return GeneratedMessageLite.m124022a(f148285a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btcl();
        }
        if (i2 == 4) {
            return new bxvd(f148285a);
        }
        if (i2 == 5) {
            return f148285a;
        }
        bxxk bxxk = f148286b;
        if (bxxk == null) {
            synchronized (btcl.class) {
                bxxk = f148286b;
                if (bxxk == null) {
                    bxxk = new bxve(f148285a);
                    f148286b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
