package p000;

/* renamed from: brbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brbf f142241d;

    /* renamed from: e */
    private static volatile bxxk f142242e;

    /* renamed from: a */
    public int f142243a;

    /* renamed from: b */
    public brak f142244b;

    /* renamed from: c */
    public String f142245c = "";

    static {
        brbf brbf = new brbf();
        f142241d = brbf;
        bxvk.m124024a(brbf.class, brbf);
    }

    private brbf() {
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
            return bxvk.m124022a(f142241d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f142241d);
            }
            if (i2 == 5) {
                return f142241d;
            }
            bxxk bxxk = f142242e;
            if (bxxk == null) {
                synchronized (brbf.class) {
                    bxxk = f142242e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142241d);
                        f142242e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
