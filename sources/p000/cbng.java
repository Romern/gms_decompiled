package p000;

/* renamed from: cbng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbng extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbng f177727a;

    /* renamed from: b */
    private static volatile bxxk f177728b;

    static {
        cbng cbng = new cbng();
        f177727a = cbng;
        GeneratedMessageLite.m124024a(cbng.class, cbng);
    }

    private cbng() {
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
            return GeneratedMessageLite.m124022a(f177727a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbng();
        }
        if (i2 == 4) {
            return new bxvd(f177727a);
        }
        if (i2 == 5) {
            return f177727a;
        }
        bxxk bxxk = f177728b;
        if (bxxk == null) {
            synchronized (cbng.class) {
                bxxk = f177728b;
                if (bxxk == null) {
                    bxxk = new bxve(f177727a);
                    f177728b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
