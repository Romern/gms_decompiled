package p000;

/* renamed from: btcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btcp f148299c;

    /* renamed from: d */
    private static volatile bxxk f148300d;

    /* renamed from: a */
    public bxvt f148301a = bxvm.f164965b;

    /* renamed from: b */
    public bzlf f148302b;

    static {
        btcp btcp = new btcp();
        f148299c = btcp;
        bxvk.m124024a(btcp.class, btcp);
    }

    private btcp() {
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
            return bxvk.m124022a(f148299c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btcp();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f148299c;
            }
            bxxk bxxk = f148300d;
            if (bxxk == null) {
                synchronized (btcp.class) {
                    bxxk = f148300d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148299c);
                        f148300d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
