package p000;

/* renamed from: bugi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bugi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bugi f153782c;

    /* renamed from: d */
    private static volatile bxxk f153783d;

    /* renamed from: a */
    public int f153784a;

    /* renamed from: b */
    public int f153785b;

    static {
        bugi bugi = new bugi();
        f153782c = bugi;
        bxvk.m124024a(bugi.class, bugi);
    }

    private bugi() {
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
            return bxvk.m124022a(f153782c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bugg.f153781a});
        } else if (i2 == 3) {
            return new bugi();
        } else {
            if (i2 == 4) {
                return new bxvd(f153782c);
            }
            if (i2 == 5) {
                return f153782c;
            }
            bxxk bxxk = f153783d;
            if (bxxk == null) {
                synchronized (bugi.class) {
                    bxxk = f153783d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153782c);
                        f153783d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
