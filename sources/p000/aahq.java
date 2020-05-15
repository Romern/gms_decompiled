package p000;

/* renamed from: aahq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final aahq f28146a;

    /* renamed from: b */
    private static volatile bxxk f28147b;

    static {
        aahq aahq = new aahq();
        f28146a = aahq;
        GeneratedMessageLite.m124024a(aahq.class, aahq);
    }

    private aahq() {
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
            return GeneratedMessageLite.m124022a(f28146a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new aahq();
        }
        if (i2 == 4) {
            return new bxvd(f28146a);
        }
        if (i2 == 5) {
            return f28146a;
        }
        bxxk bxxk = f28147b;
        if (bxxk == null) {
            synchronized (aahq.class) {
                bxxk = f28147b;
                if (bxxk == null) {
                    bxxk = new bxve(f28146a);
                    f28147b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
