package p000;

/* renamed from: bqrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqrx f141492c;

    /* renamed from: d */
    private static volatile bxxk f141493d;

    /* renamed from: a */
    public ByteString f141494a = ByteString.f164797b;

    /* renamed from: b */
    public bqsl f141495b;

    static {
        bqrx bqrx = new bqrx();
        f141492c = bqrx;
        GeneratedMessageLite.m124024a(bqrx.class, bqrx);
    }

    private bqrx() {
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
            return GeneratedMessageLite.m124022a(f141492c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqrx();
        } else {
            if (i2 == 4) {
                return new bxvd(f141492c);
            }
            if (i2 == 5) {
                return f141492c;
            }
            bxxk bxxk = f141493d;
            if (bxxk == null) {
                synchronized (bqrx.class) {
                    bxxk = f141493d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141492c);
                        f141493d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
