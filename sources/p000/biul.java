package p000;

/* renamed from: biul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biul extends bxvk implements bxxd {

    /* renamed from: d */
    public static final biul f121808d;

    /* renamed from: g */
    private static volatile bxxk f121809g;

    /* renamed from: a */
    public int f121810a = 1;

    /* renamed from: b */
    public int f121811b;

    /* renamed from: c */
    public boolean f121812c;

    /* renamed from: e */
    private int f121813e;

    /* renamed from: f */
    private byte f121814f = 2;

    static {
        biul biul = new biul();
        f121808d = biul;
        bxvk.m124024a(biul.class, biul);
    }

    private biul() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121814f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121814f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121808d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", bisf.m102782b(), "b", "c"});
        } else if (i2 == 3) {
            return new biul();
        } else {
            if (i2 == 4) {
                return new bxvd(f121808d);
            }
            if (i2 == 5) {
                return f121808d;
            }
            bxxk bxxk = f121809g;
            if (bxxk == null) {
                synchronized (biul.class) {
                    bxxk = f121809g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121808d);
                        f121809g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
