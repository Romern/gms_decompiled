package p000;

/* renamed from: brzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzs extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final brzs f143779f;

    /* renamed from: h */
    private static volatile bxxk f143780h;

    /* renamed from: a */
    public int f143781a;

    /* renamed from: b */
    public String f143782b = "";

    /* renamed from: c */
    public String f143783c = "";

    /* renamed from: d */
    public ByteString f143784d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f143785e = ByteString.f164797b;

    /* renamed from: g */
    private int f143786g;

    static {
        brzs brzs = new brzs();
        f143779f = brzs;
        GeneratedMessageLite.m124024a(brzs.class, brzs);
    }

    private brzs() {
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
            return GeneratedMessageLite.m124022a(f143779f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ည\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new brzs();
        } else {
            if (i2 == 4) {
                return new bxvd(f143779f);
            }
            if (i2 == 5) {
                return f143779f;
            }
            bxxk bxxk = f143780h;
            if (bxxk == null) {
                synchronized (brzs.class) {
                    bxxk = f143780h;
                    if (bxxk == null) {
                        bxxk = new bxve(f143779f);
                        f143780h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
