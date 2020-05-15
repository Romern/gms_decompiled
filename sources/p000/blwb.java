package p000;

/* renamed from: blwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blwb f127916a;

    /* renamed from: b */
    private static volatile bxxk f127917b;

    static {
        blwb blwb = new blwb();
        f127916a = blwb;
        GeneratedMessageLite.m124024a(blwb.class, blwb);
    }

    private blwb() {
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
            return GeneratedMessageLite.m124022a(f127916a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blwb();
        }
        if (i2 == 4) {
            return new bxvd(f127916a);
        }
        if (i2 == 5) {
            return f127916a;
        }
        bxxk bxxk = f127917b;
        if (bxxk == null) {
            synchronized (blwb.class) {
                bxxk = f127917b;
                if (bxxk == null) {
                    bxxk = new bxve(f127916a);
                    f127917b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
