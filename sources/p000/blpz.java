package p000;

/* renamed from: blpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blpz f127308a;

    /* renamed from: b */
    private static volatile bxxk f127309b;

    static {
        blpz blpz = new blpz();
        f127308a = blpz;
        bxvk.m124024a(blpz.class, blpz);
    }

    private blpz() {
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
            return bxvk.m124022a(f127308a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blpz();
        }
        if (i2 == 4) {
            return new bxvd(f127308a);
        }
        if (i2 == 5) {
            return f127308a;
        }
        bxxk bxxk = f127309b;
        if (bxxk == null) {
            synchronized (blpz.class) {
                bxxk = f127309b;
                if (bxxk == null) {
                    bxxk = new bxve(f127308a);
                    f127309b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
