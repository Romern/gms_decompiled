package p000;

/* renamed from: bygm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bygm f166352a;

    /* renamed from: e */
    private static volatile bxxk f166353e;

    /* renamed from: b */
    private int f166354b;

    /* renamed from: c */
    private ByteString f166355c = ByteString.f164797b;

    /* renamed from: d */
    private byte f166356d = 2;

    static {
        bygm bygm = new bygm();
        f166352a = bygm;
        GeneratedMessageLite.m124024a(bygm.class, bygm);
    }

    private bygm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166356d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166356d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166352a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᔊ\u0001", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bygm();
        } else {
            if (i2 == 4) {
                return new bxvd(f166352a);
            }
            if (i2 == 5) {
                return f166352a;
            }
            bxxk bxxk = f166353e;
            if (bxxk == null) {
                synchronized (bygm.class) {
                    bxxk = f166353e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166352a);
                        f166353e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
