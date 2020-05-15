package p000;

/* renamed from: bxlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxlu f163891c;

    /* renamed from: d */
    public static final bxvj f163892d;

    /* renamed from: e */
    public static final bxvj f163893e;

    /* renamed from: g */
    private static volatile bxxk f163894g;

    /* renamed from: a */
    public bxwc f163895a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f163896b = bxxn.f165040b;

    /* renamed from: f */
    private byte f163897f = 2;

    static {
        bxlu bxlu = new bxlu();
        f163891c = bxlu;
        bxvk.m124024a(bxlu.class, bxlu);
        bxcf bxcf = bxcf.f162779a;
        bxlu bxlu2 = f163891c;
        f163892d = bxvk.m124006a(bxcf, bxlu2, bxlu2, 108026902, bxzf.MESSAGE);
        bygn bygn = bygn.f166357a;
        bxlu bxlu3 = f163891c;
        f163893e = bxvk.m124006a(bygn, bxlu3, bxlu3, 108026902, bxzf.MESSAGE);
    }

    private bxlu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f163897f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f163897f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f163891c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"a", bvnw.class, "b", bvoa.class});
        } else if (i2 == 3) {
            return new bxlu();
        } else {
            if (i2 == 4) {
                return new bxvd(f163891c);
            }
            if (i2 == 5) {
                return f163891c;
            }
            bxxk bxxk = f163894g;
            if (bxxk == null) {
                synchronized (bxlu.class) {
                    bxxk = f163894g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163891c);
                        f163894g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
