package p000;

/* renamed from: quh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final quh f42136e;

    /* renamed from: f */
    private static volatile bxxk f42137f;

    /* renamed from: a */
    public int f42138a;

    /* renamed from: b */
    public int f42139b;

    /* renamed from: c */
    public qus f42140c;

    /* renamed from: d */
    public qut f42141d;

    static {
        quh quh = new quh();
        f42136e = quh;
        bxvk.m124024a(quh.class, quh);
    }

    private quh() {
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
            return bxvk.m124022a(f42136e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", quf.f42135a, "c", "d"});
        } else if (i2 == 3) {
            return new quh();
        } else {
            if (i2 == 4) {
                return new bxvd(f42136e);
            }
            if (i2 == 5) {
                return f42136e;
            }
            bxxk bxxk = f42137f;
            if (bxxk == null) {
                synchronized (quh.class) {
                    bxxk = f42137f;
                    if (bxxk == null) {
                        bxxk = new bxve(f42136e);
                        f42137f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
