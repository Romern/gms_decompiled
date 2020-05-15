package p000;

/* renamed from: cbfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbfl f176931c;

    /* renamed from: d */
    private static volatile bxxk f176932d;

    /* renamed from: a */
    public int f176933a;

    /* renamed from: b */
    public long f176934b;

    static {
        cbfl cbfl = new cbfl();
        f176931c = cbfl;
        GeneratedMessageLite.m124024a(cbfl.class, cbfl);
    }

    private cbfl() {
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
            return GeneratedMessageLite.m124022a(f176931c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f176931c);
            }
            if (i2 == 5) {
                return f176931c;
            }
            bxxk bxxk = f176932d;
            if (bxxk == null) {
                synchronized (cbfl.class) {
                    bxxk = f176932d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176931c);
                        f176932d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
