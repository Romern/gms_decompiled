package p000;

/* renamed from: btiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btiy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btiy f149054c;

    /* renamed from: d */
    private static volatile bxxk f149055d;

    /* renamed from: a */
    public String f149056a = "";

    /* renamed from: b */
    public bxtx f149057b = bxtx.f164797b;

    static {
        btiy btiy = new btiy();
        f149054c = btiy;
        bxvk.m124024a(btiy.class, btiy);
    }

    private btiy() {
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
            return bxvk.m124022a(f149054c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f149054c);
            }
            if (i2 == 5) {
                return f149054c;
            }
            bxxk bxxk = f149055d;
            if (bxxk == null) {
                synchronized (btiy.class) {
                    bxxk = f149055d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149054c);
                        f149055d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
