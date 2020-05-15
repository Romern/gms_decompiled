package p000;

/* renamed from: cbcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbcn f176673a;

    /* renamed from: b */
    private static volatile bxxk f176674b;

    static {
        cbcn cbcn = new cbcn();
        f176673a = cbcn;
        GeneratedMessageLite.m124024a(cbcn.class, cbcn);
    }

    private cbcn() {
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
            return GeneratedMessageLite.m124022a(f176673a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbcn();
        }
        if (i2 == 4) {
            return new bxvd(f176673a);
        }
        if (i2 == 5) {
            return f176673a;
        }
        bxxk bxxk = f176674b;
        if (bxxk == null) {
            synchronized (cbcn.class) {
                bxxk = f176674b;
                if (bxxk == null) {
                    bxxk = new bxve(f176673a);
                    f176674b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
