package p000;

/* renamed from: bvya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvya extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvya f158125b;

    /* renamed from: d */
    private static volatile bxxk f158126d;

    /* renamed from: a */
    public bvxn f158127a;

    /* renamed from: c */
    private int f158128c;

    static {
        bvya bvya = new bvya();
        f158125b = bvya;
        bxvk.m124024a(bvya.class, bvya);
    }

    private bvya() {
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
            return bxvk.m124022a(f158125b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bvya();
        } else {
            if (i2 == 4) {
                return new bxvd(f158125b);
            }
            if (i2 == 5) {
                return f158125b;
            }
            bxxk bxxk = f158126d;
            if (bxxk == null) {
                synchronized (bvya.class) {
                    bxxk = f158126d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158125b);
                        f158126d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
