package p000;

/* renamed from: bzio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzio extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzio f170216a;

    /* renamed from: b */
    private static volatile bxxk f170217b;

    static {
        bzio bzio = new bzio();
        f170216a = bzio;
        bxvk.m124024a(bzio.class, bzio);
    }

    private bzio() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f170216a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzio();
        }
        if (i2 == 4) {
            return new bxvd(f170216a);
        }
        if (i2 == 5) {
            return f170216a;
        }
        bxxk bxxk = f170217b;
        if (bxxk == null) {
            synchronized (bzio.class) {
                bxxk = f170217b;
                if (bxxk == null) {
                    bxxk = new bxve(f170216a);
                    f170217b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
