package p000;

/* renamed from: bqkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqkw f141054d;

    /* renamed from: e */
    private static volatile bxxk f141055e;

    /* renamed from: a */
    public int f141056a;

    /* renamed from: b */
    public ByteString f141057b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f141058c = ByteString.f164797b;

    static {
        bqkw bqkw = new bqkw();
        f141054d = bqkw;
        GeneratedMessageLite.m124024a(bqkw.class, bqkw);
    }

    private bqkw() {
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
            return GeneratedMessageLite.m124022a(f141054d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f141054d);
            }
            if (i2 == 5) {
                return f141054d;
            }
            bxxk bxxk = f141055e;
            if (bxxk == null) {
                synchronized (bqkw.class) {
                    bxxk = f141055e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141054d);
                        f141055e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
