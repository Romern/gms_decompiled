package p000;

/* renamed from: bwuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwuq f161053c;

    /* renamed from: e */
    private static volatile bxxk f161054e;

    /* renamed from: a */
    public String f161055a = "";

    /* renamed from: b */
    public String f161056b = "";

    /* renamed from: d */
    private int f161057d;

    static {
        bwuq bwuq = new bwuq();
        f161053c = bwuq;
        bxvk.m124024a(bwuq.class, bwuq);
    }

    private bwuq() {
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
            return bxvk.m124022a(f161053c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwuq();
        } else {
            if (i2 == 4) {
                return new bxvd(f161053c);
            }
            if (i2 == 5) {
                return f161053c;
            }
            bxxk bxxk = f161054e;
            if (bxxk == null) {
                synchronized (bwuq.class) {
                    bxxk = f161054e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161053c);
                        f161054e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
