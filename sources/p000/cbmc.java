package p000;

/* renamed from: cbmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbmc f177601a;

    /* renamed from: b */
    private static volatile bxxk f177602b;

    static {
        cbmc cbmc = new cbmc();
        f177601a = cbmc;
        GeneratedMessageLite.m124024a(cbmc.class, cbmc);
    }

    private cbmc() {
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
            return GeneratedMessageLite.m124022a(f177601a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbmc();
        }
        if (i2 == 4) {
            return new bxvd(f177601a);
        }
        if (i2 == 5) {
            return f177601a;
        }
        bxxk bxxk = f177602b;
        if (bxxk == null) {
            synchronized (cbmc.class) {
                bxxk = f177602b;
                if (bxxk == null) {
                    bxxk = new bxve(f177601a);
                    f177602b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
