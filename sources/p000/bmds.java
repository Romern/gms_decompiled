package p000;

/* renamed from: bmds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmds extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmds f128852h;

    /* renamed from: i */
    private static volatile bxxk f128853i;

    /* renamed from: a */
    public int f128854a;

    /* renamed from: b */
    public bmqf f128855b;

    /* renamed from: c */
    public bmdb f128856c;

    /* renamed from: d */
    public String f128857d = "";

    /* renamed from: e */
    public bmnr f128858e;

    /* renamed from: f */
    public String f128859f = "";

    /* renamed from: g */
    public int f128860g;

    static {
        bmds bmds = new bmds();
        f128852h = bmds;
        GeneratedMessageLite.m124024a(bmds.class, bmds);
    }

    private bmds() {
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
            return GeneratedMessageLite.m124022a(f128852h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဌ\u0005\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", "f", "g", bmdq.f128851a, "e"});
        } else if (i2 == 3) {
            return new bmds();
        } else {
            if (i2 == 4) {
                return new bxvd(f128852h);
            }
            if (i2 == 5) {
                return f128852h;
            }
            bxxk bxxk = f128853i;
            if (bxxk == null) {
                synchronized (bmds.class) {
                    bxxk = f128853i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128852h);
                        f128853i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
