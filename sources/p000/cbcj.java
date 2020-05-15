package p000;

/* renamed from: cbcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbcj f176658a;

    /* renamed from: b */
    private static volatile bxxk f176659b;

    static {
        cbcj cbcj = new cbcj();
        f176658a = cbcj;
        GeneratedMessageLite.m124024a(cbcj.class, cbcj);
    }

    private cbcj() {
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
            return GeneratedMessageLite.m124022a(f176658a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbcj();
        }
        if (i2 == 4) {
            return new bxvd(f176658a);
        }
        if (i2 == 5) {
            return f176658a;
        }
        bxxk bxxk = f176659b;
        if (bxxk == null) {
            synchronized (cbcj.class) {
                bxxk = f176659b;
                if (bxxk == null) {
                    bxxk = new bxve(f176658a);
                    f176659b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
