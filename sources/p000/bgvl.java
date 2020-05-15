package p000;

/* renamed from: bgvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bgvl f117677g;

    /* renamed from: i */
    private static volatile bxxk f117678i;

    /* renamed from: a */
    public int f117679a;

    /* renamed from: b */
    public bgvr f117680b;

    /* renamed from: c */
    public bgoq f117681c;

    /* renamed from: d */
    public bvwq f117682d;

    /* renamed from: e */
    public bvxg f117683e;

    /* renamed from: f */
    public bvxr f117684f;

    /* renamed from: h */
    private byte f117685h = 2;

    static {
        bgvl bgvl = new bgvl();
        f117677g = bgvl;
        bxvk.m124024a(bgvl.class, bgvl);
    }

    private bgvl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f117685h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f117685h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f117677g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bgvl();
        } else {
            if (i2 == 4) {
                return new bxvd(f117677g);
            }
            if (i2 == 5) {
                return f117677g;
            }
            bxxk bxxk = f117678i;
            if (bxxk == null) {
                synchronized (bgvl.class) {
                    bxxk = f117678i;
                    if (bxxk == null) {
                        bxxk = new bxve(f117677g);
                        f117678i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
