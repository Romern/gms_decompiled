package p000;

/* renamed from: blzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blzx f128415c;

    /* renamed from: d */
    private static volatile bxxk f128416d;

    /* renamed from: a */
    public int f128417a;

    /* renamed from: b */
    public String f128418b = "";

    static {
        blzx blzx = new blzx();
        f128415c = blzx;
        bxvk.m124024a(blzx.class, blzx);
    }

    private blzx() {
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
            return bxvk.m124022a(f128415c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f128415c);
            }
            if (i2 == 5) {
                return f128415c;
            }
            bxxk bxxk = f128416d;
            if (bxxk == null) {
                synchronized (blzx.class) {
                    bxxk = f128416d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128415c);
                        f128416d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
