package p000;

/* renamed from: bpgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpgg f137487a;

    /* renamed from: b */
    private static volatile bxxk f137488b;

    static {
        bpgg bpgg = new bpgg();
        f137487a = bpgg;
        GeneratedMessageLite.m124024a(bpgg.class, bpgg);
    }

    private bpgg() {
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
            return GeneratedMessageLite.m124022a(f137487a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpgg();
        }
        if (i2 == 4) {
            return new bxvd(f137487a);
        }
        if (i2 == 5) {
            return f137487a;
        }
        bxxk bxxk = f137488b;
        if (bxxk == null) {
            synchronized (bpgg.class) {
                bxxk = f137488b;
                if (bxxk == null) {
                    bxxk = new bxve(f137487a);
                    f137488b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
