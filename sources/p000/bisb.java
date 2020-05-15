package p000;

/* renamed from: bisb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bisb f121499a;

    /* renamed from: b */
    private static volatile bxxk f121500b;

    static {
        bisb bisb = new bisb();
        f121499a = bisb;
        GeneratedMessageLite.m124024a(bisb.class, bisb);
    }

    private bisb() {
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
            return GeneratedMessageLite.m124022a(f121499a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bisb();
        }
        if (i2 == 4) {
            return new bxvd(f121499a);
        }
        if (i2 == 5) {
            return f121499a;
        }
        bxxk bxxk = f121500b;
        if (bxxk == null) {
            synchronized (bisb.class) {
                bxxk = f121500b;
                if (bxxk == null) {
                    bxxk = new bxve(f121499a);
                    f121500b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
