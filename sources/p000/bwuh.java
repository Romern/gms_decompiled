package p000;

/* renamed from: bwuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuh extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwuh f161032a;

    /* renamed from: b */
    private static volatile bxxk f161033b;

    static {
        bwuh bwuh = new bwuh();
        f161032a = bwuh;
        bxvk.m124024a(bwuh.class, bwuh);
    }

    private bwuh() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f161032a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwuh();
        }
        if (i2 == 4) {
            return new bxvd(f161032a);
        }
        if (i2 == 5) {
            return f161032a;
        }
        bxxk bxxk = f161033b;
        if (bxxk == null) {
            synchronized (bwuh.class) {
                bxxk = f161033b;
                if (bxxk == null) {
                    bxxk = new bxve(f161032a);
                    f161033b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
