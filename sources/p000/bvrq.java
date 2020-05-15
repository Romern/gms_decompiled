package p000;

/* renamed from: bvrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvrq f157454a;

    /* renamed from: b */
    private static volatile bxxk f157455b;

    static {
        bvrq bvrq = new bvrq();
        f157454a = bvrq;
        GeneratedMessageLite.m124024a(bvrq.class, bvrq);
    }

    private bvrq() {
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
            return GeneratedMessageLite.m124022a(f157454a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrq();
        }
        if (i2 == 4) {
            return new bxvd(f157454a);
        }
        if (i2 == 5) {
            return f157454a;
        }
        bxxk bxxk = f157455b;
        if (bxxk == null) {
            synchronized (bvrq.class) {
                bxxk = f157455b;
                if (bxxk == null) {
                    bxxk = new bxve(f157454a);
                    f157455b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
