package p000;

/* renamed from: aqgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final aqgk f86051f;

    /* renamed from: h */
    private static volatile bxxk f86052h;

    /* renamed from: a */
    public int f86053a;

    /* renamed from: b */
    public int f86054b;

    /* renamed from: c */
    public aqgm f86055c;

    /* renamed from: d */
    public aqgo f86056d;

    /* renamed from: e */
    public int f86057e;

    /* renamed from: g */
    private byte f86058g = 2;

    static {
        aqgk aqgk = new aqgk();
        f86051f = aqgk;
        GeneratedMessageLite.m124024a(aqgk.class, aqgk);
    }

    private aqgk() {
        ByteString bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f86058g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f86058g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f86051f, "\u0001\u0004\u0000\u0001\u0001G\u0004\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0004Gဌ\u0005", new Object[]{"a", "b", aqgj.f86050a, "c", "d", "e", aqgp.f86078a});
        } else if (i2 == 3) {
            return new aqgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f86051f);
            }
            if (i2 == 5) {
                return f86051f;
            }
            bxxk bxxk = f86052h;
            if (bxxk == null) {
                synchronized (aqgk.class) {
                    bxxk = f86052h;
                    if (bxxk == null) {
                        bxxk = new bxve(f86051f);
                        f86052h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
