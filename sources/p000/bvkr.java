package p000;

/* renamed from: bvkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvkr f156460d;

    /* renamed from: e */
    private static volatile bxxk f156461e;

    /* renamed from: a */
    public bvkk f156462a;

    /* renamed from: b */
    public ByteString f156463b = ByteString.f164797b;

    /* renamed from: c */
    public bvku f156464c;

    static {
        bvkr bvkr = new bvkr();
        f156460d = bvkr;
        GeneratedMessageLite.m124024a(bvkr.class, bvkr);
    }

    private bvkr() {
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
            return GeneratedMessageLite.m124022a(f156460d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\n\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f156460d);
            }
            if (i2 == 5) {
                return f156460d;
            }
            bxxk bxxk = f156461e;
            if (bxxk == null) {
                synchronized (bvkr.class) {
                    bxxk = f156461e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156460d);
                        f156461e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
