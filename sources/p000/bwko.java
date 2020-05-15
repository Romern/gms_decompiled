package p000;

/* renamed from: bwko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwko extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwko f159993a;

    /* renamed from: b */
    private static volatile bxxk f159994b;

    static {
        bwko bwko = new bwko();
        f159993a = bwko;
        GeneratedMessageLite.m124024a(bwko.class, bwko);
    }

    private bwko() {
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
            return GeneratedMessageLite.m124022a(f159993a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwko();
        }
        if (i2 == 4) {
            return new bxvd(f159993a);
        }
        if (i2 == 5) {
            return f159993a;
        }
        bxxk bxxk = f159994b;
        if (bxxk == null) {
            synchronized (bwko.class) {
                bxxk = f159994b;
                if (bxxk == null) {
                    bxxk = new bxve(f159993a);
                    f159994b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
