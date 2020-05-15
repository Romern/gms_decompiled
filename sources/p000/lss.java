package p000;

/* renamed from: lss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lss extends bxvk implements bxxd {

    /* renamed from: d */
    public static final lss f32851d;

    /* renamed from: e */
    private static volatile bxxk f32852e;

    /* renamed from: a */
    public int f32853a;

    /* renamed from: b */
    public bxtx f32854b = bxtx.f164797b;

    /* renamed from: c */
    public bzxr f32855c;

    static {
        lss lss = new lss();
        f32851d = lss;
        bxvk.m124024a(lss.class, lss);
    }

    private lss() {
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
            return bxvk.m124022a(f32851d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new lss();
        } else {
            if (i2 == 4) {
                return new bxvd(f32851d);
            }
            if (i2 == 5) {
                return f32851d;
            }
            bxxk bxxk = f32852e;
            if (bxxk == null) {
                synchronized (lss.class) {
                    bxxk = f32852e;
                    if (bxxk == null) {
                        bxxk = new bxve(f32851d);
                        f32852e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
