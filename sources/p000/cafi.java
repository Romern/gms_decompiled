package p000;

/* renamed from: cafi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cafi f172907e;

    /* renamed from: f */
    private static volatile bxxk f172908f;

    /* renamed from: a */
    public int f172909a;

    /* renamed from: b */
    public boolean f172910b;

    /* renamed from: c */
    public cafj f172911c;

    /* renamed from: d */
    public cafj f172912d;

    static {
        cafi cafi = new cafi();
        f172907e = cafi;
        bxvk.m124024a(cafi.class, cafi);
    }

    private cafi() {
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
            return bxvk.m124022a(f172907e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cafi();
        } else {
            if (i2 == 4) {
                return new bxvd(f172907e);
            }
            if (i2 == 5) {
                return f172907e;
            }
            bxxk bxxk = f172908f;
            if (bxxk == null) {
                synchronized (cafi.class) {
                    bxxk = f172908f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172907e);
                        f172908f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
