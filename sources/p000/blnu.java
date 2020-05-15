package p000;

/* renamed from: blnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blnu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blnu f127022e;

    /* renamed from: g */
    private static volatile bxxk f127023g;

    /* renamed from: a */
    public int f127024a;

    /* renamed from: b */
    public int f127025b;

    /* renamed from: c */
    public int f127026c;

    /* renamed from: d */
    public int f127027d;

    /* renamed from: f */
    private byte f127028f = 2;

    static {
        blnu blnu = new blnu();
        f127022e = blnu;
        bxvk.m124024a(blnu.class, blnu);
    }

    private blnu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127028f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127028f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127022e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blnu();
        } else {
            if (i2 == 4) {
                return new bxvd(f127022e);
            }
            if (i2 == 5) {
                return f127022e;
            }
            bxxk bxxk = f127023g;
            if (bxxk == null) {
                synchronized (blnu.class) {
                    bxxk = f127023g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127022e);
                        f127023g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
