package p000;

/* renamed from: sgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sgn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final sgn f44426b;

    /* renamed from: c */
    private static volatile bxxk f44427c;

    /* renamed from: a */
    public bxwc f44428a = bxxn.f165040b;

    static {
        sgn sgn = new sgn();
        f44426b = sgn;
        GeneratedMessageLite.m124024a(sgn.class, sgn);
    }

    private sgn() {
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
            return GeneratedMessageLite.m124022a(f44426b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", sgm.class});
        } else if (i2 == 3) {
            return new sgn();
        } else {
            if (i2 == 4) {
                return new bxvd(f44426b);
            }
            if (i2 == 5) {
                return f44426b;
            }
            bxxk bxxk = f44427c;
            if (bxxk == null) {
                synchronized (sgn.class) {
                    bxxk = f44427c;
                    if (bxxk == null) {
                        bxxk = new bxve(f44426b);
                        f44427c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
