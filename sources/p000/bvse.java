package p000;

/* renamed from: bvse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvse extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvse f157482a;

    /* renamed from: b */
    private static volatile bxxk f157483b;

    static {
        bvse bvse = new bvse();
        f157482a = bvse;
        GeneratedMessageLite.m124024a(bvse.class, bvse);
    }

    private bvse() {
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
            return GeneratedMessageLite.m124022a(f157482a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvse();
        }
        if (i2 == 4) {
            return new bxvd(f157482a);
        }
        if (i2 == 5) {
            return f157482a;
        }
        bxxk bxxk = f157483b;
        if (bxxk == null) {
            synchronized (bvse.class) {
                bxxk = f157483b;
                if (bxxk == null) {
                    bxxk = new bxve(f157482a);
                    f157483b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
