package p000;

/* renamed from: bmkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkj extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bmkj f129827l;

    /* renamed from: m */
    private static volatile bxxk f129828m;

    /* renamed from: a */
    public int f129829a;

    /* renamed from: b */
    public int f129830b = 0;

    /* renamed from: c */
    public Object f129831c;

    /* renamed from: d */
    public String f129832d = "";

    /* renamed from: e */
    public bxtx f129833e = bxtx.f164797b;

    /* renamed from: f */
    public String f129834f = "";

    /* renamed from: g */
    public boolean f129835g;

    /* renamed from: h */
    public boolean f129836h;

    /* renamed from: i */
    public String f129837i = "";

    /* renamed from: j */
    public bmed f129838j;

    /* renamed from: k */
    public bxwc f129839k = bxxn.f165040b;

    static {
        bmkj bmkj = new bmkj();
        f129827l = bmkj;
        bxvk.m124024a(bmkj.class, bmkj);
    }

    private bmkj() {
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
            return bxvk.m124022a(f129827l, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ျ\u0000\u0004ျ\u0000\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0007\bဉ\b\t\u001b\nဇ\u0006", new Object[]{"c", "b", "a", "d", "e", "f", "g", "i", "j", "k", bmka.class, "h"});
        } else if (i2 == 3) {
            return new bmkj();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f129827l;
            }
            bxxk bxxk = f129828m;
            if (bxxk == null) {
                synchronized (bmkj.class) {
                    bxxk = f129828m;
                    if (bxxk == null) {
                        bxxk = new bxve(f129827l);
                        f129828m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
