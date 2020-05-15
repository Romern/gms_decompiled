package p000;

/* renamed from: bxme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxme extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxme f163926c;

    /* renamed from: d */
    public static final bxvj f163927d;

    /* renamed from: e */
    private static volatile bxxk f163928e;

    /* renamed from: a */
    public int f163929a;

    /* renamed from: b */
    public int f163930b;

    static {
        bxme bxme = new bxme();
        f163926c = bxme;
        bxvk.m124024a(bxme.class, bxme);
        bxcf bxcf = bxcf.f162779a;
        bxme bxme2 = f163926c;
        f163927d = bxvk.m124006a(bxcf, bxme2, bxme2, 125695874, bxzf.MESSAGE);
    }

    private bxme() {
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
            return bxvk.m124022a(f163926c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxmc.f163925a});
        } else if (i2 == 3) {
            return new bxme();
        } else {
            if (i2 == 4) {
                return new bxvd(f163926c);
            }
            if (i2 == 5) {
                return f163926c;
            }
            bxxk bxxk = f163928e;
            if (bxxk == null) {
                synchronized (bxme.class) {
                    bxxk = f163928e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163926c);
                        f163928e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
