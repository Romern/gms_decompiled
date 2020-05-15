package p000;

/* renamed from: blzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzf extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bxvu f128336h = new blzd();

    /* renamed from: k */
    public static final blzf f128337k;

    /* renamed from: l */
    private static volatile bxxk f128338l;

    /* renamed from: a */
    public int f128339a;

    /* renamed from: b */
    public bwdt f128340b;

    /* renamed from: c */
    public bxtx f128341c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f128342d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f128343e;

    /* renamed from: f */
    public bwdx f128344f;

    /* renamed from: g */
    public bxvt f128345g = bxvm.f164965b;

    /* renamed from: i */
    public blzq f128346i;

    /* renamed from: j */
    public bwef f128347j;

    static {
        blzf blzf = new blzf();
        f128337k = blzf;
        bxvk.m124024a(blzf.class, blzf);
    }

    private blzf() {
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
            return bxvk.m124022a(f128337k, "\u0001\b\u0000\u0001\ff\b\u0000\u0002\u0000\fဉ\u0000\u000e\u001b\u0019ည\u0001(ဉ\u0004+\u001e2ဉ\u00053ဇ\u0003fဉ\u0006", new Object[]{"a", "b", "d", blxf.class, "c", "f", "g", bmfk.m107977b(), "i", "e", "j"});
        } else if (i2 == 3) {
            return new blzf();
        } else {
            if (i2 == 4) {
                return new blze();
            }
            if (i2 == 5) {
                return f128337k;
            }
            bxxk bxxk = f128338l;
            if (bxxk == null) {
                synchronized (blzf.class) {
                    bxxk = f128338l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128337k);
                        f128338l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
