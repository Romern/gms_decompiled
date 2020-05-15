package p000;

/* renamed from: btcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btcm f148287c;

    /* renamed from: d */
    private static volatile bxxk f148288d;

    /* renamed from: a */
    public bxwc f148289a = bxxn.f165040b;

    /* renamed from: b */
    public btea f148290b;

    static {
        btcm btcm = new btcm();
        f148287c = btcm;
        bxvk.m124024a(btcm.class, btcm);
    }

    private btcm() {
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
            return bxvk.m124022a(f148287c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btcm();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148287c;
            }
            bxxk bxxk = f148288d;
            if (bxxk == null) {
                synchronized (btcm.class) {
                    bxxk = f148288d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148287c);
                        f148288d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
