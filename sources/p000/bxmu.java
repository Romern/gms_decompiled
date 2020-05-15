package p000;

/* renamed from: bxmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxmu f163984b;

    /* renamed from: c */
    public static final bxvj f163985c;

    /* renamed from: e */
    private static volatile bxxk f163986e;

    /* renamed from: a */
    public int f163987a;

    /* renamed from: d */
    private int f163988d;

    static {
        bxmu bxmu = new bxmu();
        f163984b = bxmu;
        bxvk.m124024a(bxmu.class, bxmu);
        bxcf bxcf = bxcf.f162779a;
        bxmu bxmu2 = f163984b;
        f163985c = bxvk.m124006a(bxcf, bxmu2, bxmu2, 125695875, bxzf.MESSAGE);
    }

    private bxmu() {
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
            return bxvk.m124022a(f163984b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bxms.f163983a});
        } else if (i2 == 3) {
            return new bxmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f163984b);
            }
            if (i2 == 5) {
                return f163984b;
            }
            bxxk bxxk = f163986e;
            if (bxxk == null) {
                synchronized (bxmu.class) {
                    bxxk = f163986e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163984b);
                        f163986e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
