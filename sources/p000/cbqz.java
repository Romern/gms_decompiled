package p000;

/* renamed from: cbqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbqz f178091c;

    /* renamed from: d */
    private static volatile bxxk f178092d;

    /* renamed from: a */
    public int f178093a = 0;

    /* renamed from: b */
    public Object f178094b;

    static {
        cbqz cbqz = new cbqz();
        f178091c = cbqz;
        GeneratedMessageLite.m124024a(cbqz.class, cbqz);
    }

    private cbqz() {
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
            return GeneratedMessageLite.m124022a(f178091c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", cbqn.class, cbpv.class});
        } else if (i2 == 3) {
            return new cbqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f178091c);
            }
            if (i2 == 5) {
                return f178091c;
            }
            bxxk bxxk = f178092d;
            if (bxxk == null) {
                synchronized (cbqz.class) {
                    bxxk = f178092d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178091c);
                        f178092d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
