package p000;

/* renamed from: bzin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzin extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzin f170212b;

    /* renamed from: d */
    private static volatile bxxk f170213d;

    /* renamed from: a */
    public bxtx f170214a = bxtx.f164797b;

    /* renamed from: c */
    private int f170215c;

    static {
        bzin bzin = new bzin();
        f170212b = bzin;
        bxvk.m124024a(bzin.class, bzin);
    }

    private bzin() {
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
            return bxvk.m124022a(f170212b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzin();
        } else {
            if (i2 == 4) {
                return new bxvd(f170212b);
            }
            if (i2 == 5) {
                return f170212b;
            }
            bxxk bxxk = f170213d;
            if (bxxk == null) {
                synchronized (bzin.class) {
                    bxxk = f170213d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170212b);
                        f170213d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
