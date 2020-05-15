package p000;

/* renamed from: cbpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbpd f177902b;

    /* renamed from: c */
    private static volatile bxxk f177903c;

    /* renamed from: a */
    public bxyk f177904a;

    static {
        cbpd cbpd = new cbpd();
        f177902b = cbpd;
        bxvk.m124024a(cbpd.class, cbpd);
    }

    private cbpd() {
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
            return bxvk.m124022a(f177902b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f177902b);
            }
            if (i2 == 5) {
                return f177902b;
            }
            bxxk bxxk = f177903c;
            if (bxxk == null) {
                synchronized (cbpd.class) {
                    bxxk = f177903c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177902b);
                        f177903c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
