package p000;

/* renamed from: cair */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cair extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cair f174760d;

    /* renamed from: e */
    private static volatile bxxk f174761e;

    /* renamed from: a */
    public int f174762a;

    /* renamed from: b */
    public long f174763b;

    /* renamed from: c */
    public boolean f174764c;

    static {
        cair cair = new cair();
        f174760d = cair;
        GeneratedMessageLite.m124024a(cair.class, cair);
    }

    private cair() {
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
            return GeneratedMessageLite.m124022a(f174760d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cair();
        } else {
            if (i2 == 4) {
                return new bxvd(f174760d);
            }
            if (i2 == 5) {
                return f174760d;
            }
            bxxk bxxk = f174761e;
            if (bxxk == null) {
                synchronized (cair.class) {
                    bxxk = f174761e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174760d);
                        f174761e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
