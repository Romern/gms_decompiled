package p000;

/* renamed from: cbqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbqn f178043d;

    /* renamed from: e */
    private static volatile bxxk f178044e;

    /* renamed from: a */
    public cbqp f178045a;

    /* renamed from: b */
    public cbqq f178046b;

    /* renamed from: c */
    public bxwc f178047c = bxxn.f165040b;

    static {
        cbqn cbqn = new cbqn();
        f178043d = cbqn;
        GeneratedMessageLite.m124024a(cbqn.class, cbqn);
    }

    private cbqn() {
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
            return GeneratedMessageLite.m124022a(f178043d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0004\t", new Object[]{"a", "c", cbpw.class, "b"});
        } else if (i2 == 3) {
            return new cbqn();
        } else {
            if (i2 == 4) {
                return new cbqm();
            }
            if (i2 == 5) {
                return f178043d;
            }
            bxxk bxxk = f178044e;
            if (bxxk == null) {
                synchronized (cbqn.class) {
                    bxxk = f178044e;
                    if (bxxk == null) {
                        bxxk = new bxve(f178043d);
                        f178044e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
