package p000;

/* renamed from: bvpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvpr f157339a;

    /* renamed from: b */
    private static volatile bxxk f157340b;

    static {
        bvpr bvpr = new bvpr();
        f157339a = bvpr;
        GeneratedMessageLite.m124024a(bvpr.class, bvpr);
    }

    private bvpr() {
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
            return GeneratedMessageLite.m124022a(f157339a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpr();
        }
        if (i2 == 4) {
            return new bxvd(f157339a);
        }
        if (i2 == 5) {
            return f157339a;
        }
        bxxk bxxk = f157340b;
        if (bxxk == null) {
            synchronized (bvpr.class) {
                bxxk = f157340b;
                if (bxxk == null) {
                    bxxk = new bxve(f157339a);
                    f157340b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
