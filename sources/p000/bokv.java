package p000;

/* renamed from: bokv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bokv f133458e;

    /* renamed from: f */
    private static volatile bxxk f133459f;

    /* renamed from: a */
    public int f133460a;

    /* renamed from: b */
    public String f133461b = "";

    /* renamed from: c */
    public String f133462c = "";

    /* renamed from: d */
    public boolean f133463d;

    static {
        bokv bokv = new bokv();
        f133458e = bokv;
        bxvk.m124024a(bokv.class, bokv);
    }

    private bokv() {
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
            return bxvk.m124022a(f133458e, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0000\u0000\u0005ဈ\u0000\u0006ဈ\u0001\u0007ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bokv();
        } else {
            if (i2 == 4) {
                return new bxvd(f133458e);
            }
            if (i2 == 5) {
                return f133458e;
            }
            bxxk bxxk = f133459f;
            if (bxxk == null) {
                synchronized (bokv.class) {
                    bxxk = f133459f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133458e);
                        f133459f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
