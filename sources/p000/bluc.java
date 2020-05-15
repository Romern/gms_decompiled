package p000;

/* renamed from: bluc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bluc f127779g;

    /* renamed from: h */
    private static volatile bxxk f127780h;

    /* renamed from: a */
    public int f127781a;

    /* renamed from: b */
    public bltw f127782b;

    /* renamed from: c */
    public String f127783c = "";

    /* renamed from: d */
    public int f127784d;

    /* renamed from: e */
    public bxtx f127785e = bxtx.f164797b;

    /* renamed from: f */
    public String f127786f = "";

    static {
        bluc bluc = new bluc();
        f127779g = bluc;
        bxvk.m124024a(bluc.class, bluc);
    }

    private bluc() {
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
            return bxvk.m124022a(f127779g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", blty.f127761a, "e", "f"});
        } else if (i2 == 3) {
            return new bluc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127779g);
            }
            if (i2 == 5) {
                return f127779g;
            }
            bxxk bxxk = f127780h;
            if (bxxk == null) {
                synchronized (bluc.class) {
                    bxxk = f127780h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127779g);
                        f127780h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
