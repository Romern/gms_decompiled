package p000;

/* renamed from: bwku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwku extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bwku f160040h;

    /* renamed from: j */
    private static volatile bxxk f160041j;

    /* renamed from: a */
    public int f160042a;

    /* renamed from: b */
    public bmaq f160043b;

    /* renamed from: c */
    public bmav f160044c;

    /* renamed from: d */
    public bmar f160045d;

    /* renamed from: e */
    public bwkr f160046e;

    /* renamed from: f */
    public bxwc f160047f = bxxn.f165040b;

    /* renamed from: g */
    public int f160048g;

    /* renamed from: i */
    private byte f160049i = 2;

    static {
        bwku bwku = new bwku();
        f160040h = bwku;
        bxvk.m124024a(bwku.class, bwku);
    }

    private bwku() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160049i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160049i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160040h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဌ\u0004\u0006ဉ\u0002\u0007Л", new Object[]{"a", "b", "c", "e", "g", bwgz.m121953b(), "d", "f", bwkr.class});
        } else if (i2 == 3) {
            return new bwku();
        } else {
            if (i2 == 4) {
                return new bxvd(f160040h);
            }
            if (i2 == 5) {
                return f160040h;
            }
            bxxk bxxk = f160041j;
            if (bxxk == null) {
                synchronized (bwku.class) {
                    bxxk = f160041j;
                    if (bxxk == null) {
                        bxxk = new bxve(f160040h);
                        f160041j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
