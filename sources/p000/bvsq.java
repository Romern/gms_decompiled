package p000;

/* renamed from: bvsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsq f157521a;

    /* renamed from: b */
    private static volatile bxxk f157522b;

    static {
        bvsq bvsq = new bvsq();
        f157521a = bvsq;
        GeneratedMessageLite.m124024a(bvsq.class, bvsq);
    }

    private bvsq() {
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
            return GeneratedMessageLite.m124022a(f157521a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsq();
        }
        if (i2 == 4) {
            return new bxvd(f157521a);
        }
        if (i2 == 5) {
            return f157521a;
        }
        bxxk bxxk = f157522b;
        if (bxxk == null) {
            synchronized (bvsq.class) {
                bxxk = f157522b;
                if (bxxk == null) {
                    bxxk = new bxve(f157521a);
                    f157522b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
