package p000;

/* renamed from: cbcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbcc f176640a;

    /* renamed from: b */
    private static volatile bxxk f176641b;

    static {
        cbcc cbcc = new cbcc();
        f176640a = cbcc;
        GeneratedMessageLite.m124024a(cbcc.class, cbcc);
    }

    private cbcc() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f176640a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbcc();
        }
        if (i2 == 4) {
            return new bxvd(f176640a);
        }
        if (i2 == 5) {
            return f176640a;
        }
        bxxk bxxk = f176641b;
        if (bxxk == null) {
            synchronized (cbcc.class) {
                bxxk = f176641b;
                if (bxxk == null) {
                    bxxk = new bxve(f176640a);
                    f176641b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
