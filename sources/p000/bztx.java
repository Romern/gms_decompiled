package p000;

/* renamed from: bztx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bztx f171381a;

    /* renamed from: b */
    private static volatile bxxk f171382b;

    static {
        bztx bztx = new bztx();
        f171381a = bztx;
        GeneratedMessageLite.m124024a(bztx.class, bztx);
    }

    private bztx() {
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
            return GeneratedMessageLite.m124022a(f171381a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bztx();
        }
        if (i2 == 4) {
            return new bxvd(f171381a);
        }
        if (i2 == 5) {
            return f171381a;
        }
        bxxk bxxk = f171382b;
        if (bxxk == null) {
            synchronized (bztx.class) {
                bxxk = f171382b;
                if (bxxk == null) {
                    bxxk = new bxve(f171381a);
                    f171382b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
