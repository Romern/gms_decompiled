package p000;

/* renamed from: bwgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgb extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwgb f159169a;

    /* renamed from: b */
    private static volatile bxxk f159170b;

    static {
        bwgb bwgb = new bwgb();
        f159169a = bwgb;
        GeneratedMessageLite.m124024a(bwgb.class, bwgb);
    }

    private bwgb() {
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
            return GeneratedMessageLite.m124022a(f159169a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwgb();
        }
        if (i2 == 4) {
            return new bxvd(f159169a);
        }
        if (i2 == 5) {
            return f159169a;
        }
        bxxk bxxk = f159170b;
        if (bxxk == null) {
            synchronized (bwgb.class) {
                bxxk = f159170b;
                if (bxxk == null) {
                    bxxk = new bxve(f159169a);
                    f159170b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
