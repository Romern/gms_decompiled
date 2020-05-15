package p000;

/* renamed from: tjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final tjb f46179c;

    /* renamed from: d */
    private static volatile bxxk f46180d;

    /* renamed from: a */
    public bxwc f46181a = bxxn.f165040b;

    /* renamed from: b */
    public bxvt f46182b = bxvm.f164965b;

    static {
        tjb tjb = new tjb();
        f46179c = tjb;
        bxvk.m124024a(tjb.class, tjb);
    }

    private tjb() {
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
            return bxvk.m124022a(f46179c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u0016", new Object[]{"a", tja.class, "b"});
        } else if (i2 == 3) {
            return new tjb();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f46179c;
            }
            bxxk bxxk = f46180d;
            if (bxxk == null) {
                synchronized (tjb.class) {
                    bxxk = f46180d;
                    if (bxxk == null) {
                        bxxk = new bxve(f46179c);
                        f46180d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
