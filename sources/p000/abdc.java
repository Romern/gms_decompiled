package p000;

/* renamed from: abdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abdc f57065a;

    /* renamed from: b */
    private static volatile bxxk f57066b;

    static {
        abdc abdc = new abdc();
        f57065a = abdc;
        GeneratedMessageLite.m124024a(abdc.class, abdc);
    }

    private abdc() {
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
            return GeneratedMessageLite.m124022a(f57065a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdc();
        }
        if (i2 == 4) {
            return new bxvd(f57065a);
        }
        if (i2 == 5) {
            return f57065a;
        }
        bxxk bxxk = f57066b;
        if (bxxk == null) {
            synchronized (abdc.class) {
                bxxk = f57066b;
                if (bxxk == null) {
                    bxxk = new bxve(f57065a);
                    f57066b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
