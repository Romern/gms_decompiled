package p000;

/* renamed from: budb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final budb f153444c;

    /* renamed from: e */
    private static volatile bxxk f153445e;

    /* renamed from: a */
    public float f153446a;

    /* renamed from: b */
    public float f153447b;

    /* renamed from: d */
    private int f153448d;

    static {
        budb budb = new budb();
        f153444c = budb;
        bxvk.m124024a(budb.class, budb);
    }

    private budb() {
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
            return bxvk.m124022a(f153444c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new budb();
        } else {
            if (i2 == 4) {
                return new bxvd(f153444c);
            }
            if (i2 == 5) {
                return f153444c;
            }
            bxxk bxxk = f153445e;
            if (bxxk == null) {
                synchronized (budb.class) {
                    bxxk = f153445e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153444c);
                        f153445e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
