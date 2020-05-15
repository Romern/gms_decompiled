package p000;

/* renamed from: bzum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzum extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzum f171437a;

    /* renamed from: b */
    private static volatile bxxk f171438b;

    static {
        bzum bzum = new bzum();
        f171437a = bzum;
        GeneratedMessageLite.m124024a(bzum.class, bzum);
    }

    private bzum() {
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
            return GeneratedMessageLite.m124022a(f171437a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzum();
        }
        if (i2 == 4) {
            return new bxvd(f171437a);
        }
        if (i2 == 5) {
            return f171437a;
        }
        bxxk bxxk = f171438b;
        if (bxxk == null) {
            synchronized (bzum.class) {
                bxxk = f171438b;
                if (bxxk == null) {
                    bxxk = new bxve(f171437a);
                    f171438b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
