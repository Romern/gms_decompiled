package p000;

/* renamed from: bzjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjp extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzjp f170324a;

    /* renamed from: b */
    private static volatile bxxk f170325b;

    static {
        bzjp bzjp = new bzjp();
        f170324a = bzjp;
        bxvk.m124024a(bzjp.class, bzjp);
    }

    private bzjp() {
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
            return bxvk.m124022a(f170324a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzjp();
        }
        if (i2 == 4) {
            return new bxvd(f170324a);
        }
        if (i2 == 5) {
            return f170324a;
        }
        bxxk bxxk = f170325b;
        if (bxxk == null) {
            synchronized (bzjp.class) {
                bxxk = f170325b;
                if (bxxk == null) {
                    bxxk = new bxve(f170324a);
                    f170325b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
