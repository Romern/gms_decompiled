package p000;

/* renamed from: byly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byly extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byly f166965d;

    /* renamed from: f */
    private static volatile bxxk f166966f;

    /* renamed from: a */
    public int f166967a;

    /* renamed from: b */
    public long f166968b;

    /* renamed from: c */
    public String f166969c = "";

    /* renamed from: e */
    private byte f166970e = 2;

    static {
        byly byly = new byly();
        f166965d = byly;
        bxvk.m124024a(byly.class, byly);
    }

    private byly() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166970e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166970e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166965d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔂ\u0000\u0002ᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byly();
        } else {
            if (i2 == 4) {
                return new bxvd(f166965d);
            }
            if (i2 == 5) {
                return f166965d;
            }
            bxxk bxxk = f166966f;
            if (bxxk == null) {
                synchronized (byly.class) {
                    bxxk = f166966f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166965d);
                        f166966f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
