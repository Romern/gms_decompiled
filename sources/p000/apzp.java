package p000;

/* renamed from: apzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final apzp f85276e;

    /* renamed from: f */
    private static volatile bxxk f85277f;

    /* renamed from: a */
    public int f85278a;

    /* renamed from: b */
    public int f85279b;

    /* renamed from: c */
    public int f85280c;

    /* renamed from: d */
    public String f85281d = "";

    static {
        apzp apzp = new apzp();
        f85276e = apzp;
        bxvk.m124024a(apzp.class, apzp);
    }

    private apzp() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f85276e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", apzn.f85275a, "c", "d"});
        } else if (i2 == 3) {
            return new apzp();
        } else {
            if (i2 == 4) {
                return new bxvd(f85276e);
            }
            if (i2 == 5) {
                return f85276e;
            }
            bxxk bxxk = f85277f;
            if (bxxk == null) {
                synchronized (apzp.class) {
                    bxxk = f85277f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85276e);
                        f85277f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
