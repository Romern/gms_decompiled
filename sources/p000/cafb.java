package p000;

/* renamed from: cafb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cafb f172878f;

    /* renamed from: g */
    private static volatile bxxk f172879g;

    /* renamed from: a */
    public int f172880a;

    /* renamed from: b */
    public bxwc f172881b = bxxn.f165040b;

    /* renamed from: c */
    public String f172882c = "";

    /* renamed from: d */
    public bxvt f172883d = bxvm.f164965b;

    /* renamed from: e */
    public bxwc f172884e = bxxn.f165040b;

    static {
        cafb cafb = new cafb();
        f172878f = cafb;
        bxvk.m124024a(cafb.class, cafb);
    }

    private cafb() {
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
            return bxvk.m124022a(f172878f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0003\u0000\u0002\u001b\u0003ဈ\u0000\u0004,\u0005\u001b", new Object[]{"a", "b", cafh.class, "c", "d", caev.m126559b(), "e", caey.class});
        } else if (i2 == 3) {
            return new cafb();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f172878f;
            }
            bxxk bxxk = f172879g;
            if (bxxk == null) {
                synchronized (cafb.class) {
                    bxxk = f172879g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172878f);
                        f172879g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
