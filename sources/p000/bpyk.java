package p000;

/* renamed from: bpyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpyk f139875a;

    /* renamed from: b */
    private static volatile bxxk f139876b;

    static {
        bpyk bpyk = new bpyk();
        f139875a = bpyk;
        GeneratedMessageLite.m124024a(bpyk.class, bpyk);
    }

    private bpyk() {
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
            return GeneratedMessageLite.m124022a(f139875a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpyk();
        }
        if (i2 == 4) {
            return new bxvd(f139875a);
        }
        if (i2 == 5) {
            return f139875a;
        }
        bxxk bxxk = f139876b;
        if (bxxk == null) {
            synchronized (bpyk.class) {
                bxxk = f139876b;
                if (bxxk == null) {
                    bxxk = new bxve(f139875a);
                    f139876b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
