package p000;

/* renamed from: bzij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzij extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bzij f170187k;

    /* renamed from: m */
    private static volatile bxxk f170188m;

    /* renamed from: a */
    public String f170189a = "";

    /* renamed from: b */
    public String f170190b = "";

    /* renamed from: c */
    public String f170191c = "";

    /* renamed from: d */
    public String f170192d = "";

    /* renamed from: e */
    public boolean f170193e;

    /* renamed from: f */
    public String f170194f = "";

    /* renamed from: g */
    public String f170195g = "";

    /* renamed from: h */
    public String f170196h = "";

    /* renamed from: i */
    public String f170197i = "";

    /* renamed from: j */
    public String f170198j = "";

    /* renamed from: l */
    private int f170199l;

    static {
        bzij bzij = new bzij();
        f170187k = bzij;
        bxvk.m124024a(bzij.class, bzij);
    }

    private bzij() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f170187k, "\u0001\n\u0000\u0001\u0002\u0012\n\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ဈ\u0006\nဈ\t\u000bဇ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e\u0012ဈ\u0011", new Object[]{"l", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bzij();
        } else {
            if (i2 == 4) {
                return new bxvd(f170187k);
            }
            if (i2 == 5) {
                return f170187k;
            }
            bxxk bxxk = f170188m;
            if (bxxk == null) {
                synchronized (bzij.class) {
                    bxxk = f170188m;
                    if (bxxk == null) {
                        bxxk = new bxve(f170187k);
                        f170188m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
