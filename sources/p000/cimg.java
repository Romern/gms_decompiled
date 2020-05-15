package p000;

/* renamed from: cimg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final cimg f190708g;

    /* renamed from: h */
    private static volatile bxxk f190709h;

    /* renamed from: a */
    public int f190710a;

    /* renamed from: b */
    public int f190711b;

    /* renamed from: c */
    public int f190712c;

    /* renamed from: d */
    public int f190713d;

    /* renamed from: e */
    public cimh f190714e;

    /* renamed from: f */
    public cimf f190715f;

    static {
        cimg cimg = new cimg();
        f190708g = cimg;
        GeneratedMessageLite.m124024a(cimg.class, cimg);
    }

    private cimg() {
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
            return GeneratedMessageLite.m124022a(f190708g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဉ\u0004\u0007ဉ\u0006", new Object[]{"a", "b", cime.f190702a, "c", cima.f190698a, "d", cimb.f190699a, "e", "f"});
        } else if (i2 == 3) {
            return new cimg();
        } else {
            if (i2 == 4) {
                return new bxvd(f190708g);
            }
            if (i2 == 5) {
                return f190708g;
            }
            bxxk bxxk = f190709h;
            if (bxxk == null) {
                synchronized (cimg.class) {
                    bxxk = f190709h;
                    if (bxxk == null) {
                        bxxk = new bxve(f190708g);
                        f190709h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
