package p000;

/* renamed from: bssq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bssq f146906a;

    /* renamed from: b */
    private static volatile bxxk f146907b;

    static {
        bssq bssq = new bssq();
        f146906a = bssq;
        GeneratedMessageLite.m124024a(bssq.class, bssq);
    }

    private bssq() {
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
            return GeneratedMessageLite.m124022a(f146906a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bssq();
        }
        if (i2 == 4) {
            return new bxvd(f146906a);
        }
        if (i2 == 5) {
            return f146906a;
        }
        bxxk bxxk = f146907b;
        if (bxxk == null) {
            synchronized (bssq.class) {
                bxxk = f146907b;
                if (bxxk == null) {
                    bxxk = new bxve(f146906a);
                    f146907b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
