package p000;

/* renamed from: cboi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboi extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cboi f177819b;

    /* renamed from: c */
    private static volatile bxxk f177820c;

    /* renamed from: a */
    public cbos f177821a;

    static {
        cboi cboi = new cboi();
        f177819b = cboi;
        GeneratedMessageLite.m124024a(cboi.class, cboi);
    }

    private cboi() {
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
            return GeneratedMessageLite.m124022a(f177819b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cboi();
        } else {
            if (i2 == 4) {
                return new bxvd(f177819b);
            }
            if (i2 == 5) {
                return f177819b;
            }
            bxxk bxxk = f177820c;
            if (bxxk == null) {
                synchronized (cboi.class) {
                    bxxk = f177820c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177819b);
                        f177820c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
