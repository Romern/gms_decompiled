package p000;

/* renamed from: cadd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cadd f172658c;

    /* renamed from: e */
    private static volatile bxxk f172659e;

    /* renamed from: a */
    public cada f172660a;

    /* renamed from: b */
    public caaw f172661b;

    /* renamed from: d */
    private int f172662d;

    static {
        cadd cadd = new cadd();
        f172658c = cadd;
        bxvk.m124024a(cadd.class, cadd);
    }

    private cadd() {
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
            return bxvk.m124022a(f172658c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cadd();
        } else {
            if (i2 == 4) {
                return new bxvd(f172658c);
            }
            if (i2 == 5) {
                return f172658c;
            }
            bxxk bxxk = f172659e;
            if (bxxk == null) {
                synchronized (cadd.class) {
                    bxxk = f172659e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172658c);
                        f172659e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
