package p000;

/* renamed from: bymb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymb extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bymb f166988g;

    /* renamed from: i */
    private static volatile bxxk f166989i;

    /* renamed from: a */
    public int f166990a;

    /* renamed from: b */
    public int f166991b;

    /* renamed from: c */
    public String f166992c = "";

    /* renamed from: d */
    public int f166993d;

    /* renamed from: e */
    public int f166994e;

    /* renamed from: f */
    public int f166995f;

    /* renamed from: h */
    private byte f166996h = 2;

    static {
        bymb bymb = new bymb();
        f166988g = bymb;
        bxvk.m124024a(bymb.class, bymb);
    }

    private bymb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166996h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166996h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166988g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bymb();
        } else {
            if (i2 == 4) {
                return new bxvd(f166988g);
            }
            if (i2 == 5) {
                return f166988g;
            }
            bxxk bxxk = f166989i;
            if (bxxk == null) {
                synchronized (bymb.class) {
                    bxxk = f166989i;
                    if (bxxk == null) {
                        bxxk = new bxve(f166988g);
                        f166989i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
