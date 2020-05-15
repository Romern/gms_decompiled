package p000;

/* renamed from: bxoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxoi f164154c;

    /* renamed from: d */
    private static volatile bxxk f164155d;

    /* renamed from: a */
    public int f164156a = 0;

    /* renamed from: b */
    public Object f164157b;

    static {
        bxoi bxoi = new bxoi();
        f164154c = bxoi;
        bxvk.m124024a(bxoi.class, bxoi);
    }

    private bxoi() {
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
            return bxvk.m124022a(f164154c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bxuo.class, bxoh.class});
        } else if (i2 == 3) {
            return new bxoi();
        } else {
            if (i2 == 4) {
                return new bxvd(f164154c);
            }
            if (i2 == 5) {
                return f164154c;
            }
            bxxk bxxk = f164155d;
            if (bxxk == null) {
                synchronized (bxoi.class) {
                    bxxk = f164155d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164154c);
                        f164155d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
