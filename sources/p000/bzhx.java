package p000;

/* renamed from: bzhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzhx f170132a;

    /* renamed from: b */
    private static volatile bxxk f170133b;

    static {
        bzhx bzhx = new bzhx();
        f170132a = bzhx;
        GeneratedMessageLite.m124024a(bzhx.class, bzhx);
    }

    private bzhx() {
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
            return GeneratedMessageLite.m124022a(f170132a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzhx();
        }
        if (i2 == 4) {
            return new bxvd(f170132a);
        }
        if (i2 == 5) {
            return f170132a;
        }
        bxxk bxxk = f170133b;
        if (bxxk == null) {
            synchronized (bzhx.class) {
                bxxk = f170133b;
                if (bxxk == null) {
                    bxxk = new bxve(f170132a);
                    f170133b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
