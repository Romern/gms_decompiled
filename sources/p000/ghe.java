package p000;

/* renamed from: ghe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghe extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ghe f18229b;

    /* renamed from: c */
    private static volatile bxxk f18230c;

    /* renamed from: a */
    public bxwc f18231a = bxxn.f165040b;

    static {
        ghe ghe = new ghe();
        f18229b = ghe;
        bxvk.m124024a(ghe.class, ghe);
    }

    private ghe() {
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
            return bxvk.m124022a(f18229b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", ghd.class});
        } else if (i2 == 3) {
            return new ghe();
        } else {
            if (i2 == 4) {
                return new bxvd(f18229b);
            }
            if (i2 == 5) {
                return f18229b;
            }
            bxxk bxxk = f18230c;
            if (bxxk == null) {
                synchronized (ghe.class) {
                    bxxk = f18230c;
                    if (bxxk == null) {
                        bxxk = new bxve(f18229b);
                        f18230c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
