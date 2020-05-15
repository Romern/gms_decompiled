package p000;

/* renamed from: bwhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwhv f159578e;

    /* renamed from: h */
    private static volatile bxxk f159579h;

    /* renamed from: a */
    public long f159580a;

    /* renamed from: b */
    public bxwc f159581b = bxxn.f165040b;

    /* renamed from: c */
    public String f159582c = "";

    /* renamed from: d */
    public String f159583d = "";

    /* renamed from: f */
    private int f159584f;

    /* renamed from: g */
    private byte f159585g = 2;

    static {
        bwhv bwhv = new bwhv();
        f159578e = bwhv;
        bxvk.m124024a(bwhv.class, bwhv);
    }

    private bwhv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159585g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159585g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159578e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဂ\u0000\u0002Л\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"f", "a", "b", bwhw.class, "c", "d"});
        } else if (i2 == 3) {
            return new bwhv();
        } else {
            if (i2 == 4) {
                return new bxvd(f159578e);
            }
            if (i2 == 5) {
                return f159578e;
            }
            bxxk bxxk = f159579h;
            if (bxxk == null) {
                synchronized (bwhv.class) {
                    bxxk = f159579h;
                    if (bxxk == null) {
                        bxxk = new bxve(f159578e);
                        f159579h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
