package p000;

/* renamed from: bojn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bojn f133305d;

    /* renamed from: e */
    private static volatile bxxk f133306e;

    /* renamed from: a */
    public int f133307a;

    /* renamed from: b */
    public int f133308b;

    /* renamed from: c */
    public long f133309c;

    static {
        bojn bojn = new bojn();
        f133305d = bojn;
        bxvk.m124024a(bojn.class, bojn);
    }

    private bojn() {
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
            return bxvk.m124022a(f133305d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bojm.f133304a, "c"});
        } else if (i2 == 3) {
            return new bojn();
        } else {
            if (i2 == 4) {
                return new bxvd(f133305d);
            }
            if (i2 == 5) {
                return f133305d;
            }
            bxxk bxxk = f133306e;
            if (bxxk == null) {
                synchronized (bojn.class) {
                    bxxk = f133306e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133305d);
                        f133306e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
