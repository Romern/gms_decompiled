package p000;

/* renamed from: byjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byjp f166682e;

    /* renamed from: f */
    private static volatile bxxk f166683f;

    /* renamed from: a */
    public int f166684a;

    /* renamed from: b */
    public int f166685b;

    /* renamed from: c */
    public long f166686c;

    /* renamed from: d */
    public long f166687d;

    static {
        byjp byjp = new byjp();
        f166682e = byjp;
        bxvk.m124024a(byjp.class, byjp);
    }

    private byjp() {
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
            return bxvk.m124022a(f166682e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byjp();
        } else {
            if (i2 == 4) {
                return new bxvd(f166682e);
            }
            if (i2 == 5) {
                return f166682e;
            }
            bxxk bxxk = f166683f;
            if (bxxk == null) {
                synchronized (byjp.class) {
                    bxxk = f166683f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166682e);
                        f166683f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
