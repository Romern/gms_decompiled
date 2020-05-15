package p000;

/* renamed from: bwhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhw extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwhw f159586i;

    /* renamed from: l */
    private static volatile bxxk f159587l;

    /* renamed from: a */
    public long f159588a;

    /* renamed from: b */
    public String f159589b = "";

    /* renamed from: c */
    public long f159590c;

    /* renamed from: d */
    public String f159591d = "";

    /* renamed from: e */
    public String f159592e = "";

    /* renamed from: f */
    public bxtx f159593f = bxtx.f164797b;

    /* renamed from: g */
    public bxwc f159594g = bxxn.f165040b;

    /* renamed from: h */
    public boolean f159595h;

    /* renamed from: j */
    private int f159596j;

    /* renamed from: k */
    private byte f159597k = 2;

    static {
        bwhw bwhw = new bwhw();
        f159586i = bwhw;
        bxvk.m124024a(bwhw.class, bwhw);
    }

    private bwhw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159597k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159597k = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159586i, "\u0001\b\u0000\u0001\u0002\n\b\u0000\u0001\u0001\u0002ဈ\u0004\u0003ဈ\u0005\u0004ည\u0006\u0006Л\u0007ဇ\b\bဂ\u0001\tဂ\u0003\nဈ\u0002", new Object[]{"j", "d", "e", "f", "g", bmeb.class, "h", "a", "c", "b"});
        } else if (i2 == 3) {
            return new bwhw();
        } else {
            if (i2 == 4) {
                return new bxvd(f159586i);
            }
            if (i2 == 5) {
                return f159586i;
            }
            bxxk bxxk = f159587l;
            if (bxxk == null) {
                synchronized (bwhw.class) {
                    bxxk = f159587l;
                    if (bxxk == null) {
                        bxxk = new bxve(f159586i);
                        f159587l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
