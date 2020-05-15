package p000;

/* renamed from: btcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btcj f148278a;

    /* renamed from: b */
    private static volatile bxxk f148279b;

    static {
        btcj btcj = new btcj();
        f148278a = btcj;
        GeneratedMessageLite.m124024a(btcj.class, btcj);
    }

    private btcj() {
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
            return GeneratedMessageLite.m124022a(f148278a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btcj();
        }
        if (i2 == 4) {
            return new bxvd(f148278a);
        }
        if (i2 == 5) {
            return f148278a;
        }
        bxxk bxxk = f148279b;
        if (bxxk == null) {
            synchronized (btcj.class) {
                bxxk = f148279b;
                if (bxxk == null) {
                    bxxk = new bxve(f148278a);
                    f148279b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
