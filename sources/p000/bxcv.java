package p000;

/* renamed from: bxcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxcv f162989d;

    /* renamed from: e */
    private static volatile bxxk f162990e;

    /* renamed from: a */
    public int f162991a;

    /* renamed from: b */
    public int f162992b;

    /* renamed from: c */
    public long f162993c;

    static {
        bxcv bxcv = new bxcv();
        f162989d = bxcv;
        bxvk.m124024a(bxcv.class, bxcv);
    }

    private bxcv() {
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
            return bxvk.m124022a(f162989d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bxct.f162988a, "c"});
        } else if (i2 == 3) {
            return new bxcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f162989d);
            }
            if (i2 == 5) {
                return f162989d;
            }
            bxxk bxxk = f162990e;
            if (bxxk == null) {
                synchronized (bxcv.class) {
                    bxxk = f162990e;
                    if (bxxk == null) {
                        bxxk = new bxve(f162989d);
                        f162990e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
