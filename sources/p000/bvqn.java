package p000;

/* renamed from: bvqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqn f157396a;

    /* renamed from: b */
    private static volatile bxxk f157397b;

    static {
        bvqn bvqn = new bvqn();
        f157396a = bvqn;
        GeneratedMessageLite.m124024a(bvqn.class, bvqn);
    }

    private bvqn() {
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
            return GeneratedMessageLite.m124022a(f157396a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqn();
        }
        if (i2 == 4) {
            return new bxvd(f157396a);
        }
        if (i2 == 5) {
            return f157396a;
        }
        bxxk bxxk = f157397b;
        if (bxxk == null) {
            synchronized (bvqn.class) {
                bxxk = f157397b;
                if (bxxk == null) {
                    bxxk = new bxve(f157396a);
                    f157397b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
