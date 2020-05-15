package p000;

/* renamed from: cbcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbcs f176683b;

    /* renamed from: c */
    private static volatile bxxk f176684c;

    /* renamed from: a */
    public cbct f176685a;

    static {
        cbcs cbcs = new cbcs();
        f176683b = cbcs;
        GeneratedMessageLite.m124024a(cbcs.class, cbcs);
    }

    private cbcs() {
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
            return GeneratedMessageLite.m124022a(f176683b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbcs();
        } else {
            if (i2 == 4) {
                return new bxvd(f176683b);
            }
            if (i2 == 5) {
                return f176683b;
            }
            bxxk bxxk = f176684c;
            if (bxxk == null) {
                synchronized (cbcs.class) {
                    bxxk = f176684c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176683b);
                        f176684c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
