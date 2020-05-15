package p000;

/* renamed from: btub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btub extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final btub f150439j;

    /* renamed from: k */
    private static volatile bxxk f150440k;

    /* renamed from: a */
    public int f150441a;

    /* renamed from: b */
    public btsi f150442b;

    /* renamed from: c */
    public String f150443c = "";

    /* renamed from: d */
    public String f150444d = "";

    /* renamed from: e */
    public String f150445e = "";

    /* renamed from: f */
    public String f150446f = "";

    /* renamed from: g */
    public String f150447g = "";

    /* renamed from: h */
    public String f150448h = "";

    /* renamed from: i */
    public bzvu f150449i;

    static {
        btub btub = new btub();
        f150439j = btub;
        GeneratedMessageLite.m124024a(btub.class, btub);
    }

    private btub() {
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
            return GeneratedMessageLite.m124022a(f150439j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new btub();
        } else {
            if (i2 == 4) {
                return new bxvd(f150439j);
            }
            if (i2 == 5) {
                return f150439j;
            }
            bxxk bxxk = f150440k;
            if (bxxk == null) {
                synchronized (btub.class) {
                    bxxk = f150440k;
                    if (bxxk == null) {
                        bxxk = new bxve(f150439j);
                        f150440k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
