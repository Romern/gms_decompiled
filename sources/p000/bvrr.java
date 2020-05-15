package p000;

/* renamed from: bvrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrr f157456a;

    /* renamed from: b */
    private static volatile bxxk f157457b;

    static {
        bvrr bvrr = new bvrr();
        f157456a = bvrr;
        GeneratedMessageLite.m124024a(bvrr.class, bvrr);
    }

    private bvrr() {
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
            return GeneratedMessageLite.m124022a(f157456a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrr();
        }
        if (i2 == 4) {
            return new bxvd(f157456a);
        }
        if (i2 == 5) {
            return f157456a;
        }
        bxxk bxxk = f157457b;
        if (bxxk == null) {
            synchronized (bvrr.class) {
                bxxk = f157457b;
                if (bxxk == null) {
                    bxxk = new bxve(f157456a);
                    f157457b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
