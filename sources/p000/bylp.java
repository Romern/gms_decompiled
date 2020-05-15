package p000;

/* renamed from: bylp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bylp f166903e;

    /* renamed from: g */
    private static volatile bxxk f166904g;

    /* renamed from: a */
    public int f166905a;

    /* renamed from: b */
    public String f166906b = "";

    /* renamed from: c */
    public String f166907c = "";

    /* renamed from: d */
    public byln f166908d;

    /* renamed from: f */
    private byte f166909f = 2;

    static {
        bylp bylp = new bylp();
        f166903e = bylp;
        bxvk.m124024a(bylp.class, bylp);
    }

    private bylp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166909f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166909f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166903e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bylp();
        } else {
            if (i2 == 4) {
                return new bxvd(f166903e);
            }
            if (i2 == 5) {
                return f166903e;
            }
            bxxk bxxk = f166904g;
            if (bxxk == null) {
                synchronized (bylp.class) {
                    bxxk = f166904g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166903e);
                        f166904g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
