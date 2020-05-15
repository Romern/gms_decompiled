package p000;

/* renamed from: cahl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cahl f174556d;

    /* renamed from: f */
    private static volatile bxxk f174557f;

    /* renamed from: a */
    public long f174558a = 1048576;

    /* renamed from: b */
    public bxwc f174559b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f174560c;

    /* renamed from: e */
    private int f174561e;

    static {
        cahl cahl = new cahl();
        f174556d = cahl;
        GeneratedMessageLite.m124024a(cahl.class, cahl);
    }

    private cahl() {
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
            return GeneratedMessageLite.m124022a(f174556d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", cahk.class, "c"});
        } else if (i2 == 3) {
            return new cahl();
        } else {
            if (i2 == 4) {
                return new bxvd(f174556d);
            }
            if (i2 == 5) {
                return f174556d;
            }
            bxxk bxxk = f174557f;
            if (bxxk == null) {
                synchronized (cahl.class) {
                    bxxk = f174557f;
                    if (bxxk == null) {
                        bxxk = new bxve(f174556d);
                        f174557f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
