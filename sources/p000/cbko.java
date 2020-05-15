package p000;

/* renamed from: cbko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbko extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbko f177429b;

    /* renamed from: c */
    private static volatile bxxk f177430c;

    /* renamed from: a */
    public cbmo f177431a;

    static {
        cbko cbko = new cbko();
        f177429b = cbko;
        GeneratedMessageLite.m124024a(cbko.class, cbko);
    }

    private cbko() {
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
            return GeneratedMessageLite.m124022a(f177429b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbko();
        } else {
            if (i2 == 4) {
                return new bxvd(f177429b);
            }
            if (i2 == 5) {
                return f177429b;
            }
            bxxk bxxk = f177430c;
            if (bxxk == null) {
                synchronized (cbko.class) {
                    bxxk = f177430c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177429b);
                        f177430c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
