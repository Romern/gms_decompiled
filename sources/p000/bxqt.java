package p000;

/* renamed from: bxqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bxqt f164428a;

    /* renamed from: b */
    private static volatile bxxk f164429b;

    static {
        bxqt bxqt = new bxqt();
        f164428a = bxqt;
        GeneratedMessageLite.m124024a(bxqt.class, bxqt);
    }

    private bxqt() {
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
            return GeneratedMessageLite.m124022a(f164428a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxqt();
        }
        if (i2 == 4) {
            return new bxvd(f164428a);
        }
        if (i2 == 5) {
            return f164428a;
        }
        bxxk bxxk = f164429b;
        if (bxxk == null) {
            synchronized (bxqt.class) {
                bxxk = f164429b;
                if (bxxk == null) {
                    bxxk = new bxve(f164428a);
                    f164429b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
