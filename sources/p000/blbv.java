package p000;

/* renamed from: blbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blbv f125871b;

    /* renamed from: d */
    private static volatile bxxk f125872d;

    /* renamed from: a */
    public bxwc f125873a = bxxn.f165040b;

    /* renamed from: c */
    private byte f125874c = 2;

    static {
        blbv blbv = new blbv();
        f125871b = blbv;
        bxvk.m124024a(blbv.class, blbv);
    }

    private blbv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125874c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125874c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125871b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", blcb.class});
        } else if (i2 == 3) {
            return new blbv();
        } else {
            if (i2 == 4) {
                return new bxvd(f125871b);
            }
            if (i2 == 5) {
                return f125871b;
            }
            bxxk bxxk = f125872d;
            if (bxxk == null) {
                synchronized (blbv.class) {
                    bxxk = f125872d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125871b);
                        f125872d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
