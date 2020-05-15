package p000;

/* renamed from: amms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amms extends bxvk implements bxxd {

    /* renamed from: c */
    public static final amms f75372c;

    /* renamed from: d */
    private static volatile bxxk f75373d;

    /* renamed from: a */
    public int f75374a;

    /* renamed from: b */
    public int f75375b;

    static {
        amms amms = new amms();
        f75372c = amms;
        bxvk.m124024a(amms.class, amms);
    }

    private amms() {
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
            return bxvk.m124022a(f75372c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", amji.f74997a});
        } else if (i2 == 3) {
            return new amms();
        } else {
            if (i2 == 4) {
                return new bxvd(f75372c);
            }
            if (i2 == 5) {
                return f75372c;
            }
            bxxk bxxk = f75373d;
            if (bxxk == null) {
                synchronized (amms.class) {
                    bxxk = f75373d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75372c);
                        f75373d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
