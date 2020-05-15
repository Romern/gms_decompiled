package p000;

/* renamed from: bqmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqmu f141262d;

    /* renamed from: e */
    private static volatile bxxk f141263e;

    /* renamed from: a */
    public ByteString f141264a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f141265b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f141266c = ByteString.f164797b;

    static {
        bqmu bqmu = new bqmu();
        f141262d = bqmu;
        GeneratedMessageLite.m124024a(bqmu.class, bqmu);
    }

    private bqmu() {
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
            return GeneratedMessageLite.m124022a(f141262d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\n\u0003\n\u0004\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f141262d);
            }
            if (i2 == 5) {
                return f141262d;
            }
            bxxk bxxk = f141263e;
            if (bxxk == null) {
                synchronized (bqmu.class) {
                    bxxk = f141263e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141262d);
                        f141263e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
