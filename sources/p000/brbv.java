package p000;

/* renamed from: brbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final brbv f142322b;

    /* renamed from: d */
    private static volatile bxxk f142323d;

    /* renamed from: a */
    public brbu f142324a;

    /* renamed from: c */
    private int f142325c;

    static {
        brbv brbv = new brbv();
        f142322b = brbv;
        bxvk.m124024a(brbv.class, brbv);
    }

    private brbv() {
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
            return bxvk.m124022a(f142322b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brbv();
        } else {
            if (i2 == 4) {
                return new bxvd(f142322b);
            }
            if (i2 == 5) {
                return f142322b;
            }
            bxxk bxxk = f142323d;
            if (bxxk == null) {
                synchronized (brbv.class) {
                    bxxk = f142323d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142322b);
                        f142323d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
