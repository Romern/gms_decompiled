package p000;

/* renamed from: bvrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrp f157452a;

    /* renamed from: b */
    private static volatile bxxk f157453b;

    static {
        bvrp bvrp = new bvrp();
        f157452a = bvrp;
        GeneratedMessageLite.m124024a(bvrp.class, bvrp);
    }

    private bvrp() {
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
            return GeneratedMessageLite.m124022a(f157452a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrp();
        }
        if (i2 == 4) {
            return new bxvd(f157452a);
        }
        if (i2 == 5) {
            return f157452a;
        }
        bxxk bxxk = f157453b;
        if (bxxk == null) {
            synchronized (bvrp.class) {
                bxxk = f157453b;
                if (bxxk == null) {
                    bxxk = new bxve(f157452a);
                    f157453b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
