package p000;

/* renamed from: buyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buyr f155331c;

    /* renamed from: d */
    private static volatile bxxk f155332d;

    /* renamed from: a */
    public int f155333a;

    /* renamed from: b */
    public bvaa f155334b;

    static {
        buyr buyr = new buyr();
        f155331c = buyr;
        GeneratedMessageLite.m124024a(buyr.class, buyr);
    }

    private buyr() {
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
            return GeneratedMessageLite.m124022a(f155331c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f155331c);
            }
            if (i2 == 5) {
                return f155331c;
            }
            bxxk bxxk = f155332d;
            if (bxxk == null) {
                synchronized (buyr.class) {
                    bxxk = f155332d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155331c);
                        f155332d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
