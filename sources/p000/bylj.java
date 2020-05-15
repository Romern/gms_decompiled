package p000;

/* renamed from: bylj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bylj f166845f;

    /* renamed from: h */
    private static volatile bxxk f166846h;

    /* renamed from: a */
    public int f166847a;

    /* renamed from: b */
    public int f166848b;

    /* renamed from: c */
    public long f166849c;

    /* renamed from: d */
    public String f166850d = "";

    /* renamed from: e */
    public String f166851e = "";

    /* renamed from: g */
    private byte f166852g = 2;

    static {
        bylj bylj = new bylj();
        f166845f = bylj;
        bxvk.m124024a(bylj.class, bylj);
    }

    private bylj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166852g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166852g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166845f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔂ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bylj();
        } else {
            if (i2 == 4) {
                return new bxvd(f166845f);
            }
            if (i2 == 5) {
                return f166845f;
            }
            bxxk bxxk = f166846h;
            if (bxxk == null) {
                synchronized (bylj.class) {
                    bxxk = f166846h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166845f);
                        f166846h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
