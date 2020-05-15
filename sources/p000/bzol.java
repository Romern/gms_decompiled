package p000;

/* renamed from: bzol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzol extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzol f170830c;

    /* renamed from: d */
    private static volatile bxxk f170831d;

    /* renamed from: a */
    public bzoa f170832a;

    /* renamed from: b */
    public long f170833b;

    static {
        bzol bzol = new bzol();
        f170830c = bzol;
        bxvk.m124024a(bzol.class, bzol);
    }

    private bzol() {
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
            return bxvk.m124022a(f170830c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzol();
        } else {
            if (i2 == 4) {
                return new bxvd(f170830c);
            }
            if (i2 == 5) {
                return f170830c;
            }
            bxxk bxxk = f170831d;
            if (bxxk == null) {
                synchronized (bzol.class) {
                    bxxk = f170831d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170830c);
                        f170831d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
