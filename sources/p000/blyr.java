package p000;

/* renamed from: blyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyr extends bxvk implements bxxd {

    /* renamed from: p */
    public static final blyr f128298p;

    /* renamed from: r */
    private static volatile bxxk f128299r;

    /* renamed from: a */
    public int f128300a;

    /* renamed from: b */
    public bmav f128301b;

    /* renamed from: c */
    public bmaq f128302c;

    /* renamed from: d */
    public bmar f128303d;

    /* renamed from: e */
    public boolean f128304e;

    /* renamed from: f */
    public blym f128305f;

    /* renamed from: g */
    public bxwc f128306g = bxxn.f165040b;

    /* renamed from: h */
    public blym f128307h;

    /* renamed from: i */
    public bwiu f128308i;

    /* renamed from: j */
    public boolean f128309j;

    /* renamed from: k */
    public int f128310k;

    /* renamed from: l */
    public String f128311l = "";

    /* renamed from: m */
    public String f128312m = "";

    /* renamed from: n */
    public bmag f128313n;

    /* renamed from: o */
    public bmag f128314o;

    /* renamed from: q */
    private byte f128315q = 2;

    static {
        blyr blyr = new blyr();
        f128298p = blyr;
        bxvk.m124024a(blyr.class, blyr);
    }

    private blyr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128315q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128315q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128298p, "\u0001\u000e\u0000\u0001\u0001\u0014\u000e\u0000\u0001\u0003\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0005\u0005ဉ\f\u0006ဈ\u000b\bဇ\u0003\tဇ\b\nဌ\t\u000bᐉ\u0006\fဉ\u0002\rဈ\n\u0010Л\u0013ဉ\r\u0014ဉ\u0007", new Object[]{"a", "b", "c", "f", "n", "m", "e", "j", "k", bwgz.m121953b(), "h", "d", "l", "g", blym.class, "o", "i"});
        } else if (i2 == 3) {
            return new blyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f128298p);
            }
            if (i2 == 5) {
                return f128298p;
            }
            bxxk bxxk = f128299r;
            if (bxxk == null) {
                synchronized (blyr.class) {
                    bxxk = f128299r;
                    if (bxxk == null) {
                        bxxk = new bxve(f128298p);
                        f128299r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
