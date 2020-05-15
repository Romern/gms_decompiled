package p000;

/* renamed from: btwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btwm f152724a;

    /* renamed from: b */
    private static volatile bxxk f152725b;

    static {
        btwm btwm = new btwm();
        f152724a = btwm;
        GeneratedMessageLite.m124024a(btwm.class, btwm);
    }

    private btwm() {
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
            return GeneratedMessageLite.m124022a(f152724a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwm();
        }
        if (i2 == 4) {
            return new bxvd(f152724a);
        }
        if (i2 == 5) {
            return f152724a;
        }
        bxxk bxxk = f152725b;
        if (bxxk == null) {
            synchronized (btwm.class) {
                bxxk = f152725b;
                if (bxxk == null) {
                    bxxk = new bxve(f152724a);
                    f152725b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
