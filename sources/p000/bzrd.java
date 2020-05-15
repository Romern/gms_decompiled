package p000;

/* renamed from: bzrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzrd f171102d;

    /* renamed from: f */
    private static volatile bxxk f171103f;

    /* renamed from: a */
    public String f171104a = "";

    /* renamed from: b */
    public String f171105b = "";

    /* renamed from: c */
    public String f171106c = "";

    /* renamed from: e */
    private int f171107e;

    static {
        bzrd bzrd = new bzrd();
        f171102d = bzrd;
        bxvk.m124024a(bzrd.class, bzrd);
    }

    private bzrd() {
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
            return bxvk.m124022a(f171102d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bzrd();
        } else {
            if (i2 == 4) {
                return new bxvd(f171102d);
            }
            if (i2 == 5) {
                return f171102d;
            }
            bxxk bxxk = f171103f;
            if (bxxk == null) {
                synchronized (bzrd.class) {
                    bxxk = f171103f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171102d);
                        f171103f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
