package p000;

/* renamed from: bpfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpfx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpfx f137459a;

    /* renamed from: b */
    private static volatile bxxk f137460b;

    static {
        bpfx bpfx = new bpfx();
        f137459a = bpfx;
        GeneratedMessageLite.m124024a(bpfx.class, bpfx);
    }

    private bpfx() {
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
            return GeneratedMessageLite.m124022a(f137459a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpfx();
        }
        if (i2 == 4) {
            return new bxvd(f137459a);
        }
        if (i2 == 5) {
            return f137459a;
        }
        bxxk bxxk = f137460b;
        if (bxxk == null) {
            synchronized (bpfx.class) {
                bxxk = f137460b;
                if (bxxk == null) {
                    bxxk = new bxve(f137459a);
                    f137460b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
