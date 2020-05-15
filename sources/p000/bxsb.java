package p000;

/* renamed from: bxsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bxsb f164652f;

    /* renamed from: g */
    private static volatile bxxk f164653g;

    /* renamed from: a */
    public int f164654a;

    /* renamed from: b */
    public bxrf f164655b;

    /* renamed from: c */
    public bxwc f164656c = bxxn.f165040b;

    /* renamed from: d */
    public bxsa f164657d;

    /* renamed from: e */
    public bxrm f164658e;

    static {
        bxsb bxsb = new bxsb();
        f164652f = bxsb;
        bxvk.m124024a(bxsb.class, bxsb);
    }

    private bxsb() {
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
            return bxvk.m124022a(f164652f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "c", bxsi.class, "b", "d", "e"});
        } else if (i2 == 3) {
            return new bxsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f164652f);
            }
            if (i2 == 5) {
                return f164652f;
            }
            bxxk bxxk = f164653g;
            if (bxxk == null) {
                synchronized (bxsb.class) {
                    bxxk = f164653g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164652f);
                        f164653g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
