package p000;

/* renamed from: bvsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsr f157523a;

    /* renamed from: b */
    private static volatile bxxk f157524b;

    static {
        bvsr bvsr = new bvsr();
        f157523a = bvsr;
        GeneratedMessageLite.m124024a(bvsr.class, bvsr);
    }

    private bvsr() {
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
            return GeneratedMessageLite.m124022a(f157523a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsr();
        }
        if (i2 == 4) {
            return new bxvd(f157523a);
        }
        if (i2 == 5) {
            return f157523a;
        }
        bxxk bxxk = f157524b;
        if (bxxk == null) {
            synchronized (bvsr.class) {
                bxxk = f157524b;
                if (bxxk == null) {
                    bxxk = new bxve(f157523a);
                    f157524b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
