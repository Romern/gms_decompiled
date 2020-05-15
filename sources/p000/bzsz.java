package p000;

/* renamed from: bzsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzsz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzsz f171305a;

    /* renamed from: b */
    private static volatile bxxk f171306b;

    static {
        bzsz bzsz = new bzsz();
        f171305a = bzsz;
        GeneratedMessageLite.m124024a(bzsz.class, bzsz);
    }

    private bzsz() {
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
            return GeneratedMessageLite.m124022a(f171305a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzsz();
        }
        if (i2 == 4) {
            return new bxvd(f171305a);
        }
        if (i2 == 5) {
            return f171305a;
        }
        bxxk bxxk = f171306b;
        if (bxxk == null) {
            synchronized (bzsz.class) {
                bxxk = f171306b;
                if (bxxk == null) {
                    bxxk = new bxve(f171305a);
                    f171306b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
