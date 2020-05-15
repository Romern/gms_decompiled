package p000;

/* renamed from: qgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final qgx f41269c;

    /* renamed from: f */
    private static volatile bxxk f41270f;

    /* renamed from: a */
    public ByteString f41271a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f41272b = ByteString.f164797b;

    /* renamed from: d */
    private int f41273d;

    /* renamed from: e */
    private byte f41274e = 2;

    static {
        qgx qgx = new qgx();
        f41269c = qgx;
        GeneratedMessageLite.m124024a(qgx.class, qgx);
    }

    private qgx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41274e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41274e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f41269c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔊ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new qgx();
        } else {
            if (i2 == 4) {
                return new bxvd(f41269c);
            }
            if (i2 == 5) {
                return f41269c;
            }
            bxxk bxxk = f41270f;
            if (bxxk == null) {
                synchronized (qgx.class) {
                    bxxk = f41270f;
                    if (bxxk == null) {
                        bxxk = new bxve(f41269c);
                        f41270f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
