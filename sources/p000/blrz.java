package p000;

/* renamed from: blrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrz extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blrz f127553f;

    /* renamed from: g */
    private static volatile bxxk f127554g;

    /* renamed from: a */
    public int f127555a;

    /* renamed from: b */
    public blse f127556b;

    /* renamed from: c */
    public bxtx f127557c = bxtx.f164797b;

    /* renamed from: d */
    public int f127558d;

    /* renamed from: e */
    public bxtx f127559e = bxtx.f164797b;

    static {
        blrz blrz = new blrz();
        f127553f = blrz;
        bxvk.m124024a(blrz.class, blrz);
    }

    private blrz() {
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
            return bxvk.m124022a(f127553f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", blry.f127552a, "e"});
        } else if (i2 == 3) {
            return new blrz();
        } else {
            if (i2 == 4) {
                return new bxvd(f127553f);
            }
            if (i2 == 5) {
                return f127553f;
            }
            bxxk bxxk = f127554g;
            if (bxxk == null) {
                synchronized (blrz.class) {
                    bxxk = f127554g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127553f);
                        f127554g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
