package p000;

/* renamed from: bzgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzgp f169964c;

    /* renamed from: d */
    private static volatile bxxk f169965d;

    /* renamed from: a */
    public int f169966a;

    /* renamed from: b */
    public String f169967b = "";

    static {
        bzgp bzgp = new bzgp();
        f169964c = bzgp;
        bxvk.m124024a(bzgp.class, bzgp);
    }

    private bzgp() {
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
            return bxvk.m124022a(f169964c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzgp();
        } else {
            if (i2 == 4) {
                return new bxvd(f169964c);
            }
            if (i2 == 5) {
                return f169964c;
            }
            bxxk bxxk = f169965d;
            if (bxxk == null) {
                synchronized (bzgp.class) {
                    bxxk = f169965d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169964c);
                        f169965d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
