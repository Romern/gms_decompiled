package p000;

/* renamed from: bsrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsrp f146787a;

    /* renamed from: b */
    private static volatile bxxk f146788b;

    static {
        bsrp bsrp = new bsrp();
        f146787a = bsrp;
        GeneratedMessageLite.m124024a(bsrp.class, bsrp);
    }

    private bsrp() {
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
            return GeneratedMessageLite.m124022a(f146787a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsrp();
        }
        if (i2 == 4) {
            return new bxvd(f146787a);
        }
        if (i2 == 5) {
            return f146787a;
        }
        bxxk bxxk = f146788b;
        if (bxxk == null) {
            synchronized (bsrp.class) {
                bxxk = f146788b;
                if (bxxk == null) {
                    bxxk = new bxve(f146787a);
                    f146788b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
