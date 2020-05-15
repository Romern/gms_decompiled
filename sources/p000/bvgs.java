package p000;

/* renamed from: bvgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgs extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvgs f156039a;

    /* renamed from: b */
    private static volatile bxxk f156040b;

    static {
        bvgs bvgs = new bvgs();
        f156039a = bvgs;
        GeneratedMessageLite.m124024a(bvgs.class, bvgs);
    }

    private bvgs() {
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
            return GeneratedMessageLite.m124022a(f156039a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvgs();
        }
        if (i2 == 4) {
            return new bxvd(f156039a);
        }
        if (i2 == 5) {
            return f156039a;
        }
        bxxk bxxk = f156040b;
        if (bxxk == null) {
            synchronized (bvgs.class) {
                bxxk = f156040b;
                if (bxxk == null) {
                    bxxk = new bxve(f156039a);
                    f156040b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
