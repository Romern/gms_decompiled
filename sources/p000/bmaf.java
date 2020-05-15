package p000;

/* renamed from: bmaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmaf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmaf f128436d;

    /* renamed from: f */
    private static volatile bxxk f128437f;

    /* renamed from: a */
    public String f128438a = "";

    /* renamed from: b */
    public int f128439b;

    /* renamed from: c */
    public int f128440c = -1;

    /* renamed from: e */
    private int f128441e;

    static {
        bmaf bmaf = new bmaf();
        f128436d = bmaf;
        bxvk.m124024a(bmaf.class, bmaf);
    }

    private bmaf() {
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
            return bxvk.m124022a(f128436d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bmaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f128436d);
            }
            if (i2 == 5) {
                return f128436d;
            }
            bxxk bxxk = f128437f;
            if (bxxk == null) {
                synchronized (bmaf.class) {
                    bxxk = f128437f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128436d);
                        f128437f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
