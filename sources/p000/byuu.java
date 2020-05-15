package p000;

/* renamed from: byuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuu extends bxvg implements bxvh {

    /* renamed from: b */
    public static final byuu f168372b;

    /* renamed from: d */
    private static volatile bxxk f168373d;

    /* renamed from: a */
    public bxwc f168374a = bxxn.f165040b;

    /* renamed from: c */
    private byte f168375c = 2;

    static {
        byuu byuu = new byuu();
        f168372b = byuu;
        bxvk.m124024a(byuu.class, byuu);
    }

    private byuu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168375c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168375c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168372b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", byus.class});
        } else if (i2 == 3) {
            return new byuu();
        } else {
            if (i2 == 4) {
                return new bxvf(f168372b);
            }
            if (i2 == 5) {
                return f168372b;
            }
            bxxk bxxk = f168373d;
            if (bxxk == null) {
                synchronized (byuu.class) {
                    bxxk = f168373d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168372b);
                        f168373d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
