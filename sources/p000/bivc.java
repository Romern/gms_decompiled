package p000;

/* renamed from: bivc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivc extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bivc f121939g;

    /* renamed from: h */
    private static volatile bxxk f121940h;

    /* renamed from: a */
    public int f121941a;

    /* renamed from: b */
    public ByteString f121942b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f121943c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f121944d = ByteString.f164797b;

    /* renamed from: e */
    public String f121945e = "";

    /* renamed from: f */
    public String f121946f = "";

    static {
        bivc bivc = new bivc();
        f121939g = bivc;
        GeneratedMessageLite.m124024a(bivc.class, bivc);
    }

    private bivc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121939g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bivc();
        } else {
            if (i2 == 4) {
                return new bxvd(f121939g);
            }
            if (i2 == 5) {
                return f121939g;
            }
            bxxk bxxk = f121940h;
            if (bxxk == null) {
                synchronized (bivc.class) {
                    bxxk = f121940h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121939g);
                        f121940h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
