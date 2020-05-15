package p000;

/* renamed from: cbay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbay extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbay f176515b;

    /* renamed from: c */
    private static volatile bxxk f176516c;

    /* renamed from: a */
    public int f176517a;

    static {
        cbay cbay = new cbay();
        f176515b = cbay;
        GeneratedMessageLite.m124024a(cbay.class, cbay);
    }

    private cbay() {
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
            return GeneratedMessageLite.m124022a(f176515b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbay();
        } else {
            if (i2 == 4) {
                return new bxvd(f176515b);
            }
            if (i2 == 5) {
                return f176515b;
            }
            bxxk bxxk = f176516c;
            if (bxxk == null) {
                synchronized (cbay.class) {
                    bxxk = f176516c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176515b);
                        f176516c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
