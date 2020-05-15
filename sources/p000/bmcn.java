package p000;

/* renamed from: bmcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmcn f128722c;

    /* renamed from: d */
    private static volatile bxxk f128723d;

    /* renamed from: a */
    public int f128724a;

    /* renamed from: b */
    public String f128725b = "";

    static {
        bmcn bmcn = new bmcn();
        f128722c = bmcn;
        GeneratedMessageLite.m124024a(bmcn.class, bmcn);
    }

    private bmcn() {
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
            return GeneratedMessageLite.m124022a(f128722c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmcn();
        } else {
            if (i2 == 4) {
                return new bxvd(f128722c);
            }
            if (i2 == 5) {
                return f128722c;
            }
            bxxk bxxk = f128723d;
            if (bxxk == null) {
                synchronized (bmcn.class) {
                    bxxk = f128723d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128722c);
                        f128723d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
