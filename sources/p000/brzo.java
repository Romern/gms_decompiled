package p000;

/* renamed from: brzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzo extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final brzo f143767h;

    /* renamed from: j */
    private static volatile bxxk f143768j;

    /* renamed from: a */
    public int f143769a;

    /* renamed from: b */
    public String f143770b = "";

    /* renamed from: c */
    public ByteString f143771c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f143772d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f143773e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f143774f = ByteString.f164797b;

    /* renamed from: g */
    public int f143775g;

    /* renamed from: i */
    private byte f143776i = 2;

    static {
        brzo brzo = new brzo();
        f143767h = brzo;
        GeneratedMessageLite.m124024a(brzo.class, brzo);
    }

    private brzo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143776i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143776i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f143767h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0001\u0004ᔊ\u0002\u0005ည\u0003\u0006ည\u0004\u0007ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", brzp.f143777a});
        } else if (i2 == 3) {
            return new brzo();
        } else {
            if (i2 == 4) {
                return new bxvd(f143767h);
            }
            if (i2 == 5) {
                return f143767h;
            }
            bxxk bxxk = f143768j;
            if (bxxk == null) {
                synchronized (brzo.class) {
                    bxxk = f143768j;
                    if (bxxk == null) {
                        bxxk = new bxve(f143767h);
                        f143768j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
