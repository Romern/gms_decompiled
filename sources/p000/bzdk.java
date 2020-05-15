package p000;

/* renamed from: bzdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdk extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bzdk f169504n;

    /* renamed from: o */
    private static volatile bxxk f169505o;

    /* renamed from: a */
    public int f169506a;

    /* renamed from: b */
    public long f169507b;

    /* renamed from: c */
    public String f169508c = "";

    /* renamed from: d */
    public String f169509d = "";

    /* renamed from: e */
    public String f169510e = "";

    /* renamed from: f */
    public String f169511f = "";

    /* renamed from: g */
    public boolean f169512g;

    /* renamed from: h */
    public boolean f169513h;

    /* renamed from: i */
    public boolean f169514i;

    /* renamed from: j */
    public String f169515j = "";

    /* renamed from: k */
    public String f169516k = "";

    /* renamed from: l */
    public boolean f169517l;

    /* renamed from: m */
    public String f169518m = "";

    static {
        bzdk bzdk = new bzdk();
        f169504n = bzdk;
        GeneratedMessageLite.m124024a(bzdk.class, bzdk);
    }

    private bzdk() {
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
            return GeneratedMessageLite.m124022a(f169504n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဈ\b\nဈ\t\u000bဇ\n\fဈ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bzdk();
        } else {
            if (i2 == 4) {
                return new bxvd(f169504n);
            }
            if (i2 == 5) {
                return f169504n;
            }
            bxxk bxxk = f169505o;
            if (bxxk == null) {
                synchronized (bzdk.class) {
                    bxxk = f169505o;
                    if (bxxk == null) {
                        bxxk = new bxve(f169504n);
                        f169505o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
