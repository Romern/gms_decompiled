package p000;

/* renamed from: bxnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnm extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxnm f164050i;

    /* renamed from: j */
    public static final bxvj f164051j;

    /* renamed from: k */
    private static volatile bxxk f164052k;

    /* renamed from: a */
    public int f164053a;

    /* renamed from: b */
    public int f164054b;

    /* renamed from: c */
    public int f164055c;

    /* renamed from: d */
    public float f164056d;

    /* renamed from: e */
    public float f164057e;

    /* renamed from: f */
    public double f164058f;

    /* renamed from: g */
    public float f164059g;

    /* renamed from: h */
    public int f164060h;

    static {
        bxnm bxnm = new bxnm();
        f164050i = bxnm;
        bxvk.m124024a(bxnm.class, bxnm);
        bxcf bxcf = bxcf.f162779a;
        bxnm bxnm2 = f164050i;
        f164051j = bxvk.m124006a(bxcf, bxnm2, bxnm2, 76736864, bxzf.MESSAGE);
    }

    private bxnm() {
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
            return bxvk.m124022a(f164050i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006က\u0004\u0007ခ\u0005\bဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bxnl.f164049a});
        } else if (i2 == 3) {
            return new bxnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f164050i);
            }
            if (i2 == 5) {
                return f164050i;
            }
            bxxk bxxk = f164052k;
            if (bxxk == null) {
                synchronized (bxnm.class) {
                    bxxk = f164052k;
                    if (bxxk == null) {
                        bxxk = new bxve(f164050i);
                        f164052k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
