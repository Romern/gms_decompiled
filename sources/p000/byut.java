package p000;

/* renamed from: byut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byut extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byut f168368b;

    /* renamed from: d */
    private static volatile bxxk f168369d;

    /* renamed from: a */
    public bxwc f168370a = bxxn.f165040b;

    /* renamed from: c */
    private byte f168371c = 2;

    static {
        byut byut = new byut();
        f168368b = byut;
        bxvk.m124024a(byut.class, byut);
    }

    private byut() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168371c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168371c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168368b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", byur.class});
        } else if (i2 == 3) {
            return new byut();
        } else {
            if (i2 == 4) {
                return new bxvd(f168368b);
            }
            if (i2 == 5) {
                return f168368b;
            }
            bxxk bxxk = f168369d;
            if (bxxk == null) {
                synchronized (byut.class) {
                    bxxk = f168369d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168368b);
                        f168369d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
