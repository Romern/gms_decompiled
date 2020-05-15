package p000;

/* renamed from: bitv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bitv f121725a;

    /* renamed from: b */
    private static volatile bxxk f121726b;

    static {
        bitv bitv = new bitv();
        f121725a = bitv;
        GeneratedMessageLite.m124024a(bitv.class, bitv);
    }

    private bitv() {
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
            return GeneratedMessageLite.m124022a(f121725a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bitv();
        }
        if (i2 == 4) {
            return new bxvd(f121725a);
        }
        if (i2 == 5) {
            return f121725a;
        }
        bxxk bxxk = f121726b;
        if (bxxk == null) {
            synchronized (bitv.class) {
                bxxk = f121726b;
                if (bxxk == null) {
                    bxxk = new bxve(f121725a);
                    f121726b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
