package p000;

/* renamed from: cbdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbdx f176806b;

    /* renamed from: c */
    private static volatile bxxk f176807c;

    /* renamed from: a */
    public bxww f176808a = bxww.f165013b;

    static {
        cbdx cbdx = new cbdx();
        f176806b = cbdx;
        GeneratedMessageLite.m124024a(cbdx.class, cbdx);
    }

    private cbdx() {
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
            return GeneratedMessageLite.m124022a(f176806b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", cbdw.f176805a});
        } else if (i2 == 3) {
            return new cbdx();
        } else {
            if (i2 == 4) {
                return new bxvd(f176806b);
            }
            if (i2 == 5) {
                return f176806b;
            }
            bxxk bxxk = f176807c;
            if (bxxk == null) {
                synchronized (cbdx.class) {
                    bxxk = f176807c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176806b);
                        f176807c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
