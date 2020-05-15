package p000;

/* renamed from: bzjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjc extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bzjc f170265j;

    /* renamed from: k */
    private static volatile bxxk f170266k;

    /* renamed from: a */
    public int f170267a;

    /* renamed from: b */
    public int f170268b;

    /* renamed from: c */
    public String f170269c = "";

    /* renamed from: d */
    public String f170270d = "";

    /* renamed from: e */
    public String f170271e = "";

    /* renamed from: f */
    public String f170272f = "";

    /* renamed from: g */
    public long f170273g;

    /* renamed from: h */
    public bzhj f170274h;

    /* renamed from: i */
    public bzhz f170275i;

    static {
        bzjc bzjc = new bzjc();
        f170265j = bzjc;
        GeneratedMessageLite.m124024a(bzjc.class, bzjc);
    }

    private bzjc() {
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
            return GeneratedMessageLite.m124022a(f170265j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဌ\u0000\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0007\bဈ\b\tဂ\t\u000bဉ\u000b\fဉ\f", new Object[]{"a", "b", bzja.f170264a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bzjc();
        } else {
            if (i2 == 4) {
                return new bxvd(f170265j);
            }
            if (i2 == 5) {
                return f170265j;
            }
            bxxk bxxk = f170266k;
            if (bxxk == null) {
                synchronized (bzjc.class) {
                    bxxk = f170266k;
                    if (bxxk == null) {
                        bxxk = new bxve(f170265j);
                        f170266k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
