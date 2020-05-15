package p000;

/* renamed from: imb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final imb f21338b;

    /* renamed from: c */
    private static volatile bxxk f21339c;

    /* renamed from: a */
    public bxwc f21340a = bxxn.f165040b;

    static {
        imb imb = new imb();
        f21338b = imb;
        GeneratedMessageLite.m124024a(imb.class, imb);
    }

    private imb() {
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
            return GeneratedMessageLite.m124022a(f21338b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ima.class});
        } else if (i2 == 3) {
            return new imb();
        } else {
            if (i2 == 4) {
                return new bxvd(f21338b);
            }
            if (i2 == 5) {
                return f21338b;
            }
            bxxk bxxk = f21339c;
            if (bxxk == null) {
                synchronized (imb.class) {
                    bxxk = f21339c;
                    if (bxxk == null) {
                        bxxk = new bxve(f21338b);
                        f21339c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
