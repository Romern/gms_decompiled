package p000;

/* renamed from: cbgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbgb f177008a;

    /* renamed from: b */
    private static volatile bxxk f177009b;

    static {
        cbgb cbgb = new cbgb();
        f177008a = cbgb;
        GeneratedMessageLite.m124024a(cbgb.class, cbgb);
    }

    private cbgb() {
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
            return GeneratedMessageLite.m124022a(f177008a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbgb();
        }
        if (i2 == 4) {
            return new bxvd(f177008a);
        }
        if (i2 == 5) {
            return f177008a;
        }
        bxxk bxxk = f177009b;
        if (bxxk == null) {
            synchronized (cbgb.class) {
                bxxk = f177009b;
                if (bxxk == null) {
                    bxxk = new bxve(f177008a);
                    f177009b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
