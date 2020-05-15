package p000;

/* renamed from: bkkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bkkq f124602f;

    /* renamed from: i */
    private static volatile bxxk f124603i;

    /* renamed from: a */
    public int f124604a;

    /* renamed from: b */
    public String f124605b = "";

    /* renamed from: c */
    public String f124606c = "";

    /* renamed from: d */
    public int f124607d;

    /* renamed from: e */
    public bkll f124608e;

    /* renamed from: g */
    private String f124609g = "";

    /* renamed from: h */
    private byte f124610h = 2;

    static {
        bkkq bkkq = new bkkq();
        f124602f = bkkq;
        bxvk.m124024a(bkkq.class, bkkq);
    }

    private bkkq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124610h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124610h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f124602f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "g", "b", "c", "d", bsmm.m115979b(), "e"});
        } else if (i2 == 3) {
            return new bkkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f124602f);
            }
            if (i2 == 5) {
                return f124602f;
            }
            bxxk bxxk = f124603i;
            if (bxxk == null) {
                synchronized (bkkq.class) {
                    bxxk = f124603i;
                    if (bxxk == null) {
                        bxxk = new bxve(f124602f);
                        f124603i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
