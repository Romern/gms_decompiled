package p000;

/* renamed from: aqgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqgo f86072d;

    /* renamed from: f */
    private static volatile bxxk f86073f;

    /* renamed from: a */
    public int f86074a;

    /* renamed from: b */
    public int f86075b;

    /* renamed from: c */
    public ByteString f86076c = ByteString.f164797b;

    /* renamed from: e */
    private byte f86077e = 2;

    static {
        aqgo aqgo = new aqgo();
        f86072d = aqgo;
        GeneratedMessageLite.m124024a(aqgo.class, aqgo);
    }

    private aqgo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f86077e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f86077e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f86072d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0003ည\u0002", new Object[]{"a", "b", aqgn.f86071a, "c"});
        } else if (i2 == 3) {
            return new aqgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f86072d);
            }
            if (i2 == 5) {
                return f86072d;
            }
            bxxk bxxk = f86073f;
            if (bxxk == null) {
                synchronized (aqgo.class) {
                    bxxk = f86073f;
                    if (bxxk == null) {
                        bxxk = new bxve(f86072d);
                        f86073f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
