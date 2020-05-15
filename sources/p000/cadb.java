package p000;

/* renamed from: cadb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cadb f172650b;

    /* renamed from: d */
    private static volatile bxxk f172651d;

    /* renamed from: a */
    public cada f172652a;

    /* renamed from: c */
    private int f172653c;

    static {
        cadb cadb = new cadb();
        f172650b = cadb;
        bxvk.m124024a(cadb.class, cadb);
    }

    private cadb() {
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
            return bxvk.m124022a(f172650b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new cadb();
        } else {
            if (i2 == 4) {
                return new bxvd(f172650b);
            }
            if (i2 == 5) {
                return f172650b;
            }
            bxxk bxxk = f172651d;
            if (bxxk == null) {
                synchronized (cadb.class) {
                    bxxk = f172651d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172650b);
                        f172651d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
