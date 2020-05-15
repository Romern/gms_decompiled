package p000;

/* renamed from: bylx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bylx f166959d;

    /* renamed from: f */
    private static volatile bxxk f166960f;

    /* renamed from: a */
    public int f166961a;

    /* renamed from: b */
    public String f166962b = "";

    /* renamed from: c */
    public String f166963c = "";

    /* renamed from: e */
    private byte f166964e = 2;

    static {
        bylx bylx = new bylx();
        f166959d = bylx;
        GeneratedMessageLite.m124024a(bylx.class, bylx);
    }

    private bylx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166964e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166964e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166959d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bylx();
        } else {
            if (i2 == 4) {
                return new bxvd(f166959d);
            }
            if (i2 == 5) {
                return f166959d;
            }
            bxxk bxxk = f166960f;
            if (bxxk == null) {
                synchronized (bylx.class) {
                    bxxk = f166960f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166959d);
                        f166960f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
