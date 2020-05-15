package p000;

/* renamed from: amkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amkz extends bxvk implements bxxd {

    /* renamed from: f */
    public static final amkz f75139f;

    /* renamed from: g */
    private static volatile bxxk f75140g;

    /* renamed from: a */
    public int f75141a;

    /* renamed from: b */
    public int f75142b;

    /* renamed from: c */
    public int f75143c;

    /* renamed from: d */
    public long f75144d;

    /* renamed from: e */
    public int f75145e;

    static {
        amkz amkz = new amkz();
        f75139f = amkz;
        bxvk.m124024a(amkz.class, amkz);
    }

    private amkz() {
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
            return bxvk.m124022a(f75139f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0005ဂ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", amjg.f74995a, "c", "d", "e", amjh.f74996a});
        } else if (i2 == 3) {
            return new amkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f75139f);
            }
            if (i2 == 5) {
                return f75139f;
            }
            bxxk bxxk = f75140g;
            if (bxxk == null) {
                synchronized (amkz.class) {
                    bxxk = f75140g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75139f);
                        f75140g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
