package p000;

/* renamed from: btbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btbs f148207d;

    /* renamed from: e */
    private static volatile bxxk f148208e;

    /* renamed from: a */
    public bxwc f148209a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f148210b = bxxn.f165040b;

    /* renamed from: c */
    public long f148211c;

    static {
        btbs btbs = new btbs();
        f148207d = btbs;
        bxvk.m124024a(btbs.class, btbs);
    }

    private btbs() {
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
            return bxvk.m124022a(f148207d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0002", new Object[]{"a", btbq.class, "b", btbq.class, "c"});
        } else if (i2 == 3) {
            return new btbs();
        } else {
            if (i2 == 4) {
                return new bxvd(f148207d);
            }
            if (i2 == 5) {
                return f148207d;
            }
            bxxk bxxk = f148208e;
            if (bxxk == null) {
                synchronized (btbs.class) {
                    bxxk = f148208e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148207d);
                        f148208e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
