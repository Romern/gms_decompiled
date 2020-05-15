package p000;

/* renamed from: asil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asil extends bxvk implements bxxd {

    /* renamed from: d */
    public static final asil f89046d;

    /* renamed from: e */
    private static volatile bxxk f89047e;

    /* renamed from: a */
    public asij f89048a;

    /* renamed from: b */
    public asii f89049b;

    /* renamed from: c */
    public asik f89050c;

    static {
        asil asil = new asil();
        f89046d = asil;
        bxvk.m124024a(asil.class, asil);
    }

    private asil() {
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
            return bxvk.m124022a(f89046d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new asil();
        } else {
            if (i2 == 4) {
                return new bxvd(f89046d);
            }
            if (i2 == 5) {
                return f89046d;
            }
            bxxk bxxk = f89047e;
            if (bxxk == null) {
                synchronized (asil.class) {
                    bxxk = f89047e;
                    if (bxxk == null) {
                        bxxk = new bxve(f89046d);
                        f89047e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
