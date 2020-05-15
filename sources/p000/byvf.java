package p000;

/* renamed from: byvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvf extends bxvg implements bxvh {

    /* renamed from: e */
    public static final byvf f168424e;

    /* renamed from: g */
    private static volatile bxxk f168425g;

    /* renamed from: a */
    public int f168426a;

    /* renamed from: b */
    public int f168427b;

    /* renamed from: c */
    public String f168428c = "";

    /* renamed from: d */
    public int f168429d;

    /* renamed from: f */
    private byte f168430f = 2;

    static {
        byvf byvf = new byvf();
        f168424e = byvf;
        bxvk.m124024a(byvf.class, byvf);
    }

    private byvf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168430f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168430f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168424e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0001\u0004င\u0002", new Object[]{"a", "b", bzbu.m125628b(), "c", "d"});
        } else if (i2 == 3) {
            return new byvf();
        } else {
            if (i2 == 4) {
                return new bxvf(f168424e);
            }
            if (i2 == 5) {
                return f168424e;
            }
            bxxk bxxk = f168425g;
            if (bxxk == null) {
                synchronized (byvf.class) {
                    bxxk = f168425g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168424e);
                        f168425g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
