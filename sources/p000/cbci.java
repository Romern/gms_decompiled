package p000;

/* renamed from: cbci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbci extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbci f176653d;

    /* renamed from: e */
    private static volatile bxxk f176654e;

    /* renamed from: a */
    public cbmo f176655a;

    /* renamed from: b */
    public cbdl f176656b;

    /* renamed from: c */
    public boolean f176657c;

    static {
        cbci cbci = new cbci();
        f176653d = cbci;
        GeneratedMessageLite.m124024a(cbci.class, cbci);
    }

    private cbci() {
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
            return GeneratedMessageLite.m124022a(f176653d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbci();
        } else {
            if (i2 == 4) {
                return new bxvd(f176653d);
            }
            if (i2 == 5) {
                return f176653d;
            }
            bxxk bxxk = f176654e;
            if (bxxk == null) {
                synchronized (cbci.class) {
                    bxxk = f176654e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176653d);
                        f176654e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
