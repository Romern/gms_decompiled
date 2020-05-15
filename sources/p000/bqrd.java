package p000;

/* renamed from: bqrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqrd f141422c;

    /* renamed from: d */
    private static volatile bxxk f141423d;

    /* renamed from: a */
    public int f141424a;

    /* renamed from: b */
    public ByteString f141425b = ByteString.f164797b;

    static {
        bqrd bqrd = new bqrd();
        f141422c = bqrd;
        GeneratedMessageLite.m124024a(bqrd.class, bqrd);
    }

    private bqrd() {
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
            return GeneratedMessageLite.m124022a(f141422c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqrd();
        } else {
            if (i2 == 4) {
                return new bxvd(f141422c);
            }
            if (i2 == 5) {
                return f141422c;
            }
            bxxk bxxk = f141423d;
            if (bxxk == null) {
                synchronized (bqrd.class) {
                    bxxk = f141423d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141422c);
                        f141423d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
