package p000;

/* renamed from: bwkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkb extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bwkb f159934k;

    /* renamed from: m */
    private static volatile bxxk f159935m;

    /* renamed from: a */
    public int f159936a;

    /* renamed from: b */
    public bmav f159937b;

    /* renamed from: c */
    public bmaq f159938c;

    /* renamed from: d */
    public bmar f159939d;

    /* renamed from: e */
    public int f159940e;

    /* renamed from: f */
    public bwjy f159941f;

    /* renamed from: g */
    public String f159942g = "";

    /* renamed from: h */
    public bwjv f159943h;

    /* renamed from: i */
    public bmag f159944i;

    /* renamed from: j */
    public boolean f159945j;

    /* renamed from: l */
    private byte f159946l = 2;

    static {
        bwkb bwkb = new bwkb();
        f159934k = bwkb;
        bxvk.m124024a(bwkb.class, bwkb);
    }

    private bwkb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159946l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159946l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159934k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004\u0006ဈ\u0005\bဉ\u0007\nဉ\u0006\u000bဇ\b", new Object[]{"a", "b", "c", "d", "e", bwgz.m121953b(), "f", "g", "i", "h", "j"});
        } else if (i2 == 3) {
            return new bwkb();
        } else {
            if (i2 == 4) {
                return new bxvd(f159934k);
            }
            if (i2 == 5) {
                return f159934k;
            }
            bxxk bxxk = f159935m;
            if (bxxk == null) {
                synchronized (bwkb.class) {
                    bxxk = f159935m;
                    if (bxxk == null) {
                        bxxk = new bxve(f159934k);
                        f159935m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
