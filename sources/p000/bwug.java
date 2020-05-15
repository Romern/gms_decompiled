package p000;

/* renamed from: bwug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwug extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwug f161030a;

    /* renamed from: b */
    private static volatile bxxk f161031b;

    static {
        bwug bwug = new bwug();
        f161030a = bwug;
        GeneratedMessageLite.m124024a(bwug.class, bwug);
    }

    private bwug() {
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
            return GeneratedMessageLite.m124022a(f161030a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwug();
        }
        if (i2 == 4) {
            return new bxvd(f161030a);
        }
        if (i2 == 5) {
            return f161030a;
        }
        bxxk bxxk = f161031b;
        if (bxxk == null) {
            synchronized (bwug.class) {
                bxxk = f161031b;
                if (bxxk == null) {
                    bxxk = new bxve(f161030a);
                    f161031b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
