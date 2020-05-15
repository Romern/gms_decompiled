package p000;

/* renamed from: bsph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsph extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bsph f146490m;

    /* renamed from: n */
    private static volatile bxxk f146491n;

    /* renamed from: a */
    public int f146492a;

    /* renamed from: b */
    public int f146493b;

    /* renamed from: c */
    public int f146494c;

    /* renamed from: d */
    public bson f146495d;

    /* renamed from: e */
    public bsok f146496e;

    /* renamed from: f */
    public bsom f146497f;

    /* renamed from: g */
    public bsoo f146498g;

    /* renamed from: h */
    public int f146499h;

    /* renamed from: i */
    public String f146500i = "";

    /* renamed from: j */
    public boolean f146501j;

    /* renamed from: k */
    public String f146502k = "";

    /* renamed from: l */
    public bsou f146503l;

    static {
        bsph bsph = new bsph();
        f146490m = bsph;
        GeneratedMessageLite.m124024a(bsph.class, bsph);
    }

    private bsph() {
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
            return GeneratedMessageLite.m124022a(f146490m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဉ\u0004\u0005ဉ\u0005\u0006င\b\u0007ဈ\t\bဇ\n\tဈ\u000b\nဌ\u0001\u000bဉ\u0006\fဉ\u0007\rဉ\f", new Object[]{"a", "b", bspc.f146468a, "d", "e", "h", "i", "j", "k", "c", bspb.f146467a, "f", "g", "l"});
        } else if (i2 == 3) {
            return new bsph();
        } else {
            if (i2 == 4) {
                return new bxvd(f146490m);
            }
            if (i2 == 5) {
                return f146490m;
            }
            bxxk bxxk = f146491n;
            if (bxxk == null) {
                synchronized (bsph.class) {
                    bxxk = f146491n;
                    if (bxxk == null) {
                        bxxk = new bxve(f146490m);
                        f146491n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
