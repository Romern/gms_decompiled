package p000;

/* renamed from: blqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blqv f127409g;

    /* renamed from: i */
    private static volatile bxxk f127410i;

    /* renamed from: a */
    public int f127411a;

    /* renamed from: b */
    public bxwc f127412b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f127413c;

    /* renamed from: d */
    public blpr f127414d;

    /* renamed from: e */
    public boolean f127415e;

    /* renamed from: f */
    public blqw f127416f;

    /* renamed from: h */
    private byte f127417h = 2;

    static {
        blqv blqv = new blqv();
        f127409g = blqv;
        bxvk.m124024a(blqv.class, blqv);
    }

    private blqv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127417h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127417h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127409g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0002\u0002Л\u0003ဇ\u0001\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", blqu.class, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f127409g);
            }
            if (i2 == 5) {
                return f127409g;
            }
            bxxk bxxk = f127410i;
            if (bxxk == null) {
                synchronized (blqv.class) {
                    bxxk = f127410i;
                    if (bxxk == null) {
                        bxxk = new bxve(f127409g);
                        f127410i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
