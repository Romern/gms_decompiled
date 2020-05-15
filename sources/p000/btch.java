package p000;

/* renamed from: btch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btch extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btch f148271b;

    /* renamed from: c */
    private static volatile bxxk f148272c;

    /* renamed from: a */
    public bxwc f148273a = bxxn.f165040b;

    static {
        btch btch = new btch();
        f148271b = btch;
        bxvk.m124024a(btch.class, btch);
    }

    private btch() {
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
            return bxvk.m124022a(f148271b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzkv.class});
        } else if (i2 == 3) {
            return new btch();
        } else {
            if (i2 == 4) {
                return new bxvd(f148271b);
            }
            if (i2 == 5) {
                return f148271b;
            }
            bxxk bxxk = f148272c;
            if (bxxk == null) {
                synchronized (btch.class) {
                    bxxk = f148272c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148271b);
                        f148272c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
