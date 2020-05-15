package p000;

/* renamed from: blpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blpr f127278d;

    /* renamed from: h */
    private static volatile bxxk f127279h;

    /* renamed from: a */
    public blpq f127280a;

    /* renamed from: b */
    public blpq f127281b;

    /* renamed from: c */
    public blpq f127282c;

    /* renamed from: e */
    private int f127283e;

    /* renamed from: f */
    private blpq f127284f;

    /* renamed from: g */
    private byte f127285g = 2;

    static {
        blpr blpr = new blpr();
        f127278d = blpr;
        bxvk.m124024a(blpr.class, blpr);
    }

    private blpr() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127285g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127285g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127278d, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"e", "a", "b", "c", "f"});
        } else if (i2 == 3) {
            return new blpr();
        } else {
            if (i2 == 4) {
                return new bxvd(f127278d);
            }
            if (i2 == 5) {
                return f127278d;
            }
            bxxk bxxk = f127279h;
            if (bxxk == null) {
                synchronized (blpr.class) {
                    bxxk = f127279h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127278d);
                        f127279h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
