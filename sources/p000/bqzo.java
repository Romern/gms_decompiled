package p000;

/* renamed from: bqzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqzo f142071a;

    /* renamed from: b */
    private static volatile bxxk f142072b;

    static {
        bqzo bqzo = new bqzo();
        f142071a = bqzo;
        GeneratedMessageLite.m124024a(bqzo.class, bqzo);
    }

    private bqzo() {
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
            return GeneratedMessageLite.m124022a(f142071a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqzo();
        }
        if (i2 == 4) {
            return new bxvd(f142071a);
        }
        if (i2 == 5) {
            return f142071a;
        }
        bxxk bxxk = f142072b;
        if (bxxk == null) {
            synchronized (bqzo.class) {
                bxxk = f142072b;
                if (bxxk == null) {
                    bxxk = new bxve(f142071a);
                    f142072b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
