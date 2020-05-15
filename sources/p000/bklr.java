package p000;

/* renamed from: bklr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bklr f124834d;

    /* renamed from: e */
    private static volatile bxxk f124835e;

    /* renamed from: a */
    public int f124836a;

    /* renamed from: b */
    public String f124837b = "";

    /* renamed from: c */
    public String f124838c = "";

    static {
        bklr bklr = new bklr();
        f124834d = bklr;
        bxvk.m124024a(bklr.class, bklr);
    }

    private bklr() {
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
            return bxvk.m124022a(f124834d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bklr();
        } else {
            if (i2 == 4) {
                return new bxvd(f124834d);
            }
            if (i2 == 5) {
                return f124834d;
            }
            bxxk bxxk = f124835e;
            if (bxxk == null) {
                synchronized (bklr.class) {
                    bxxk = f124835e;
                    if (bxxk == null) {
                        bxxk = new bxve(f124834d);
                        f124835e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
