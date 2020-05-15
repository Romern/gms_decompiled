package p000;

/* renamed from: bvsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsd f157480a;

    /* renamed from: b */
    private static volatile bxxk f157481b;

    static {
        bvsd bvsd = new bvsd();
        f157480a = bvsd;
        GeneratedMessageLite.m124024a(bvsd.class, bvsd);
    }

    private bvsd() {
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
            return GeneratedMessageLite.m124022a(f157480a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsd();
        }
        if (i2 == 4) {
            return new bxvd(f157480a);
        }
        if (i2 == 5) {
            return f157480a;
        }
        bxxk bxxk = f157481b;
        if (bxxk == null) {
            synchronized (bvsd.class) {
                bxxk = f157481b;
                if (bxxk == null) {
                    bxxk = new bxve(f157480a);
                    f157481b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
