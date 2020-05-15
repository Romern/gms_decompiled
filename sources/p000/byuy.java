package p000;

/* renamed from: byuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byuy f168398b;

    /* renamed from: c */
    private static volatile bxxk f168399c;

    /* renamed from: a */
    public bxwc f168400a = bxxn.f165040b;

    static {
        byuy byuy = new byuy();
        f168398b = byuy;
        GeneratedMessageLite.m124024a(byuy.class, byuy);
    }

    private byuy() {
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
            return GeneratedMessageLite.m124022a(f168398b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byuz.class});
        } else if (i2 == 3) {
            return new byuy();
        } else {
            if (i2 == 4) {
                return new bxvd(f168398b);
            }
            if (i2 == 5) {
                return f168398b;
            }
            bxxk bxxk = f168399c;
            if (bxxk == null) {
                synchronized (byuy.class) {
                    bxxk = f168399c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168398b);
                        f168399c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
