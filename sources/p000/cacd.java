package p000;

/* renamed from: cacd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacd extends bxvk implements bxxd {

    /* renamed from: i */
    public static final cacd f172516i;

    /* renamed from: k */
    private static volatile bxxk f172517k;

    /* renamed from: a */
    public int f172518a;

    /* renamed from: b */
    public String f172519b = "";

    /* renamed from: c */
    public String f172520c = "";

    /* renamed from: d */
    public String f172521d = "";

    /* renamed from: e */
    public long f172522e;

    /* renamed from: f */
    public boolean f172523f;

    /* renamed from: g */
    public int f172524g;

    /* renamed from: h */
    public cack f172525h;

    /* renamed from: j */
    private byte f172526j = 2;

    static {
        cacd cacd = new cacd();
        f172516i = cacd;
        bxvk.m124024a(cacd.class, cacd);
    }

    private cacd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172526j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172526j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172516i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new cacd();
        } else {
            if (i2 == 4) {
                return new bxvd(f172516i);
            }
            if (i2 == 5) {
                return f172516i;
            }
            bxxk bxxk = f172517k;
            if (bxxk == null) {
                synchronized (cacd.class) {
                    bxxk = f172517k;
                    if (bxxk == null) {
                        bxxk = new bxve(f172516i);
                        f172517k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
