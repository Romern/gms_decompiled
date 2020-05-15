package p000;

/* renamed from: bivj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bivj f121995d;

    /* renamed from: g */
    private static volatile bxxk f121996g;

    /* renamed from: a */
    public String f121997a = "";

    /* renamed from: b */
    public bxvt f121998b = bxvm.f164965b;

    /* renamed from: c */
    public bxwc f121999c = bxxn.f165040b;

    /* renamed from: e */
    private int f122000e;

    /* renamed from: f */
    private byte f122001f = 2;

    static {
        bivj bivj = new bivj();
        f121995d = bivj;
        GeneratedMessageLite.m124024a(bivj.class, bivj);
    }

    private bivj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122001f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122001f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121995d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u0016\u0003Л", new Object[]{"e", "a", "b", "c", bivi.class});
        } else if (i2 == 3) {
            return new bivj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121995d);
            }
            if (i2 == 5) {
                return f121995d;
            }
            bxxk bxxk = f121996g;
            if (bxxk == null) {
                synchronized (bivj.class) {
                    bxxk = f121996g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121995d);
                        f121996g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
