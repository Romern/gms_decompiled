package p000;

/* renamed from: bybx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bybx f165606a;

    /* renamed from: b */
    private static volatile bxxk f165607b;

    static {
        bybx bybx = new bybx();
        f165606a = bybx;
        GeneratedMessageLite.m124024a(bybx.class, bybx);
    }

    private bybx() {
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
            return GeneratedMessageLite.m124022a(f165606a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bybx();
        }
        if (i2 == 4) {
            return new bxvd(f165606a);
        }
        if (i2 == 5) {
            return f165606a;
        }
        bxxk bxxk = f165607b;
        if (bxxk == null) {
            synchronized (bybx.class) {
                bxxk = f165607b;
                if (bxxk == null) {
                    bxxk = new bxve(f165606a);
                    f165607b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
