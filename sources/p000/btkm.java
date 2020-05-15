package p000;

/* renamed from: btkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btkm f149274b;

    /* renamed from: c */
    private static volatile bxxk f149275c;

    /* renamed from: a */
    public btkg f149276a;

    static {
        btkm btkm = new btkm();
        f149274b = btkm;
        GeneratedMessageLite.m124024a(btkm.class, btkm);
    }

    private btkm() {
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
            return GeneratedMessageLite.m124022a(f149274b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149274b);
            }
            if (i2 == 5) {
                return f149274b;
            }
            bxxk bxxk = f149275c;
            if (bxxk == null) {
                synchronized (btkm.class) {
                    bxxk = f149275c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149274b);
                        f149275c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
