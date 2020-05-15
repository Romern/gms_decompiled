package p000;

/* renamed from: biqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final biqs f121330d;

    /* renamed from: g */
    private static volatile bxxk f121331g;

    /* renamed from: a */
    public int f121332a = 1;

    /* renamed from: b */
    public int f121333b;

    /* renamed from: c */
    public bxwc f121334c = bxxn.f165040b;

    /* renamed from: e */
    private int f121335e;

    /* renamed from: f */
    private byte f121336f = 2;

    static {
        biqs biqs = new biqs();
        f121330d = biqs;
        bxvk.m124024a(biqs.class, biqs);
    }

    private biqs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121336f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121336f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121330d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᔌ\u0000\u0002ᔄ\u0001\u0003Л", new Object[]{"e", "a", bisf.m102782b(), "b", "c", bivu.class});
        } else if (i2 == 3) {
            return new biqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f121330d);
            }
            if (i2 == 5) {
                return f121330d;
            }
            bxxk bxxk = f121331g;
            if (bxxk == null) {
                synchronized (biqs.class) {
                    bxxk = f121331g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121330d);
                        f121331g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
