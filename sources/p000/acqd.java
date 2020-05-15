package p000;

/* renamed from: acqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final acqd f60466b;

    /* renamed from: d */
    private static volatile bxxk f60467d;

    /* renamed from: a */
    public bxtx f60468a = bxtx.f164797b;

    /* renamed from: c */
    private int f60469c;

    static {
        acqd acqd = new acqd();
        f60466b = acqd;
        bxvk.m124024a(acqd.class, acqd);
    }

    private acqd() {
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
            return bxvk.m124022a(f60466b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new acqd();
        } else {
            if (i2 == 4) {
                return new bxvd(f60466b);
            }
            if (i2 == 5) {
                return f60466b;
            }
            bxxk bxxk = f60467d;
            if (bxxk == null) {
                synchronized (acqd.class) {
                    bxxk = f60467d;
                    if (bxxk == null) {
                        bxxk = new bxve(f60466b);
                        f60467d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
