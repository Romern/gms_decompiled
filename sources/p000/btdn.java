package p000;

/* renamed from: btdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btdn f148412b;

    /* renamed from: d */
    private static volatile bxxk f148413d;

    /* renamed from: a */
    public bxwc f148414a = bxxn.f165040b;

    /* renamed from: c */
    private byte f148415c = 2;

    static {
        btdn btdn = new btdn();
        f148412b = btdn;
        bxvk.m124024a(btdn.class, btdn);
    }

    private btdn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148415c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148415c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148412b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", btbu.class});
        } else if (i2 == 3) {
            return new btdn();
        } else {
            if (i2 == 4) {
                return new bxvd(f148412b);
            }
            if (i2 == 5) {
                return f148412b;
            }
            bxxk bxxk = f148413d;
            if (bxxk == null) {
                synchronized (btdn.class) {
                    bxxk = f148413d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148412b);
                        f148413d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
