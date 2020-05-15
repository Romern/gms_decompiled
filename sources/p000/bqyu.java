package p000;

/* renamed from: bqyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyu extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bqyu f141991h;

    /* renamed from: j */
    private static volatile bxxk f141992j;

    /* renamed from: a */
    public int f141993a;

    /* renamed from: b */
    public long f141994b;

    /* renamed from: c */
    public cagb f141995c;

    /* renamed from: d */
    public String f141996d = "";

    /* renamed from: e */
    public bxtx f141997e = bxtx.f164797b;

    /* renamed from: f */
    public boolean f141998f;

    /* renamed from: g */
    public bqzo f141999g;

    /* renamed from: i */
    private byte f142000i = 2;

    static {
        bqyu bqyu = new bqyu();
        f141991h = bqyu;
        bxvk.m124024a(bqyu.class, bqyu);
    }

    private bqyu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142000i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142000i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f141991h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002ဂ\u0001\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ဇ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bqyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f141991h);
            }
            if (i2 == 5) {
                return f141991h;
            }
            bxxk bxxk = f141992j;
            if (bxxk == null) {
                synchronized (bqyu.class) {
                    bxxk = f141992j;
                    if (bxxk == null) {
                        bxxk = new bxve(f141991h);
                        f141992j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
