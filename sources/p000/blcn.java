package p000;

/* renamed from: blcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blcn f125945b;

    /* renamed from: d */
    private static volatile bxxk f125946d;

    /* renamed from: a */
    public String f125947a = "";

    /* renamed from: c */
    private int f125948c;

    static {
        blcn blcn = new blcn();
        f125945b = blcn;
        bxvk.m124024a(blcn.class, blcn);
    }

    private blcn() {
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
            return bxvk.m124022a(f125945b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blcn();
        } else {
            if (i2 == 4) {
                return new bxvd(f125945b);
            }
            if (i2 == 5) {
                return f125945b;
            }
            bxxk bxxk = f125946d;
            if (bxxk == null) {
                synchronized (blcn.class) {
                    bxxk = f125946d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125945b);
                        f125946d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
