package p000;

/* renamed from: caip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caip extends bxvk implements bxxd {

    /* renamed from: b */
    public static final caip f174755b;

    /* renamed from: d */
    private static volatile bxxk f174756d;

    /* renamed from: a */
    public bxwc f174757a = bxxn.f165040b;

    /* renamed from: c */
    private byte f174758c = 2;

    static {
        caip caip = new caip();
        f174755b = caip;
        bxvk.m124024a(caip.class, caip);
    }

    private caip() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174758c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174758c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f174755b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", caio.class});
        } else if (i2 == 3) {
            return new caip();
        } else {
            if (i2 == 4) {
                return new cain();
            }
            if (i2 == 5) {
                return f174755b;
            }
            bxxk bxxk = f174756d;
            if (bxxk == null) {
                synchronized (caip.class) {
                    bxxk = f174756d;
                    if (bxxk == null) {
                        bxxk = new bxve(f174755b);
                        f174756d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
