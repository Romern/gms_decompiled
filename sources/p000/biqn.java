package p000;

/* renamed from: biqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final biqn f121305b;

    /* renamed from: e */
    private static volatile bxxk f121306e;

    /* renamed from: a */
    public int f121307a;

    /* renamed from: c */
    private int f121308c;

    /* renamed from: d */
    private byte f121309d = 2;

    static {
        biqn biqn = new biqn();
        f121305b = biqn;
        bxvk.m124024a(biqn.class, biqn);
    }

    private biqn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121309d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121309d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121305b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"c", "a", biql.f121304a});
        } else if (i2 == 3) {
            return new biqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f121305b);
            }
            if (i2 == 5) {
                return f121305b;
            }
            bxxk bxxk = f121306e;
            if (bxxk == null) {
                synchronized (biqn.class) {
                    bxxk = f121306e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121305b);
                        f121306e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
