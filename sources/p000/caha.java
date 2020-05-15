package p000;

/* renamed from: caha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caha extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final caha f174517c;

    /* renamed from: e */
    private static volatile bxxk f174518e;

    /* renamed from: a */
    public String f174519a = "";

    /* renamed from: b */
    public int f174520b;

    /* renamed from: d */
    private int f174521d;

    static {
        caha caha = new caha();
        f174517c = caha;
        GeneratedMessageLite.m124024a(caha.class, caha);
    }

    private caha() {
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
            return GeneratedMessageLite.m124022a(f174517c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", cagz.m126623b()});
        } else if (i2 == 3) {
            return new caha();
        } else {
            if (i2 == 4) {
                return new bxvd(f174517c);
            }
            if (i2 == 5) {
                return f174517c;
            }
            bxxk bxxk = f174518e;
            if (bxxk == null) {
                synchronized (caha.class) {
                    bxxk = f174518e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174517c);
                        f174518e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
