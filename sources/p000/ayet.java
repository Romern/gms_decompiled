package p000;

/* renamed from: ayet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayet extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ayet f97366f;

    /* renamed from: h */
    private static volatile bxxk f97367h;

    /* renamed from: a */
    public int f97368a;

    /* renamed from: b */
    public String f97369b = "";

    /* renamed from: c */
    public boolean f97370c;

    /* renamed from: d */
    public ByteString f97371d = ByteString.f164797b;

    /* renamed from: e */
    public String f97372e = "";

    /* renamed from: g */
    private byte f97373g = 2;

    static {
        ayet ayet = new ayet();
        f97366f = ayet;
        GeneratedMessageLite.m124024a(ayet.class, ayet);
    }

    private ayet() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97373g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97373g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97366f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔇ\u0001\u0003ᔊ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ayet();
        } else {
            if (i2 == 4) {
                return new bxvd(f97366f);
            }
            if (i2 == 5) {
                return f97366f;
            }
            bxxk bxxk = f97367h;
            if (bxxk == null) {
                synchronized (ayet.class) {
                    bxxk = f97367h;
                    if (bxxk == null) {
                        bxxk = new bxve(f97366f);
                        f97367h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
