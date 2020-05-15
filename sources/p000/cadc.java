package p000;

/* renamed from: cadc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cadc f172654b;

    /* renamed from: d */
    private static volatile bxxk f172655d;

    /* renamed from: a */
    public int f172656a = 1;

    /* renamed from: c */
    private int f172657c;

    static {
        cadc cadc = new cadc();
        f172654b = cadc;
        GeneratedMessageLite.m124024a(cadc.class, cadc);
    }

    private cadc() {
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
            return GeneratedMessageLite.m124022a(f172654b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new cadc();
        } else {
            if (i2 == 4) {
                return new bxvd(f172654b);
            }
            if (i2 == 5) {
                return f172654b;
            }
            bxxk bxxk = f172655d;
            if (bxxk == null) {
                synchronized (cadc.class) {
                    bxxk = f172655d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172654b);
                        f172655d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
