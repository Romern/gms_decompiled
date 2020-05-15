package p000;

/* renamed from: bluf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bluf f127795b;

    /* renamed from: d */
    private static volatile bxxk f127796d;

    /* renamed from: a */
    public boolean f127797a;

    /* renamed from: c */
    private int f127798c;

    static {
        bluf bluf = new bluf();
        f127795b = bluf;
        bxvk.m124024a(bluf.class, bluf);
    }

    private bluf() {
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
            return bxvk.m124022a(f127795b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bluf();
        } else {
            if (i2 == 4) {
                return new bxvd(f127795b);
            }
            if (i2 == 5) {
                return f127795b;
            }
            bxxk bxxk = f127796d;
            if (bxxk == null) {
                synchronized (bluf.class) {
                    bxxk = f127796d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127795b);
                        f127796d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
