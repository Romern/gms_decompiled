package p000;

/* renamed from: akkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final akkq f72175b;

    /* renamed from: c */
    private static volatile bxxk f72176c;

    /* renamed from: a */
    public bxwc f72177a = bxxn.f165040b;

    static {
        akkq akkq = new akkq();
        f72175b = akkq;
        GeneratedMessageLite.m124024a(akkq.class, akkq);
    }

    private akkq() {
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
            return GeneratedMessageLite.m124022a(f72175b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", akkp.class});
        } else if (i2 == 3) {
            return new akkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f72175b);
            }
            if (i2 == 5) {
                return f72175b;
            }
            bxxk bxxk = f72176c;
            if (bxxk == null) {
                synchronized (akkq.class) {
                    bxxk = f72176c;
                    if (bxxk == null) {
                        bxxk = new bxve(f72175b);
                        f72176c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
