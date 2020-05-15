package p000;

/* renamed from: bylw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bylw f166952e;

    /* renamed from: g */
    private static volatile bxxk f166953g;

    /* renamed from: a */
    public int f166954a;

    /* renamed from: b */
    public String f166955b = "";

    /* renamed from: c */
    public String f166956c = "";

    /* renamed from: d */
    public bxtx f166957d = bxtx.f164797b;

    /* renamed from: f */
    private byte f166958f = 2;

    static {
        bylw bylw = new bylw();
        f166952e = bylw;
        bxvk.m124024a(bylw.class, bylw);
    }

    private bylw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166958f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166958f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166952e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bylw();
        } else {
            if (i2 == 4) {
                return new bxvd(f166952e);
            }
            if (i2 == 5) {
                return f166952e;
            }
            bxxk bxxk = f166953g;
            if (bxxk == null) {
                synchronized (bylw.class) {
                    bxxk = f166953g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166952e);
                        f166953g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
