package p000;

/* renamed from: bsom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsom extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsom f146398f;

    /* renamed from: g */
    private static volatile bxxk f146399g;

    /* renamed from: a */
    public int f146400a;

    /* renamed from: b */
    public bxvt f146401b = bxvm.f164965b;

    /* renamed from: c */
    public int f146402c;

    /* renamed from: d */
    public int f146403d;

    /* renamed from: e */
    public int f146404e;

    static {
        bsom bsom = new bsom();
        f146398f = bsom;
        bxvk.m124024a(bsom.class, bsom);
    }

    private bsom() {
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
            return bxvk.m124022a(f146398f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0016\u0002င\u0000\u0003င\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", "e", bsop.f146414a});
        } else if (i2 == 3) {
            return new bsom();
        } else {
            if (i2 == 4) {
                return new bsol();
            }
            if (i2 == 5) {
                return f146398f;
            }
            bxxk bxxk = f146399g;
            if (bxxk == null) {
                synchronized (bsom.class) {
                    bxxk = f146399g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146398f);
                        f146399g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
