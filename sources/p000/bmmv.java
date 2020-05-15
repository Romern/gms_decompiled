package p000;

/* renamed from: bmmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmmv f130053f;

    /* renamed from: g */
    private static volatile bxxk f130054g;

    /* renamed from: a */
    public int f130055a;

    /* renamed from: b */
    public int f130056b = 0;

    /* renamed from: c */
    public Object f130057c;

    /* renamed from: d */
    public int f130058d;

    /* renamed from: e */
    public long f130059e;

    static {
        bmmv bmmv = new bmmv();
        f130053f = bmmv;
        bxvk.m124024a(bmmv.class, bmmv);
    }

    private bmmv() {
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
            return bxvk.m124022a(f130053f, "\u0001\r\u0001\u0001\u0001\u0017\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0004ြ\u0000\u0006ြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0016ြ\u0000\u0017ြ\u0000", new Object[]{"c", "b", "a", "d", bmma.f129997a, "e", bmmp.class, bmmf.class, bmmo.class, bmmu.class, bmmq.class, bmmj.class, bmmg.class, bmmi.class, bmmh.class, bmmt.class, bmme.class});
        } else if (i2 == 3) {
            return new bmmv();
        } else {
            if (i2 == 4) {
                return new bxvd(f130053f);
            }
            if (i2 == 5) {
                return f130053f;
            }
            bxxk bxxk = f130054g;
            if (bxxk == null) {
                synchronized (bmmv.class) {
                    bxxk = f130054g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130053f);
                        f130054g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
