package p000;

/* renamed from: bzof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzof extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzof f170804a;

    /* renamed from: b */
    private static volatile bxxk f170805b;

    static {
        bzof bzof = new bzof();
        f170804a = bzof;
        GeneratedMessageLite.m124024a(bzof.class, bzof);
    }

    private bzof() {
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
            return GeneratedMessageLite.m124022a(f170804a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzof();
        }
        if (i2 == 4) {
            return new bxvd(f170804a);
        }
        if (i2 == 5) {
            return f170804a;
        }
        bxxk bxxk = f170805b;
        if (bxxk == null) {
            synchronized (bzof.class) {
                bxxk = f170805b;
                if (bxxk == null) {
                    bxxk = new bxve(f170804a);
                    f170805b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
