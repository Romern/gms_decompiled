package p000;

/* renamed from: biwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final biwd f122072e;

    /* renamed from: g */
    private static volatile bxxk f122073g;

    /* renamed from: a */
    public int f122074a;

    /* renamed from: b */
    public String f122075b = "";

    /* renamed from: c */
    public bxwc f122076c = bxxn.f165040b;

    /* renamed from: d */
    public bxtx f122077d = bxtx.f164797b;

    /* renamed from: f */
    private byte f122078f = 2;

    static {
        biwd biwd = new biwd();
        f122072e = biwd;
        bxvk.m124024a(biwd.class, biwd);
    }

    private biwd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122078f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122078f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122072e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᔈ\u0000\u0002\u001a\u0003ည\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new biwd();
        } else {
            if (i2 == 4) {
                return new bxvd(f122072e);
            }
            if (i2 == 5) {
                return f122072e;
            }
            bxxk bxxk = f122073g;
            if (bxxk == null) {
                synchronized (biwd.class) {
                    bxxk = f122073g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122072e);
                        f122073g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
