package p000;

/* renamed from: bvey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvey extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bvey f155813m;

    /* renamed from: n */
    private static volatile bxxk f155814n;

    /* renamed from: a */
    public int f155815a;

    /* renamed from: b */
    public int f155816b;

    /* renamed from: c */
    public int f155817c;

    /* renamed from: d */
    public int f155818d;

    /* renamed from: e */
    public bvew f155819e;

    /* renamed from: f */
    public bves f155820f;

    /* renamed from: g */
    public bveu f155821g;

    /* renamed from: h */
    public bvet f155822h;

    /* renamed from: i */
    public long f155823i;

    /* renamed from: j */
    public long f155824j;

    /* renamed from: k */
    public bvex f155825k;

    /* renamed from: l */
    public bvev f155826l;

    static {
        bvey bvey = new bvey();
        f155813m = bvey;
        GeneratedMessageLite.m124024a(bvey.class, bvey);
    }

    private bvey() {
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
            return GeneratedMessageLite.m124022a(f155813m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဂ\u0007\tဂ\b\nဉ\t\u000bဉ\n", new Object[]{"a", "b", "c", bvis.f156294a, "d", bvix.f156298a, "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bvey();
        } else {
            if (i2 == 4) {
                return new bxvd(f155813m);
            }
            if (i2 == 5) {
                return f155813m;
            }
            bxxk bxxk = f155814n;
            if (bxxk == null) {
                synchronized (bvey.class) {
                    bxxk = f155814n;
                    if (bxxk == null) {
                        bxxk = new bxve(f155813m);
                        f155814n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
