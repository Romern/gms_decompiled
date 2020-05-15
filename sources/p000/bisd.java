package p000;

/* renamed from: bisd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bisd f121509d;

    /* renamed from: f */
    private static volatile bxxk f121510f;

    /* renamed from: a */
    public int f121511a;

    /* renamed from: b */
    public int f121512b = 1;

    /* renamed from: c */
    public bioo f121513c;

    /* renamed from: e */
    private byte f121514e = 2;

    static {
        bisd bisd = new bisd();
        f121509d = bisd;
        bxvk.m124024a(bisd.class, bisd);
    }

    private bisd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121514e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121514e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121509d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", birv.m102769b(), "c"});
        } else if (i2 == 3) {
            return new bisd();
        } else {
            if (i2 == 4) {
                return new bxvd(f121509d);
            }
            if (i2 == 5) {
                return f121509d;
            }
            bxxk bxxk = f121510f;
            if (bxxk == null) {
                synchronized (bisd.class) {
                    bxxk = f121510f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121509d);
                        f121510f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
