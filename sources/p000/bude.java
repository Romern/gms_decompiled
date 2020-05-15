package p000;

/* renamed from: bude */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bude extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bude f153453a;

    /* renamed from: b */
    private static volatile bxxk f153454b;

    static {
        bude bude = new bude();
        f153453a = bude;
        bxvk.m124024a(bude.class, bude);
    }

    private bude() {
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
            return bxvk.m124022a(f153453a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bude();
        }
        if (i2 == 4) {
            return new bxvd(f153453a);
        }
        if (i2 == 5) {
            return f153453a;
        }
        bxxk bxxk = f153454b;
        if (bxxk == null) {
            synchronized (bude.class) {
                bxxk = f153454b;
                if (bxxk == null) {
                    bxxk = new bxve(f153453a);
                    f153454b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
