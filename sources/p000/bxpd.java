package p000;

/* renamed from: bxpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxpd f164240f;

    /* renamed from: g */
    private static volatile bxxk f164241g;

    /* renamed from: a */
    public int f164242a;

    /* renamed from: b */
    public int f164243b;

    /* renamed from: c */
    public boolean f164244c;

    /* renamed from: d */
    public boolean f164245d;

    /* renamed from: e */
    public boolean f164246e;

    static {
        bxpd bxpd = new bxpd();
        f164240f = bxpd;
        GeneratedMessageLite.m124024a(bxpd.class, bxpd);
    }

    private bxpd() {
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
            return GeneratedMessageLite.m124022a(f164240f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f164240f);
            }
            if (i2 == 5) {
                return f164240f;
            }
            bxxk bxxk = f164241g;
            if (bxxk == null) {
                synchronized (bxpd.class) {
                    bxxk = f164241g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164240f);
                        f164241g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
