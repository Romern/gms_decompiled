package p000;

/* renamed from: cimq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cimq f190764a;

    /* renamed from: b */
    private static volatile bxxk f190765b;

    static {
        cimq cimq = new cimq();
        f190764a = cimq;
        GeneratedMessageLite.m124024a(cimq.class, cimq);
    }

    private cimq() {
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
            return GeneratedMessageLite.m124022a(f190764a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cimq();
        }
        if (i2 == 4) {
            return new bxvd(f190764a);
        }
        if (i2 == 5) {
            return f190764a;
        }
        bxxk bxxk = f190765b;
        if (bxxk == null) {
            synchronized (cimq.class) {
                bxxk = f190765b;
                if (bxxk == null) {
                    bxxk = new bxve(f190764a);
                    f190765b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
