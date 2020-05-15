package p000;

/* renamed from: bxiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxiy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxiy f163585d;

    /* renamed from: e */
    private static volatile bxxk f163586e;

    /* renamed from: a */
    public int f163587a;

    /* renamed from: b */
    public bxjc f163588b;

    /* renamed from: c */
    public bxqt f163589c;

    static {
        bxiy bxiy = new bxiy();
        f163585d = bxiy;
        bxvk.m124024a(bxiy.class, bxiy);
    }

    private bxiy() {
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
            return bxvk.m124022a(f163585d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f163585d);
            }
            if (i2 == 5) {
                return f163585d;
            }
            bxxk bxxk = f163586e;
            if (bxxk == null) {
                synchronized (bxiy.class) {
                    bxxk = f163586e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163585d);
                        f163586e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
