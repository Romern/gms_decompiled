package p000;

/* renamed from: bkkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bkkk f124562b;

    /* renamed from: f */
    private static volatile bxxk f124563f;

    /* renamed from: a */
    public bxwc f124564a = bxxn.f165040b;

    /* renamed from: c */
    private int f124565c;

    /* renamed from: d */
    private String f124566d = "";

    /* renamed from: e */
    private byte f124567e = 2;

    static {
        bkkk bkkk = new bkkk();
        f124562b = bkkk;
        bxvk.m124024a(bkkk.class, bkkk);
    }

    private bkkk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124567e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124567e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f124562b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0002\u001b", new Object[]{"c", "d", "a", bklp.class});
        } else if (i2 == 3) {
            return new bkkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f124562b);
            }
            if (i2 == 5) {
                return f124562b;
            }
            bxxk bxxk = f124563f;
            if (bxxk == null) {
                synchronized (bkkk.class) {
                    bxxk = f124563f;
                    if (bxxk == null) {
                        bxxk = new bxve(f124562b);
                        f124563f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
