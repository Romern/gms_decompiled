package p000;

/* renamed from: bocj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bocj f132559f;

    /* renamed from: g */
    private static volatile bxxk f132560g;

    /* renamed from: a */
    public int f132561a;

    /* renamed from: b */
    public int f132562b;

    /* renamed from: c */
    public int f132563c;

    /* renamed from: d */
    public bxvt f132564d = bxvm.f164965b;

    /* renamed from: e */
    public int f132565e;

    static {
        bocj bocj = new bocj();
        f132559f = bocj;
        bxvk.m124024a(bocj.class, bocj);
    }

    private bocj() {
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
            return bxvk.m124022a(f132559f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0016\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", "e", bqbo.m112518b()});
        } else if (i2 == 3) {
            return new bocj();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f132559f;
            }
            bxxk bxxk = f132560g;
            if (bxxk == null) {
                synchronized (bocj.class) {
                    bxxk = f132560g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132559f);
                        f132560g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
