package p000;

/* renamed from: bivu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bivu f122044d;

    /* renamed from: g */
    private static volatile bxxk f122045g;

    /* renamed from: a */
    public int f122046a;

    /* renamed from: b */
    public birr f122047b;

    /* renamed from: c */
    public int f122048c;

    /* renamed from: e */
    private int f122049e;

    /* renamed from: f */
    private byte f122050f = 2;

    static {
        bivu bivu = new bivu();
        f122044d = bivu;
        bxvk.m124024a(bivu.class, bivu);
    }

    private bivu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122050f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122050f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122044d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᔄ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bivu();
        } else {
            if (i2 == 4) {
                return new bxvd(f122044d);
            }
            if (i2 == 5) {
                return f122044d;
            }
            bxxk bxxk = f122045g;
            if (bxxk == null) {
                synchronized (bivu.class) {
                    bxxk = f122045g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122044d);
                        f122045g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
