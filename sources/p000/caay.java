package p000;

/* renamed from: caay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caay extends bxvk implements bxxd {

    /* renamed from: f */
    public static final caay f172393f;

    /* renamed from: h */
    private static volatile bxxk f172394h;

    /* renamed from: a */
    public int f172395a;

    /* renamed from: b */
    public String f172396b = "";

    /* renamed from: c */
    public long f172397c;

    /* renamed from: d */
    public cabd f172398d;

    /* renamed from: e */
    public cack f172399e;

    /* renamed from: g */
    private byte f172400g = 2;

    static {
        caay caay = new caay();
        f172393f = caay;
        bxvk.m124024a(caay.class, caay);
    }

    private caay() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172400g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172400g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172393f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ဂ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new caay();
        } else {
            if (i2 == 4) {
                return new bxvd(f172393f);
            }
            if (i2 == 5) {
                return f172393f;
            }
            bxxk bxxk = f172394h;
            if (bxxk == null) {
                synchronized (caay.class) {
                    bxxk = f172394h;
                    if (bxxk == null) {
                        bxxk = new bxve(f172393f);
                        f172394h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
