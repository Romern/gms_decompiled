package p000;

/* renamed from: bivn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bivn f122019a;

    /* renamed from: b */
    private static volatile bxxk f122020b;

    static {
        bivn bivn = new bivn();
        f122019a = bivn;
        GeneratedMessageLite.m124024a(bivn.class, bivn);
    }

    private bivn() {
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
            return GeneratedMessageLite.m124022a(f122019a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bivn();
        }
        if (i2 == 4) {
            return new bxvd(f122019a);
        }
        if (i2 == 5) {
            return f122019a;
        }
        bxxk bxxk = f122020b;
        if (bxxk == null) {
            synchronized (bivn.class) {
                bxxk = f122020b;
                if (bxxk == null) {
                    bxxk = new bxve(f122019a);
                    f122020b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
