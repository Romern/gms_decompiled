package p000;

/* renamed from: bzld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzld extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzld f170511a;

    /* renamed from: b */
    private static volatile bxxk f170512b;

    static {
        bzld bzld = new bzld();
        f170511a = bzld;
        bxvk.m124024a(bzld.class, bzld);
    }

    private bzld() {
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
            return bxvk.m124022a(f170511a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzld();
        }
        if (i2 == 4) {
            return new bxvd(f170511a);
        }
        if (i2 == 5) {
            return f170511a;
        }
        bxxk bxxk = f170512b;
        if (bxxk == null) {
            synchronized (bzld.class) {
                bxxk = f170512b;
                if (bxxk == null) {
                    bxxk = new bxve(f170511a);
                    f170512b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
