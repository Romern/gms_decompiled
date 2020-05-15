package p000;

/* renamed from: bzht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzht extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzht f170120a;

    /* renamed from: b */
    private static volatile bxxk f170121b;

    static {
        bzht bzht = new bzht();
        f170120a = bzht;
        GeneratedMessageLite.m124024a(bzht.class, bzht);
    }

    private bzht() {
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
            return GeneratedMessageLite.m124022a(f170120a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzht();
        }
        if (i2 == 4) {
            return new bxvd(f170120a);
        }
        if (i2 == 5) {
            return f170120a;
        }
        bxxk bxxk = f170121b;
        if (bxxk == null) {
            synchronized (bzht.class) {
                bxxk = f170121b;
                if (bxxk == null) {
                    bxxk = new bxve(f170120a);
                    f170121b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
