package p000;

/* renamed from: bvqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqp f157400a;

    /* renamed from: b */
    private static volatile bxxk f157401b;

    static {
        bvqp bvqp = new bvqp();
        f157400a = bvqp;
        GeneratedMessageLite.m124024a(bvqp.class, bvqp);
    }

    private bvqp() {
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
            return GeneratedMessageLite.m124022a(f157400a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqp();
        }
        if (i2 == 4) {
            return new bxvd(f157400a);
        }
        if (i2 == 5) {
            return f157400a;
        }
        bxxk bxxk = f157401b;
        if (bxxk == null) {
            synchronized (bvqp.class) {
                bxxk = f157401b;
                if (bxxk == null) {
                    bxxk = new bxve(f157400a);
                    f157401b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
