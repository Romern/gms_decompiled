package p000;

/* renamed from: bzev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzev extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzev f169732c;

    /* renamed from: d */
    private static volatile bxxk f169733d;

    /* renamed from: a */
    public int f169734a;

    /* renamed from: b */
    public int f169735b;

    static {
        bzev bzev = new bzev();
        f169732c = bzev;
        bxvk.m124024a(bzev.class, bzev);
    }

    private bzev() {
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
            return bxvk.m124022a(f169732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzev();
        } else {
            if (i2 == 4) {
                return new bxvd(f169732c);
            }
            if (i2 == 5) {
                return f169732c;
            }
            bxxk bxxk = f169733d;
            if (bxxk == null) {
                synchronized (bzev.class) {
                    bxxk = f169733d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169732c);
                        f169733d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
