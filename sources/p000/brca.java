package p000;

/* renamed from: brca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brca extends bxvk implements bxxd {

    /* renamed from: b */
    public static final brca f142346b;

    /* renamed from: d */
    private static volatile bxxk f142347d;

    /* renamed from: a */
    public String f142348a = "";

    /* renamed from: c */
    private int f142349c;

    static {
        brca brca = new brca();
        f142346b = brca;
        bxvk.m124024a(brca.class, brca);
    }

    private brca() {
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
            return bxvk.m124022a(f142346b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brca();
        } else {
            if (i2 == 4) {
                return new bxvd(f142346b);
            }
            if (i2 == 5) {
                return f142346b;
            }
            bxxk bxxk = f142347d;
            if (bxxk == null) {
                synchronized (brca.class) {
                    bxxk = f142347d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142346b);
                        f142347d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
