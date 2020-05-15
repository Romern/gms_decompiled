package p000;

/* renamed from: bzgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzgu f169982c;

    /* renamed from: e */
    private static volatile bxxk f169983e;

    /* renamed from: a */
    public long f169984a;

    /* renamed from: b */
    public bzru f169985b;

    /* renamed from: d */
    private int f169986d;

    static {
        bzgu bzgu = new bzgu();
        f169982c = bzgu;
        bxvk.m124024a(bzgu.class, bzgu);
    }

    private bzgu() {
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
            return bxvk.m124022a(f169982c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzgu();
        } else {
            if (i2 == 4) {
                return new bxvd(f169982c);
            }
            if (i2 == 5) {
                return f169982c;
            }
            bxxk bxxk = f169983e;
            if (bxxk == null) {
                synchronized (bzgu.class) {
                    bxxk = f169983e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169982c);
                        f169983e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
