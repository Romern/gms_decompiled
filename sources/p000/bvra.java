package p000;

/* renamed from: bvra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvra extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvra f157422a;

    /* renamed from: b */
    private static volatile bxxk f157423b;

    static {
        bvra bvra = new bvra();
        f157422a = bvra;
        GeneratedMessageLite.m124024a(bvra.class, bvra);
    }

    private bvra() {
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
            return GeneratedMessageLite.m124022a(f157422a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvra();
        }
        if (i2 == 4) {
            return new bxvd(f157422a);
        }
        if (i2 == 5) {
            return f157422a;
        }
        bxxk bxxk = f157423b;
        if (bxxk == null) {
            synchronized (bvra.class) {
                bxxk = f157423b;
                if (bxxk == null) {
                    bxxk = new bxve(f157422a);
                    f157423b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
