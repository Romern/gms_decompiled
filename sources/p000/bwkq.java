package p000;

/* renamed from: bwkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwkq f160000g;

    /* renamed from: i */
    private static volatile bxxk f160001i;

    /* renamed from: a */
    public int f160002a;

    /* renamed from: b */
    public bmav f160003b;

    /* renamed from: c */
    public bmaq f160004c;

    /* renamed from: d */
    public bmar f160005d;

    /* renamed from: e */
    public bwkr f160006e;

    /* renamed from: f */
    public bxwc f160007f = bxxn.f165040b;

    /* renamed from: h */
    private byte f160008h = 2;

    static {
        bwkq bwkq = new bwkq();
        f160000g = bwkq;
        bxvk.m124024a(bwkq.class, bwkq);
    }

    private bwkq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160008h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160008h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160000g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0002\u0005Л", new Object[]{"a", "b", "c", "e", "d", "f", bwkr.class});
        } else if (i2 == 3) {
            return new bwkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f160000g);
            }
            if (i2 == 5) {
                return f160000g;
            }
            bxxk bxxk = f160001i;
            if (bxxk == null) {
                synchronized (bwkq.class) {
                    bxxk = f160001i;
                    if (bxxk == null) {
                        bxxk = new bxve(f160000g);
                        f160001i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
