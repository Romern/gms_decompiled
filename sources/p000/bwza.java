package p000;

/* renamed from: bwza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwza extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwza f161571a;

    /* renamed from: b */
    private static volatile bxxk f161572b;

    static {
        bwza bwza = new bwza();
        f161571a = bwza;
        GeneratedMessageLite.m124024a(bwza.class, bwza);
    }

    private bwza() {
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
            return GeneratedMessageLite.m124022a(f161571a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwza();
        }
        if (i2 == 4) {
            return new bxvd(f161571a);
        }
        if (i2 == 5) {
            return f161571a;
        }
        bxxk bxxk = f161572b;
        if (bxxk == null) {
            synchronized (bwza.class) {
                bxxk = f161572b;
                if (bxxk == null) {
                    bxxk = new bxve(f161571a);
                    f161572b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
