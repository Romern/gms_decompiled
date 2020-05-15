package p000;

/* renamed from: btci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btci extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btci f148274c;

    /* renamed from: d */
    private static volatile bxxk f148275d;

    /* renamed from: a */
    public bxwc f148276a = bxxn.f165040b;

    /* renamed from: b */
    public btcp f148277b;

    static {
        btci btci = new btci();
        f148274c = btci;
        GeneratedMessageLite.m124024a(btci.class, btci);
    }

    private btci() {
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
            return GeneratedMessageLite.m124022a(f148274c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"a", btcq.class, "b"});
        } else if (i2 == 3) {
            return new btci();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148274c;
            }
            bxxk bxxk = f148275d;
            if (bxxk == null) {
                synchronized (btci.class) {
                    bxxk = f148275d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148274c);
                        f148275d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
