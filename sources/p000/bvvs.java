package p000;

/* renamed from: bvvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvs extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvvs f157841a;

    /* renamed from: b */
    private static volatile bxxk f157842b;

    static {
        bvvs bvvs = new bvvs();
        f157841a = bvvs;
        GeneratedMessageLite.m124024a(bvvs.class, bvvs);
    }

    private bvvs() {
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
            return GeneratedMessageLite.m124022a(f157841a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvvs();
        }
        if (i2 == 4) {
            return new bxvd(f157841a);
        }
        if (i2 == 5) {
            return f157841a;
        }
        bxxk bxxk = f157842b;
        if (bxxk == null) {
            synchronized (bvvs.class) {
                bxxk = f157842b;
                if (bxxk == null) {
                    bxxk = new bxve(f157841a);
                    f157842b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
