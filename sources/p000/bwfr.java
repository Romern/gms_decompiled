package p000;

/* renamed from: bwfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfr extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bwfr f159113m;

    /* renamed from: n */
    private static volatile bxxk f159114n;

    /* renamed from: a */
    public int f159115a;

    /* renamed from: b */
    public int f159116b = 0;

    /* renamed from: c */
    public Object f159117c;

    /* renamed from: d */
    public String f159118d = "";

    /* renamed from: e */
    public int f159119e;

    /* renamed from: f */
    public bxvw f159120f = bxwq.f165002b;

    /* renamed from: g */
    public int f159121g;

    /* renamed from: h */
    public int f159122h;

    /* renamed from: i */
    public int f159123i;

    /* renamed from: j */
    public long f159124j;

    /* renamed from: k */
    public int f159125k;

    /* renamed from: l */
    public int f159126l;

    static {
        bwfr bwfr = new bwfr();
        f159113m = bwfr;
        GeneratedMessageLite.m124024a(bwfr.class, bwfr);
    }

    private bwfr() {
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
            return GeneratedMessageLite.m124022a(f159113m, "\u0001\u0014\u0001\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003%\u0004ဌ\u0002\u0005င\u0003\u0006င\u0004\u0007ဂ\u0005\bဌ\u0006\tင\u0007\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", bwfe.m121903b(), "h", "i", "j", "k", bwfk.f159088a, "l", bwfq.class, bwfu.class, bwfo.class, bwga.class, bwfp.class, bwfx.class, bwfv.class, bwfw.class, bwgb.class, bwfz.class, bwfs.class});
        } else if (i2 == 3) {
            return new bwfr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f159113m;
            }
            bxxk bxxk = f159114n;
            if (bxxk == null) {
                synchronized (bwfr.class) {
                    bxxk = f159114n;
                    if (bxxk == null) {
                        bxxk = new bxve(f159113m);
                        f159114n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
