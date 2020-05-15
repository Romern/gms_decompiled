package p000;

/* renamed from: akkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final akkp f72169e;

    /* renamed from: f */
    private static volatile bxxk f72170f;

    /* renamed from: a */
    public int f72171a;

    /* renamed from: b */
    public String f72172b = "";

    /* renamed from: c */
    public String f72173c = "";

    /* renamed from: d */
    public caet f72174d;

    static {
        akkp akkp = new akkp();
        f72169e = akkp;
        GeneratedMessageLite.m124024a(akkp.class, akkp);
    }

    private akkp() {
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
            return GeneratedMessageLite.m124022a(f72169e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new akkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f72169e);
            }
            if (i2 == 5) {
                return f72169e;
            }
            bxxk bxxk = f72170f;
            if (bxxk == null) {
                synchronized (akkp.class) {
                    bxxk = f72170f;
                    if (bxxk == null) {
                        bxxk = new bxve(f72169e);
                        f72170f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
