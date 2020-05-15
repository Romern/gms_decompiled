package p000;

/* renamed from: byxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byxb f168698d;

    /* renamed from: e */
    private static volatile bxxk f168699e;

    /* renamed from: a */
    public int f168700a;

    /* renamed from: b */
    public String f168701b = "";

    /* renamed from: c */
    public String f168702c = "";

    static {
        byxb byxb = new byxb();
        f168698d = byxb;
        GeneratedMessageLite.m124024a(byxb.class, byxb);
    }

    private byxb() {
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
            return GeneratedMessageLite.m124022a(f168698d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byxb();
        } else {
            if (i2 == 4) {
                return new bxvd(f168698d);
            }
            if (i2 == 5) {
                return f168698d;
            }
            bxxk bxxk = f168699e;
            if (bxxk == null) {
                synchronized (byxb.class) {
                    bxxk = f168699e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168698d);
                        f168699e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
