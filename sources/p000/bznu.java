package p000;

/* renamed from: bznu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznu extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bznu f170763a;

    /* renamed from: b */
    private static volatile bxxk f170764b;

    static {
        bznu bznu = new bznu();
        f170763a = bznu;
        GeneratedMessageLite.m124024a(bznu.class, bznu);
    }

    private bznu() {
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
            return GeneratedMessageLite.m124022a(f170763a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bznu();
        }
        if (i2 == 4) {
            return new bxvd(f170763a);
        }
        if (i2 == 5) {
            return f170763a;
        }
        bxxk bxxk = f170764b;
        if (bxxk == null) {
            synchronized (bznu.class) {
                bxxk = f170764b;
                if (bxxk == null) {
                    bxxk = new bxve(f170763a);
                    f170764b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
