package p000;

/* renamed from: bzjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzjd f170276b;

    /* renamed from: c */
    private static volatile bxxk f170277c;

    /* renamed from: a */
    public bxwc f170278a = bxxn.f165040b;

    static {
        bzjd bzjd = new bzjd();
        f170276b = bzjd;
        bxvk.m124024a(bzjd.class, bzjd);
    }

    private bzjd() {
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
            return bxvk.m124022a(f170276b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bzjc.class});
        } else if (i2 == 3) {
            return new bzjd();
        } else {
            if (i2 == 4) {
                return new bxvd(f170276b);
            }
            if (i2 == 5) {
                return f170276b;
            }
            bxxk bxxk = f170277c;
            if (bxxk == null) {
                synchronized (bzjd.class) {
                    bxxk = f170277c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170276b);
                        f170277c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
