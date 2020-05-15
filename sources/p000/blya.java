package p000;

/* renamed from: blya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blya extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blya f128184c;

    /* renamed from: e */
    private static volatile bxxk f128185e;

    /* renamed from: a */
    public String f128186a = "";

    /* renamed from: b */
    public String f128187b = "";

    /* renamed from: d */
    private int f128188d;

    static {
        blya blya = new blya();
        f128184c = blya;
        bxvk.m124024a(blya.class, blya);
    }

    private blya() {
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
            return bxvk.m124022a(f128184c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blya();
        } else {
            if (i2 == 4) {
                return new bxvd(f128184c);
            }
            if (i2 == 5) {
                return f128184c;
            }
            bxxk bxxk = f128185e;
            if (bxxk == null) {
                synchronized (blya.class) {
                    bxxk = f128185e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128184c);
                        f128185e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
