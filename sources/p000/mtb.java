package p000;

/* renamed from: mtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtb extends bxvk implements bxxd {

    /* renamed from: o */
    public static final mtb f34626o;

    /* renamed from: p */
    private static volatile bxxk f34627p;

    /* renamed from: a */
    public int f34628a;

    /* renamed from: b */
    public String f34629b = "";

    /* renamed from: c */
    public bxwc f34630c = bxxn.f165040b;

    /* renamed from: d */
    public int f34631d;

    /* renamed from: e */
    public bxwc f34632e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f34633f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f34634g;

    /* renamed from: h */
    public bxwc f34635h = bxxn.f165040b;

    /* renamed from: i */
    public int f34636i = -1;

    /* renamed from: j */
    public boolean f34637j;

    /* renamed from: k */
    public bxwc f34638k = bxxn.f165040b;

    /* renamed from: l */
    public mtq f34639l;

    /* renamed from: m */
    public mtr f34640m;

    /* renamed from: n */
    public boolean f34641n;

    static {
        mtb mtb = new mtb();
        f34626o = mtb;
        bxvk.m124024a(mtb.class, mtb);
    }

    private mtb() {
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
            return bxvk.m124022a(f34626o, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0005\u0000\u0001ဈ\u0000\u0002\u001b\u0005င\u0002\u0007\u001b\t\u001b\nဇ\u0003\u000b\u001b\fင\u0004\rဇ\u0005\u000e\u001b\u000fဉ\u0006\u0010ဉ\u0007\u0011ဇ\b", new Object[]{"a", "b", "c", mtn.class, "d", "e", mtp.class, "f", mtj.class, "g", "h", mtu.class, "i", "j", "k", mtd.class, "l", "m", "n"});
        } else if (i2 == 3) {
            return new mtb();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f34626o;
            }
            bxxk bxxk = f34627p;
            if (bxxk == null) {
                synchronized (mtb.class) {
                    bxxk = f34627p;
                    if (bxxk == null) {
                        bxxk = new bxve(f34626o);
                        f34627p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
