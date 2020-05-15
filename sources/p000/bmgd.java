package p000;

/* renamed from: bmgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgd extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bmgd f129213j;

    /* renamed from: l */
    private static volatile bxxk f129214l;

    /* renamed from: a */
    public int f129215a;

    /* renamed from: b */
    public long f129216b;

    /* renamed from: c */
    public String f129217c = "";

    /* renamed from: d */
    public bmno f129218d;

    /* renamed from: e */
    public bmfu f129219e;

    /* renamed from: f */
    public bxwc f129220f = bxxn.f165040b;

    /* renamed from: g */
    public boolean f129221g;

    /* renamed from: h */
    public bmfy f129222h;

    /* renamed from: i */
    public int f129223i;

    /* renamed from: k */
    private byte f129224k = 2;

    static {
        bmgd bmgd = new bmgd();
        f129213j = bmgd;
        GeneratedMessageLite.m124024a(bmgd.class, bmgd);
    }

    private bmgd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129224k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129224k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f129213j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0002\u0001ဈ\u0001\u0004ᐉ\u0004\u0005Л\u0006ဇ\u0005\u0007ဂ\u0000\bဉ\u0002\tဉ\u0006\nဌ\u0007", new Object[]{"a", "c", "e", "f", bmfu.class, "g", "b", "d", "h", "i", bmgb.f129212a});
        } else if (i2 == 3) {
            return new bmgd();
        } else {
            if (i2 == 4) {
                return new bxvd(f129213j);
            }
            if (i2 == 5) {
                return f129213j;
            }
            bxxk bxxk = f129214l;
            if (bxxk == null) {
                synchronized (bmgd.class) {
                    bxxk = f129214l;
                    if (bxxk == null) {
                        bxxk = new bxve(f129213j);
                        f129214l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
