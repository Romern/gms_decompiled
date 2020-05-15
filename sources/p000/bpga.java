package p000;

/* renamed from: bpga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpga extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpga f137467a;

    /* renamed from: b */
    private static volatile bxxk f137468b;

    static {
        bpga bpga = new bpga();
        f137467a = bpga;
        GeneratedMessageLite.m124024a(bpga.class, bpga);
    }

    private bpga() {
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
            return GeneratedMessageLite.m124022a(f137467a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpga();
        }
        if (i2 == 4) {
            return new bxvd(f137467a);
        }
        if (i2 == 5) {
            return f137467a;
        }
        bxxk bxxk = f137468b;
        if (bxxk == null) {
            synchronized (bpga.class) {
                bxxk = f137468b;
                if (bxxk == null) {
                    bxxk = new bxve(f137467a);
                    f137468b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
