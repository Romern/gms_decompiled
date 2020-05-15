package p000;

/* renamed from: bkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bkd f4949c;

    /* renamed from: e */
    private static volatile bxxk f4950e;

    /* renamed from: a */
    public long f4951a;

    /* renamed from: b */
    public long f4952b;

    /* renamed from: d */
    private int f4953d;

    static {
        bkd bkd = new bkd();
        f4949c = bkd;
        bxvk.m124024a(bkd.class, bkd);
    }

    private bkd() {
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
            return bxvk.m124022a(f4949c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f4949c);
            }
            if (i2 == 5) {
                return f4949c;
            }
            bxxk bxxk = f4950e;
            if (bxxk == null) {
                synchronized (bkd.class) {
                    bxxk = f4950e;
                    if (bxxk == null) {
                        bxxk = new bxve(f4949c);
                        f4950e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
