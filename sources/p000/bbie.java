package p000;

/* renamed from: bbie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbie extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bbie f102707a;

    /* renamed from: b */
    private static volatile bxxk f102708b;

    static {
        bbie bbie = new bbie();
        f102707a = bbie;
        GeneratedMessageLite.m124024a(bbie.class, bbie);
    }

    private bbie() {
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
            return GeneratedMessageLite.m124022a(f102707a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bbie();
        }
        if (i2 == 4) {
            return new bxvd(f102707a);
        }
        if (i2 == 5) {
            return f102707a;
        }
        bxxk bxxk = f102708b;
        if (bxxk == null) {
            synchronized (bbie.class) {
                bxxk = f102708b;
                if (bxxk == null) {
                    bxxk = new bxve(f102707a);
                    f102708b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
