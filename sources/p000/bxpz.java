package p000;

/* renamed from: bxpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxpz f164345b;

    /* renamed from: d */
    private static volatile bxxk f164346d;

    /* renamed from: a */
    public bxwc f164347a = bxxn.f165040b;

    /* renamed from: c */
    private byte f164348c = 2;

    static {
        bxpz bxpz = new bxpz();
        f164345b = bxpz;
        bxvk.m124024a(bxpz.class, bxpz);
    }

    private bxpz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164348c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164348c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164345b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bxbp.class});
        } else if (i2 == 3) {
            return new bxpz();
        } else {
            if (i2 == 4) {
                return new bxvd(f164345b);
            }
            if (i2 == 5) {
                return f164345b;
            }
            bxxk bxxk = f164346d;
            if (bxxk == null) {
                synchronized (bxpz.class) {
                    bxxk = f164346d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164345b);
                        f164346d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
