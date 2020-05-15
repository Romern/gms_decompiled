package p000;

/* renamed from: xah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xah extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final xah f51741c;

    /* renamed from: d */
    private static volatile bxxk f51742d;

    /* renamed from: a */
    public int f51743a;

    /* renamed from: b */
    public int f51744b;

    static {
        xah xah = new xah();
        f51741c = xah;
        GeneratedMessageLite.m124024a(xah.class, xah);
    }

    private xah() {
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
            return GeneratedMessageLite.m124022a(f51741c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", xag.m42557b()});
        } else if (i2 == 3) {
            return new xah();
        } else {
            if (i2 == 4) {
                return new bxvd(f51741c);
            }
            if (i2 == 5) {
                return f51741c;
            }
            bxxk bxxk = f51742d;
            if (bxxk == null) {
                synchronized (xah.class) {
                    bxxk = f51742d;
                    if (bxxk == null) {
                        bxxk = new bxve(f51741c);
                        f51742d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
