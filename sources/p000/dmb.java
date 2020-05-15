package p000;

/* renamed from: dmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final dmb f13483f;

    /* renamed from: g */
    private static volatile bxxk f13484g;

    /* renamed from: a */
    public int f13485a;

    /* renamed from: b */
    public String f13486b = "";

    /* renamed from: c */
    public String f13487c = "";

    /* renamed from: d */
    public String f13488d = "";

    /* renamed from: e */
    public int f13489e;

    static {
        dmb dmb = new dmb();
        f13483f = dmb;
        GeneratedMessageLite.m124024a(dmb.class, dmb);
    }

    private dmb() {
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
            return GeneratedMessageLite.m124022a(f13483f, "\u0001\u0004\u0000\u0001\u0001d\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002dင\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new dmb();
        } else {
            if (i2 == 4) {
                return new bxvd(f13483f);
            }
            if (i2 == 5) {
                return f13483f;
            }
            bxxk bxxk = f13484g;
            if (bxxk == null) {
                synchronized (dmb.class) {
                    bxxk = f13484g;
                    if (bxxk == null) {
                        bxxk = new bxve(f13483f);
                        f13484g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
