package p000;

/* renamed from: bzqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzqw f171080b;

    /* renamed from: c */
    private static volatile bxxk f171081c;

    /* renamed from: a */
    public bxwc f171082a = bxxn.f165040b;

    static {
        bzqw bzqw = new bzqw();
        f171080b = bzqw;
        bxvk.m124024a(bzqw.class, bzqw);
    }

    private bzqw() {
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
            return bxvk.m124022a(f171080b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzqx.class});
        } else if (i2 == 3) {
            return new bzqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f171080b);
            }
            if (i2 == 5) {
                return f171080b;
            }
            bxxk bxxk = f171081c;
            if (bxxk == null) {
                synchronized (bzqw.class) {
                    bxxk = f171081c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171080b);
                        f171081c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
