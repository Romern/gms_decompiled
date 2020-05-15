package p000;

/* renamed from: bsme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsme extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsme f145004b;

    /* renamed from: d */
    private static volatile bxxk f145005d;

    /* renamed from: a */
    public String f145006a = "";

    /* renamed from: c */
    private int f145007c;

    static {
        bsme bsme = new bsme();
        f145004b = bsme;
        bxvk.m124024a(bsme.class, bsme);
    }

    private bsme() {
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
            return bxvk.m124022a(f145004b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsme();
        } else {
            if (i2 == 4) {
                return new bxvd(f145004b);
            }
            if (i2 == 5) {
                return f145004b;
            }
            bxxk bxxk = f145005d;
            if (bxxk == null) {
                synchronized (bsme.class) {
                    bxxk = f145005d;
                    if (bxxk == null) {
                        bxxk = new bxve(f145004b);
                        f145005d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
