package p000;

/* renamed from: qgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final qgq f41203e;

    /* renamed from: f */
    private static volatile bxxk f41204f;

    /* renamed from: a */
    public int f41205a;

    /* renamed from: b */
    public long f41206b;

    /* renamed from: c */
    public long f41207c;

    /* renamed from: d */
    public qgr f41208d;

    static {
        qgq qgq = new qgq();
        f41203e = qgq;
        bxvk.m124024a(qgq.class, qgq);
    }

    private qgq() {
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
            return bxvk.m124022a(f41203e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new qgq();
        } else {
            if (i2 == 4) {
                return new bxvd(f41203e);
            }
            if (i2 == 5) {
                return f41203e;
            }
            bxxk bxxk = f41204f;
            if (bxxk == null) {
                synchronized (qgq.class) {
                    bxxk = f41204f;
                    if (bxxk == null) {
                        bxxk = new bxve(f41203e);
                        f41204f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
