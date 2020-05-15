package p000;

/* renamed from: btdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btdu f148450c;

    /* renamed from: e */
    private static volatile bxxk f148451e;

    /* renamed from: a */
    public bxwc f148452a = bxxn.f165040b;

    /* renamed from: b */
    public bxww f148453b = bxww.f165013b;

    /* renamed from: d */
    private byte f148454d = 2;

    static {
        btdu btdu = new btdu();
        f148450c = btdu;
        bxvk.m124024a(btdu.class, btdu);
    }

    private btdu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148454d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148454d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148450c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0001\u0001\u001b\u0002в", new Object[]{"a", btds.class, "b", btdt.f148449a});
        } else if (i2 == 3) {
            return new btdu();
        } else {
            if (i2 == 4) {
                return new bxvd(f148450c);
            }
            if (i2 == 5) {
                return f148450c;
            }
            bxxk bxxk = f148451e;
            if (bxxk == null) {
                synchronized (btdu.class) {
                    bxxk = f148451e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148450c);
                        f148451e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
