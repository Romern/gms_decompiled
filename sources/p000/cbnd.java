package p000;

/* renamed from: cbnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnd f177719a;

    /* renamed from: b */
    private static volatile bxxk f177720b;

    static {
        cbnd cbnd = new cbnd();
        f177719a = cbnd;
        GeneratedMessageLite.m124024a(cbnd.class, cbnd);
    }

    private cbnd() {
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
            return GeneratedMessageLite.m124022a(f177719a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnd();
        }
        if (i2 == 4) {
            return new bxvd(f177719a);
        }
        if (i2 == 5) {
            return f177719a;
        }
        bxxk bxxk = f177720b;
        if (bxxk == null) {
            synchronized (cbnd.class) {
                bxxk = f177720b;
                if (bxxk == null) {
                    bxxk = new bxve(f177719a);
                    f177720b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
