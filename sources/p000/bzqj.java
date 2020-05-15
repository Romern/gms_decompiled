package p000;

/* renamed from: bzqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzqj f171010c;

    /* renamed from: e */
    private static volatile bxxk f171011e;

    /* renamed from: a */
    public String f171012a = "";

    /* renamed from: b */
    public int f171013b = 1000;

    /* renamed from: d */
    private int f171014d;

    static {
        bzqj bzqj = new bzqj();
        f171010c = bzqj;
        bxvk.m124024a(bzqj.class, bzqj);
    }

    private bzqj() {
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
            return bxvk.m124022a(f171010c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzqj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171010c);
            }
            if (i2 == 5) {
                return f171010c;
            }
            bxxk bxxk = f171011e;
            if (bxxk == null) {
                synchronized (bzqj.class) {
                    bxxk = f171011e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171010c);
                        f171011e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
