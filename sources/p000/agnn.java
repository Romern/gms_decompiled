package p000;

/* renamed from: agnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final agnn f66131b;

    /* renamed from: c */
    private static volatile bxxk f66132c;

    /* renamed from: a */
    public bxwc f66133a = bxxn.f165040b;

    static {
        agnn agnn = new agnn();
        f66131b = agnn;
        bxvk.m124024a(agnn.class, agnn);
    }

    private agnn() {
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
            return bxvk.m124022a(f66131b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", agnj.class});
        } else if (i2 == 3) {
            return new agnn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f66131b;
            }
            bxxk bxxk = f66132c;
            if (bxxk == null) {
                synchronized (agnn.class) {
                    bxxk = f66132c;
                    if (bxxk == null) {
                        bxxk = new bxve(f66131b);
                        f66132c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
