package p000;

/* renamed from: bwkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwkc f159947g;

    /* renamed from: j */
    private static volatile bxxk f159948j;

    /* renamed from: a */
    public int f159949a = 0;

    /* renamed from: b */
    public Object f159950b;

    /* renamed from: c */
    public bwjx f159951c;

    /* renamed from: d */
    public bxwc f159952d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f159953e;

    /* renamed from: f */
    public bxwc f159954f = bxxn.f165040b;

    /* renamed from: h */
    private int f159955h;

    /* renamed from: i */
    private byte f159956i = 2;

    static {
        bwkc bwkc = new bwkc();
        f159947g = bwkc;
        bxvk.m124024a(bwkc.class, bwkc);
    }

    private bwkc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159956i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159956i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159947g, "\u0001\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0002\u0001\u0002ᐉ\u0001\u0003ြ\u0000\u0004\u001b\u0005ဇ\u0003\u0006\u001b", new Object[]{"b", "a", "h", "c", bwgw.class, "d", bwhd.class, "e", "f", bwhd.class});
        } else if (i2 == 3) {
            return new bwkc();
        } else {
            if (i2 == 4) {
                return new bxvd(f159947g);
            }
            if (i2 == 5) {
                return f159947g;
            }
            bxxk bxxk = f159948j;
            if (bxxk == null) {
                synchronized (bwkc.class) {
                    bxxk = f159948j;
                    if (bxxk == null) {
                        bxxk = new bxve(f159947g);
                        f159948j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
