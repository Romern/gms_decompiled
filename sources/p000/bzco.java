package p000;

/* renamed from: bzco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzco extends bxvg implements bxvh {

    /* renamed from: f */
    public static final bzco f169385f;

    /* renamed from: i */
    private static volatile bxxk f169386i;

    /* renamed from: a */
    public int f169387a;

    /* renamed from: b */
    public bxwc f169388b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f169389c = bxxn.f165040b;

    /* renamed from: d */
    public String f169390d = "";

    /* renamed from: e */
    public bxwc f169391e;

    /* renamed from: g */
    private int f169392g;

    /* renamed from: h */
    private byte f169393h = 2;

    static {
        bzco bzco = new bzco();
        f169385f = bzco;
        bxvk.m124024a(bzco.class, bzco);
    }

    private bzco() {
        bxtx bxtx = bxtx.f164797b;
        this.f169391e = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169393h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169393h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169385f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0003\u0003\u0001ဌ\u0000\u0002Л\u0003Л\u0006ဈ\u0001\bЛ", new Object[]{"g", "a", bxbf.m122515b(), "b", byzv.class, "c", byzr.class, "d", "e", byyr.class});
        } else if (i2 == 3) {
            return new bzco();
        } else {
            if (i2 == 4) {
                return new bxvf(f169385f);
            }
            if (i2 == 5) {
                return f169385f;
            }
            bxxk bxxk = f169386i;
            if (bxxk == null) {
                synchronized (bzco.class) {
                    bxxk = f169386i;
                    if (bxxk == null) {
                        bxxk = new bxve(f169385f);
                        f169386i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
