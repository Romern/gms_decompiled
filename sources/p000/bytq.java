package p000;

/* renamed from: bytq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bytq f167704b;

    /* renamed from: c */
    private static volatile bxxk f167705c;

    /* renamed from: a */
    public bxwc f167706a = bxxn.f165040b;

    static {
        bytq bytq = new bytq();
        f167704b = bytq;
        GeneratedMessageLite.m124024a(bytq.class, bytq);
    }

    private bytq() {
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
            return GeneratedMessageLite.m124022a(f167704b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byue.class});
        } else if (i2 == 3) {
            return new bytq();
        } else {
            if (i2 == 4) {
                return new bxvd(f167704b);
            }
            if (i2 == 5) {
                return f167704b;
            }
            bxxk bxxk = f167705c;
            if (bxxk == null) {
                synchronized (bytq.class) {
                    bxxk = f167705c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167704b);
                        f167705c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
