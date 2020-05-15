package p000;

/* renamed from: byio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byio extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byio f166585a;

    /* renamed from: b */
    private static volatile bxxk f166586b;

    static {
        byio byio = new byio();
        f166585a = byio;
        GeneratedMessageLite.m124024a(byio.class, byio);
    }

    private byio() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f166585a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byio();
        }
        if (i2 == 4) {
            return new bxvd(f166585a);
        }
        if (i2 == 5) {
            return f166585a;
        }
        bxxk bxxk = f166586b;
        if (bxxk == null) {
            synchronized (byio.class) {
                bxxk = f166586b;
                if (bxxk == null) {
                    bxxk = new bxve(f166585a);
                    f166586b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
