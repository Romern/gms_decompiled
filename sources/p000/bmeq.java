package p000;

/* renamed from: bmeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmeq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmeq f128990h;

    /* renamed from: j */
    private static volatile bxxk f128991j;

    /* renamed from: a */
    public int f128992a;

    /* renamed from: b */
    public bmdn f128993b;

    /* renamed from: c */
    public bmbt f128994c;

    /* renamed from: d */
    public bmbr f128995d;

    /* renamed from: e */
    public bmfu f128996e;

    /* renamed from: f */
    public bmjh f128997f;

    /* renamed from: g */
    public bxwc f128998g = bxxn.f165040b;

    /* renamed from: i */
    private byte f128999i = 2;

    static {
        bmeq bmeq = new bmeq();
        f128990h = bmeq;
        bxvk.m124024a(bmeq.class, bmeq);
    }

    private bmeq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128999i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128999i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128990h, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0001\u0001ဉ\u0002\u0002ᐉ\u0003\u0004ဉ\u0004\u0006ဉ\u0001\u0007\u001b\u000eဉ\u0000", new Object[]{"a", "d", "e", "f", "c", "g", bmkt.class, "b"});
        } else if (i2 == 3) {
            return new bmeq();
        } else {
            if (i2 == 4) {
                return new bxvd(f128990h);
            }
            if (i2 == 5) {
                return f128990h;
            }
            bxxk bxxk = f128991j;
            if (bxxk == null) {
                synchronized (bmeq.class) {
                    bxxk = f128991j;
                    if (bxxk == null) {
                        bxxk = new bxve(f128990h);
                        f128991j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
