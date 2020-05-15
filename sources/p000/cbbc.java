package p000;

/* renamed from: cbbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbbc f176528a;

    /* renamed from: b */
    private static volatile bxxk f176529b;

    static {
        cbbc cbbc = new cbbc();
        f176528a = cbbc;
        GeneratedMessageLite.m124024a(cbbc.class, cbbc);
    }

    private cbbc() {
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
            return GeneratedMessageLite.m124022a(f176528a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbbc();
        }
        if (i2 == 4) {
            return new bxvd(f176528a);
        }
        if (i2 == 5) {
            return f176528a;
        }
        bxxk bxxk = f176529b;
        if (bxxk == null) {
            synchronized (cbbc.class) {
                bxxk = f176529b;
                if (bxxk == null) {
                    bxxk = new bxve(f176528a);
                    f176529b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
