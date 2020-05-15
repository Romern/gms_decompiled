package p000;

/* renamed from: cbfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbfq f176953a;

    /* renamed from: b */
    private static volatile bxxk f176954b;

    static {
        cbfq cbfq = new cbfq();
        f176953a = cbfq;
        GeneratedMessageLite.m124024a(cbfq.class, cbfq);
    }

    private cbfq() {
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
            return GeneratedMessageLite.m124022a(f176953a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbfq();
        }
        if (i2 == 4) {
            return new bxvd(f176953a);
        }
        if (i2 == 5) {
            return f176953a;
        }
        bxxk bxxk = f176954b;
        if (bxxk == null) {
            synchronized (cbfq.class) {
                bxxk = f176954b;
                if (bxxk == null) {
                    bxxk = new bxve(f176953a);
                    f176954b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
